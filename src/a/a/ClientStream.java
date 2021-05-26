package a.a;

import a.class_5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// $FF: renamed from: a.a.k
public class ClientStream extends class_5 implements Runnable {

   // $FF: renamed from: I java.io.InputStream
   private InputStream field_598;
   // $FF: renamed from: J java.io.OutputStream
   private OutputStream outstream;
   // $FF: renamed from: K java.net.Socket
   private Socket field_600;
   // $FF: renamed from: L boolean
   private boolean field_601;
   // $FF: renamed from: M byte[]
   private byte[] buffer;
   // $FF: renamed from: N int
   private int endOffset;
   // $FF: renamed from: O int
   private int offset;
   // $FF: renamed from: P boolean
   private boolean field_605;


   // $FF: renamed from: <init> (java.net.Socket, a.a.a) void
   public ClientStream(Socket var1, GameShell var2) throws IOException {
      super();
      this.field_601 = false;
      this.field_605 = true;
      this.field_600 = var1;
      this.field_598 = var1.getInputStream();
      this.outstream = var1.getOutputStream();
      this.field_605 = false;
      var2.method_21(this);
   }

   // $FF: renamed from: a () void
   public void closeStream() {
      super.closeStream();
      this.field_601 = true;

      try {
         if(this.field_598 != null) {
            this.field_598.close();
         }

         if(this.outstream != null) {
            this.outstream.close();
         }

         if(this.field_600 != null) {
            this.field_600.close();
         }
      } catch (IOException var5) {
         System.out.println("Error closing stream"); // authentic System.out.println
      }

      this.field_605 = true;
      synchronized(this) {

				try {
					this.notify();
				} catch (Throwable var4) {
					throw var4;
				}
			}

      this.buffer = null;
   }

   // $FF: renamed from: b () int
   public int read() throws IOException {
      return this.field_601?0:this.field_598.read();
   }

   // $FF: renamed from: c () int
   public int available() throws IOException {
      return this.field_601?0:this.field_598.available();
   }

   // $FF: renamed from: a (int, int, byte[]) void
   public void readStreamBytes(int var1, int var2, byte[] var3) throws IOException {
      if(!this.field_601) {
         int var4 = 0;
         boolean var5 = false;
         if(Surface.field_759 || var4 < var1) {
            do {
               int var6;
               if((var6 = this.field_598.read(var3, var4 + var2, var1 - var4)) <= 0) {
                  throw new IOException("EOF");
               }

               var4 += var6;
            } while(var4 < var1);

         }
      }
   }

   // $FF: renamed from: a (byte[], int, int) void
   public void writeStreamBytes(byte[] var1, int var2, int var3) throws IOException {
      if(!this.field_601) {
         if(this.buffer == null) {
            this.buffer = new byte[5000];
         }

         synchronized(this) {

					 try {
						 int var6 = 0;
						 if (Surface.field_759 || var6 < var3) {
							 do {
								 this.buffer[this.offset] = var1[var6 + var2];
								 this.offset = (this.offset + 1) % 5000;
								 if (this.offset == (this.endOffset + 4900) % 5000) {
									 throw new IOException("buffer overflow");
								 }

								 ++var6;
							 } while (var6 < var3);
						 }

						 this.notify();

					 } catch (Throwable var8) {
						 throw var8;
					 }
				 }

      }
   }

   public void run() {
      boolean var5 = Surface.field_759;
      if(var5 || !this.field_605) {
         do {


							int len;
							int off;
					 synchronized(this) {
							try {
								label126:
								{
									if (this.offset == this.endOffset) {
										try {
											this.wait();
										} catch (InterruptedException var10) {
											;
										}
									}

									if (this.field_605) {
										return;
									}

									off = this.endOffset;
									if (this.offset >= this.endOffset) {
										len = this.offset - this.endOffset;
										if (!var5) {
											break label126;
										}
									}

									len = 5000 - this.endOffset;
								}
							} catch (Throwable var13) {
								throw var13;
							}
						}
							if (len > 0) {
								try {
									this.outstream.write(this.buffer, off, len);
								} catch (IOException var12) {
									super.socketException = true;
									super.socketExceptionMessage = "Twriter:" + var12;
								}

								this.endOffset = (this.endOffset + len) % 5000;

								try {
									if (this.offset == this.endOffset) {
										this.outstream.flush();
									}
								} catch (IOException var11) {
									super.socketException = true;
									super.socketExceptionMessage = "Twriter:" + var11;
								}
							}

         } while(!this.field_605);

      }
   }
}
