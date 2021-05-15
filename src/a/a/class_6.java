package a.a;

import a.class_5;
import a.a.class_0;
import a.a.class_9;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// $FF: renamed from: a.a.k
public class class_6 extends class_5 implements Runnable {

   // $FF: renamed from: I java.io.InputStream
   private InputStream field_598;
   // $FF: renamed from: J java.io.OutputStream
   private OutputStream field_599;
   // $FF: renamed from: K java.net.Socket
   private Socket field_600;
   // $FF: renamed from: L boolean
   private boolean field_601;
   // $FF: renamed from: M byte[]
   private byte[] field_602;
   // $FF: renamed from: N int
   private int field_603;
   // $FF: renamed from: O int
   private int field_604;
   // $FF: renamed from: P boolean
   private boolean field_605;


   // $FF: renamed from: <init> (java.net.Socket, a.a.a) void
   public class_6(Socket var1, class_0 var2) throws IOException {
      super();
      this.field_601 = false;
      this.field_605 = true;
      this.field_600 = var1;
      this.field_598 = var1.getInputStream();
      this.field_599 = var1.getOutputStream();
      this.field_605 = false;
      var2.method_21(this);
   }

   // $FF: renamed from: a () void
   public void method_143() {
      super.method_143();
      this.field_601 = true;

      try {
         if(this.field_598 != null) {
            this.field_598.close();
         }

         if(this.field_599 != null) {
            this.field_599.close();
         }

         if(this.field_600 != null) {
            this.field_600.close();
         }
      } catch (IOException var5) {
         System.out.println("Error closing stream");
      }

      this.field_605 = true;
      synchronized(this){}

      try {
         this.notify();
      } catch (Throwable var4) {
         throw var4;
      }

      this.field_602 = null;
   }

   // $FF: renamed from: b () int
   public int method_144() throws IOException {
      return this.field_601?0:this.field_598.read();
   }

   // $FF: renamed from: c () int
   public int method_145() throws IOException {
      return this.field_601?0:this.field_598.available();
   }

   // $FF: renamed from: a (int, int, byte[]) void
   public void method_146(int var1, int var2, byte[] var3) throws IOException {
      if(!this.field_601) {
         int var4 = 0;
         boolean var5 = false;
         if(class_9.field_759 || var4 < var1) {
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
   public void method_147(byte[] var1, int var2, int var3) throws IOException {
      if(!this.field_601) {
         if(this.field_602 == null) {
            this.field_602 = new byte[5000];
         }

         synchronized(this){}

         try {
            int var6 = 0;
            if(class_9.field_759 || var6 < var3) {
               do {
                  this.field_602[this.field_604] = var1[var6 + var2];
                  this.field_604 = (this.field_604 + 1) % 5000;
                  if(this.field_604 == (this.field_603 + 4900) % 5000) {
                     throw new IOException("buffer overflow");
                  }

                  ++var6;
               } while(var6 < var3);
            }

            this.notify();
         } catch (Throwable var8) {
            throw var8;
         }

      }
   }

   public void run() {
      boolean var5 = class_9.field_759;
      if(var5 || !this.field_605) {
         do {
            synchronized(this){}

            int var1;
            int var2;
            try {
               label126: {
                  if(this.field_604 == this.field_603) {
                     try {
                        this.wait();
                     } catch (InterruptedException var10) {
                        ;
                     }
                  }

                  if(this.field_605) {
                     return;
                  }

                  var2 = this.field_603;
                  if(this.field_604 >= this.field_603) {
                     var1 = this.field_604 - this.field_603;
                     if(!var5) {
                        break label126;
                     }
                  }

                  var1 = 5000 - this.field_603;
               }
            } catch (Throwable var13) {
               throw var13;
            }

            if(var1 > 0) {
               try {
                  this.field_599.write(this.field_602, var2, var1);
               } catch (IOException var12) {
                  super.field_573 = true;
                  super.field_574 = "Twriter:" + var12;
               }

               this.field_603 = (this.field_603 + var1) % 5000;

               try {
                  if(this.field_604 == this.field_603) {
                     this.field_599.flush();
                  }
               } catch (IOException var11) {
                  super.field_573 = true;
                  super.field_574 = "Twriter:" + var11;
               }
            }
         } while(!this.field_605);

      }
   }
}
