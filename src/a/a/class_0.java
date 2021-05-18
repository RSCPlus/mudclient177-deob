package a.a;

import a.class_18;
import a.Utility;
import a.a.class_16;
import a.a.class_9;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.IndexColorModel;
import java.awt.image.MemoryImageSource;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

// $FF: renamed from: a.a.a
public class class_0 extends Applet implements Runnable {

   // $FF: renamed from: a int
   private int field_1;
   // $FF: renamed from: b int
   private int field_2;
   // $FF: renamed from: c java.lang.Thread
   private Thread field_3;
   // $FF: renamed from: d int
   private int field_4;
   // $FF: renamed from: e int
   private int field_5;
   // $FF: renamed from: f long[]
   private long[] field_6;
   // $FF: renamed from: g a.a.c
   public static class_16 field_7;
   // $FF: renamed from: h boolean
   private boolean field_8;
   // $FF: renamed from: i int
   private int field_9;
   // $FF: renamed from: j int
   private int field_10;
   // $FF: renamed from: k int
   public int field_11;
   // $FF: renamed from: l int
   public int lastMouseAction;
   // $FF: renamed from: m int
   public int field_13;
   // $FF: renamed from: n java.lang.String
   public String field_14;
   // $FF: renamed from: o boolean
   private boolean field_15;
   // $FF: renamed from: p int
   private int field_16;
   // $FF: renamed from: q java.lang.String
   private String field_17;
   // $FF: renamed from: r java.awt.Font
   private Font field_18;
   // $FF: renamed from: s java.awt.Font
   private Font field_19;
   // $FF: renamed from: t java.awt.Font
   private Font field_20;
   // $FF: renamed from: u java.awt.Image
   private Image field_21;
   // $FF: renamed from: v java.awt.Graphics
   private Graphics field_22;
   // $FF: renamed from: w java.lang.String
   private static String field_23;
   // $FF: renamed from: x boolean
   public boolean field_24;
   // $FF: renamed from: y boolean
   public boolean field_25;
   // $FF: renamed from: z boolean
   public boolean field_26;
   // $FF: renamed from: A boolean
   public boolean field_27;
   // $FF: renamed from: B boolean
   public boolean field_28;
   // $FF: renamed from: C boolean
   public boolean field_29;
   // $FF: renamed from: D boolean
   public boolean field_30;
   // $FF: renamed from: E boolean
   public boolean field_31;
   // $FF: renamed from: F int
   public int field_32;
   // $FF: renamed from: G int
   public int mouseX;
   // $FF: renamed from: H int
   public int mouseY;
   // $FF: renamed from: I int
   public int field_35;
   // $FF: renamed from: J int
   public int lastMouseButtonDown;
   // $FF: renamed from: K int
   public int field_37;
   // $FF: renamed from: L int
   public int field_38;
   // $FF: renamed from: M boolean
   public boolean field_39;
   // $FF: renamed from: N java.lang.String
   public String inputTextCurrent;
   // $FF: renamed from: O java.lang.String
   public String inputTextFinal;
   // $FF: renamed from: P java.lang.String
   public String field_42;
   // $FF: renamed from: Q java.lang.String
   public String field_43;


   // $FF: renamed from: a () void
   public void method_2() {}

   // $FF: renamed from: b () void
   public synchronized void method_3() {}

   // $FF: renamed from: c () void
   public void method_4() {}

   // $FF: renamed from: d () void
   public synchronized void method_5() {}

   // $FF: renamed from: e () void
   public void method_6() {}

   // $FF: renamed from: a (int, int, java.lang.String, boolean) void
   public final void method_7(int var1, int var2, String var3, boolean var4) {
      this.field_8 = true;
      System.out.println("Started application"); // authentic System.out.println
      this.field_1 = var1;
      this.field_2 = var2;
      field_7 = new class_16(this, var1, var2, var3, var4, false);
      this.field_13 = 1;
      this.field_3 = new Thread(this);
      this.field_3.start();
      this.field_3.setPriority(1);
   }

   // $FF: renamed from: f () boolean
   public final boolean method_8() {
      return this.field_8;
   }

   // $FF: renamed from: a (int) void
   public final void method_9(int var1) {
      this.field_4 = 1000 / var1;
   }

   // $FF: renamed from: g () void
   public final void method_10() {
      int var1 = 0;
      if(class_9.field_759 || var1 < 10) {
         do {
            this.field_6[var1] = 0L;
            ++var1;
         } while(var1 < 10);

      }
   }

   public synchronized boolean keyDown(Event var1, int var2) {
      boolean var5 = class_9.field_759;
      this.method_11(var2);
      this.field_37 = var2;
      this.field_38 = var2;
      this.lastMouseAction = 0;
      if(var2 == 1006) {
         this.field_26 = true;
      }

      if(var2 == 1007) {
         this.field_27 = true;
      }

      if(var2 == 1004) {
         this.field_28 = true;
      }

      if(var2 == 1005) {
         this.field_29 = true;
      }

      if((char)var2 == 32) {
         this.field_30 = true;
      }

      if((char)var2 == 110 || (char)var2 == 109) {
         this.field_31 = true;
      }

      if((char)var2 == 78 || (char)var2 == 77) {
         this.field_31 = true;
      }

      if((char)var2 == 123) {
         this.field_24 = true;
      }

      if((char)var2 == 125) {
         this.field_25 = true;
      }

      if((char)var2 == 1008) {
         this.field_39 = !this.field_39;
      }

      boolean var3 = false;
      int var4 = 0;
      if(var5 || var4 < field_23.length()) {
         do {
            if(var2 == field_23.charAt(var4)) {
               var3 = true;
               if(!var5) {
                  break;
               }
            }

            ++var4;
         } while(var4 < field_23.length());
      }

      if(var3 && this.inputTextCurrent.length() < 20) {
         this.inputTextCurrent = this.inputTextCurrent + (char)var2;
      }

      if(var3 && this.field_42.length() < 80) {
         this.field_42 = this.field_42 + (char)var2;
      }

      if(var2 == 8 && this.inputTextCurrent.length() > 0) {
         this.inputTextCurrent = this.inputTextCurrent.substring(0, this.inputTextCurrent.length() - 1);
      }

      if(var2 == 8 && this.field_42.length() > 0) {
         this.field_42 = this.field_42.substring(0, this.field_42.length() - 1);
      }

      if(var2 == 10 || var2 == 13) {
         this.inputTextFinal = this.inputTextCurrent;
         this.field_43 = this.field_42;
      }

      return true;
   }

   // $FF: renamed from: b (int) void
   public void method_11(int var1) {}

   public synchronized boolean keyUp(Event var1, int var2) {
      this.field_37 = 0;
      if(var2 == 1006) {
         this.field_26 = false;
      }

      if(var2 == 1007) {
         this.field_27 = false;
      }

      if(var2 == 1004) {
         this.field_28 = false;
      }

      if(var2 == 1005) {
         this.field_29 = false;
      }

      if((char)var2 == 32) {
         this.field_30 = false;
      }

      if((char)var2 == 110 || (char)var2 == 109) {
         this.field_31 = false;
      }

      if((char)var2 == 78 || (char)var2 == 77) {
         this.field_31 = false;
      }

      if((char)var2 == 123) {
         this.field_24 = false;
      }

      if((char)var2 == 125) {
         this.field_25 = false;
      }

      return true;
   }

   public synchronized boolean mouseMove(Event var1, int var2, int var3) {
      this.mouseX = var2;
      this.mouseY = var3 + this.field_11;
      this.field_35 = 0;
      this.lastMouseAction = 0;
      return true;
   }

   public synchronized boolean mouseUp(Event var1, int var2, int var3) {
      this.mouseX = var2;
      this.mouseY = var3 + this.field_11;
      this.field_35 = 0;
      return true;
   }

   public synchronized boolean mouseDown(Event var1, int var2, int var3) {
      label11: {
         this.mouseX = var2;
         this.mouseY = var3 + this.field_11;
         if(var1.metaDown()) {
            this.field_35 = 2;
            if(!class_9.field_759) {
               break label11;
            }
         }

         this.field_35 = 1;
      }

      this.lastMouseButtonDown = this.field_35;
      this.lastMouseAction = 0;
      this.method_12(this.field_35, var2, var3);
      return true;
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_12(int var1, int var2, int var3) {}

   public synchronized boolean mouseDrag(Event var1, int var2, int var3) {
      this.mouseX = var2;
      this.mouseY = var3 + this.field_11;
      if(var1.metaDown()) {
         this.field_35 = 2;
         if(!class_9.field_759) {
            return true;
         }
      }

      this.field_35 = 1;
      return true;
   }

   public final void init() {
      this.field_8 = true;
      System.out.println("Started applet"); // authentic System.out.println
      this.field_1 = 512;
      this.field_2 = 344;
      this.field_13 = 1;
      Utility.field_1007 = this.getCodeBase();
      this.method_21(this);
   }

   public final void start() {
      if(this.field_9 >= 0) {
         this.field_9 = 0;
      }

   }

   public final void stop() {
      if(this.field_9 >= 0) {
         this.field_9 = 4000 / this.field_4;
      }

   }

   public final void destroy() {
      this.field_9 = -1;

      try {
         Thread.sleep(5000L);
      } catch (Exception var1) {
         ;
      }

      if(this.field_9 == -1) {
         System.out.println("5 seconds expired, forcing kill"); // authentic System.out.println
         this.method_13();
         if(this.field_3 != null) {
            this.field_3.stop();
            this.field_3 = null;
         }
      }

   }

   // $FF: renamed from: h () void
   public final void method_13() {
      this.field_9 = -2;
      System.out.println("Closing program"); // authentic System.out.println
      this.method_4();

      try {
         Thread.sleep(1000L);
      } catch (Exception var1) {
         ;
      }

      if(field_7 != null) {
         field_7.dispose();
      }

      if(!this.field_8) {
         System.exit(0);
      }

   }

   public final void run() {
      boolean var11 = class_9.field_759;
      if(this.field_13 == 1) {
         this.field_13 = 2;
         this.field_22 = this.getGraphics();
         this.method_14();
         this.method_15(0, "Loading...");
         this.method_2();
         this.field_13 = 0;
      }

      int var3 = 0;
      int var4 = 256;
      int var5 = 1;
      int var6 = 0;
      int var7 = 0;
      if(var11 || var7 < 10) {
         do {
            this.field_6[var7] = System.currentTimeMillis();
            ++var7;
         } while(var7 < 10);
      }

      long var1 = System.currentTimeMillis();
      if(!var11 && this.field_9 < 0) {
         if(this.field_9 == -1) {
            this.method_13();
         }

         this.field_3 = null;
      } else {
         do {
            if(this.field_9 > 0) {
               --this.field_9;
               if(this.field_9 == 0) {
                  this.method_13();
                  this.field_3 = null;
                  return;
               }
            }

            label88: {
               int var8 = var4;
               int var9 = var5;
               var4 = 300;
               var5 = 1;
               var1 = System.currentTimeMillis();
               if(this.field_6[var3] == 0L) {
                  var4 = var8;
                  var5 = var9;
                  if(!var11) {
                     break label88;
                  }
               }

               if(var1 > this.field_6[var3]) {
                  var4 = (int)((long)(2560 * this.field_4) / (var1 - this.field_6[var3]));
               }
            }

            if(var4 < 25) {
               var4 = 25;
            }

            if(var4 > 256) {
               var4 = 256;
               var5 = (int)((long)this.field_4 - (var1 - this.field_6[var3]) / 10L);
               if(var5 < this.field_32) {
                  var5 = this.field_32;
               }
            }

            try {
               Thread.sleep((long)var5);
            } catch (InterruptedException var12) {
               ;
            }

            this.field_6[var3] = var1;
            var3 = (var3 + 1) % 10;
            int var10;
            if(var5 > 1) {
               var10 = 0;
               if(var11 || var10 < 10) {
                  do {
                     if(this.field_6[var10] != 0L) {
                        this.field_6[var10] += (long)var5;
                     }

                     ++var10;
                  } while(var10 < 10);
               }
            }

            var10 = 0;
            if(var11 || var6 < 256) {
               do {
                  this.method_3();
                  var6 += var4;
                  ++var10;
                  if(var10 > this.field_5) {
                     var6 = 0;
                     this.field_10 += 6;
                     if(this.field_10 <= 25) {
                        break;
                     }

                     this.field_10 = 0;
                     this.field_39 = true;
                     if(!var11) {
                        break;
                     }
                  }
               } while(var6 < 256);
            }

            --this.field_10;
            var6 &= 255;
            this.method_5();
         } while(this.field_9 >= 0);

         if(this.field_9 == -1) {
            this.method_13();
         }

         this.field_3 = null;
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void paint(Graphics var1) {
      if(this.field_13 == 2 && this.field_21 != null) {
         this.method_15(this.field_16, this.field_17);
      } else {
         if(this.field_13 == 0) {
            this.method_6();
         }

      }
   }

   // $FF: renamed from: i () void
   public void method_14() {
      this.field_22.setColor(Color.black);
      this.field_22.fillRect(0, 0, this.field_1, this.field_2);
      byte[] var1 = this.method_19("jagex.jag", "Jagex library", 0);
      if(var1 != null) {
         byte[] var2 = Utility.loadData("logo.tga", 0, var1);
         this.field_21 = this.method_18(var2);
         class_9.method_263(Utility.loadData("h11p.jf", 0, var1));
         class_9.method_263(Utility.loadData("h12b.jf", 0, var1));
         class_9.method_263(Utility.loadData("h12p.jf", 0, var1));
         class_9.method_263(Utility.loadData("h13b.jf", 0, var1));
         class_9.method_263(Utility.loadData("h14b.jf", 0, var1));
         class_9.method_263(Utility.loadData("h16b.jf", 0, var1));
         class_9.method_263(Utility.loadData("h20b.jf", 0, var1));
         class_9.method_263(Utility.loadData("h24b.jf", 0, var1));
      }
   }

   // $FF: renamed from: a (int, java.lang.String) void
   public void method_15(int var1, String var2) {
      try {
         int var3 = (this.field_1 - 281) / 2;
         int var4 = (this.field_2 - 148) / 2;
         this.field_22.setColor(Color.black);
         this.field_22.fillRect(0, 0, this.field_1, this.field_2);
         if(!this.field_15) {
            this.field_22.drawImage(this.field_21, var3, var4, this);
         }

         var3 += 2;
         var4 += 90;
         this.field_16 = var1;
         this.field_17 = var2;
         this.field_22.setColor(new Color(132, 132, 132));
         if(this.field_15) {
            this.field_22.setColor(new Color(220, 0, 0));
         }

         this.field_22.drawRect(var3 - 2, var4 - 2, 280, 23);
         this.field_22.fillRect(var3, var4, 277 * var1 / 100, 20);
         this.field_22.setColor(new Color(198, 198, 198));
         if(this.field_15) {
            this.field_22.setColor(new Color(255, 255, 255));
         }

         label26: {
            this.method_17(this.field_22, var2, this.field_18, var3 + 138, var4 + 10);
            if(!this.field_15) {
               this.method_17(this.field_22, "Created by JAGeX - visit www.jagex.com", this.field_19, var3 + 138, var4 + 30);
               this.method_17(this.field_22, "©2001-2002 Andrew Gower and Jagex Ltd", this.field_19, var3 + 138, var4 + 44);
               if(!class_9.field_759) {
                  break label26;
               }
            }

            this.field_22.setColor(new Color(132, 132, 152));
            this.method_17(this.field_22, "©2001-2002 Andrew Gower and Jagex Ltd", this.field_20, var3 + 138, this.field_2 - 20);
         }

         if(this.field_14 != null) {
            this.field_22.setColor(Color.white);
            this.method_17(this.field_22, this.field_14, this.field_19, var3 + 138, var4 - 120);
            return;
         }
      } catch (Exception var5) {
         ;
      }

   }

   // $FF: renamed from: b (int, java.lang.String) void
   public void method_16(int var1, String var2) {
      try {
         int var3 = (this.field_1 - 281) / 2;
         int var4 = (this.field_2 - 148) / 2;
         var3 += 2;
         var4 += 90;
         this.field_16 = var1;
         this.field_17 = var2;
         int var5 = 277 * var1 / 100;
         this.field_22.setColor(new Color(132, 132, 132));
         if(this.field_15) {
            this.field_22.setColor(new Color(220, 0, 0));
         }

         this.field_22.fillRect(var3, var4, var5, 20);
         this.field_22.setColor(Color.black);
         this.field_22.fillRect(var3 + var5, var4, 277 - var5, 20);
         this.field_22.setColor(new Color(198, 198, 198));
         if(this.field_15) {
            this.field_22.setColor(new Color(255, 255, 255));
         }

         this.method_17(this.field_22, var2, this.field_18, var3 + 138, var4 + 10);
      } catch (Exception var6) {
         ;
      }
   }

   // $FF: renamed from: a (java.awt.Graphics, java.lang.String, java.awt.Font, int, int) void
   public void method_17(Graphics var1, String var2, Font var3, int var4, int var5) {
      Object var6;
      label11: {
         if(field_7 == null) {
            var6 = this;
            if(!class_9.field_759) {
               break label11;
            }
         }

         var6 = field_7;
      }

      FontMetrics var7 = ((Component)var6).getFontMetrics(var3);
      var7.stringWidth(var2);
      var1.setFont(var3);
      var1.drawString(var2, var4 - var7.stringWidth(var2) / 2, var5 + var7.getHeight() / 4);
   }

   // $FF: renamed from: a (byte[]) java.awt.Image
   public Image method_18(byte[] var1) {
      boolean var14 = class_9.field_759;
      int var2 = var1[13] * 256 + var1[12];
      int var3 = var1[15] * 256 + var1[14];
      byte[] var4 = new byte[256];
      byte[] var5 = new byte[256];
      byte[] var6 = new byte[256];
      int var7 = 0;
      if(var14 || var7 < 256) {
         do {
            var4[var7] = var1[20 + var7 * 3];
            var5[var7] = var1[19 + var7 * 3];
            var6[var7] = var1[18 + var7 * 3];
            ++var7;
         } while(var7 < 256);
      }

      IndexColorModel var8 = new IndexColorModel(8, 256, var4, var5, var6);
      byte[] var9 = new byte[var2 * var3];
      int var10 = 0;
      int var11 = var3 - 1;
      Image var13;
      MemoryImageSource var15;
      if(!var14 && var11 < 0) {
         var15 = new MemoryImageSource(var2, var3, var8, var9, 0, var2);
         var13 = this.createImage(var15);
         return var13;
      } else {
         do {
            int var12 = 0;
            if(!var14 && var12 >= var2) {
               --var11;
            } else {
               do {
                  var9[var10++] = var1[786 + var12 + var11 * var2];
                  ++var12;
               } while(var12 < var2);

               --var11;
            }
         } while(var11 >= 0);

         var15 = new MemoryImageSource(var2, var3, var8, var9, 0, var2);
         var13 = this.createImage(var15);
         return var13;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, int) byte[]
   public byte[] method_19(String var1, String var2, int var3) {
      System.out.println("Using default load"); // authentic System.out.println
      int var4 = 0;
      int var5 = 0;
      byte[] var6 = null;

      try {
         this.method_16(var3, "Loading " + var2 + " - 0%");
         InputStream var7 = Utility.method_443(var1);
         DataInputStream var8 = new DataInputStream(var7);
         byte[] var9 = new byte[6];
         var8.readFully(var9, 0, 6);
         var4 = ((var9[0] & 255) << 16) + ((var9[1] & 255) << 8) + (var9[2] & 255);
         var5 = ((var9[3] & 255) << 16) + ((var9[4] & 255) << 8) + (var9[5] & 255);
         this.method_16(var3, "Loading " + var2 + " - 5%");
         int var10 = 0;
         var6 = new byte[var5];
         if(class_9.field_759 || var10 < var5) {
            do {
               int var11 = var5 - var10;
               if(var11 > 1000) {
                  var11 = 1000;
               }

               var8.readFully(var6, var10, var11);
               var10 += var11;
               this.method_16(var3, "Loading " + var2 + " - " + (5 + var10 * 95 / var5) + "%");
            } while(var10 < var5);
         }

         var8.close();
      } catch (IOException var12) {
         ;
      }

      this.method_16(var3, "Unpacking " + var2);
      if(var5 != var4) {
         byte[] var13 = new byte[var4];
         class_18.method_397(var13, var4, var6, var5, 0);
         return var13;
      } else {
         return var6;
      }
   }

   public Graphics getGraphics() {
      return field_7 != null?field_7.getGraphics():super.getGraphics();
   }

   public Image createImage(int var1, int var2) {
      return field_7 != null?field_7.createImage(var1, var2):super.createImage(var1, var2);
   }

   public URL getCodeBase() {
      return super.getCodeBase();
   }

   public URL getDocumentBase() {
      return super.getDocumentBase();
   }

   public String getParameter(String var1) {
      return super.getParameter(var1);
   }

   // $FF: renamed from: a (java.lang.String, int) java.net.Socket
   public Socket connect(String address, int port) throws IOException {
      Socket sock;
      label11: {
         if(this.method_8()) {
            sock = new Socket(InetAddress.getByName(this.getCodeBase().getHost()), port);
            if(!class_9.field_759) {
               break label11;
            }
         }

         sock = new Socket(InetAddress.getByName(address), port);
      }

      sock.setSoTimeout(30000);
      sock.setTcpNoDelay(true);
      return sock;
   }

   // $FF: renamed from: a (java.lang.Runnable) void
   public void method_21(Runnable var1) {
      Thread var2 = new Thread(var1);
      var2.setDaemon(true);
      var2.start();
   }

   // $FF: renamed from: <init> () void
   public class_0() {
      super();
      this.field_1 = 512;
      this.field_2 = 384;
      this.field_4 = 20;
      this.field_5 = 1000;
      this.field_6 = new long[10];
      this.field_13 = 1;
      this.field_15 = false;
      this.field_17 = "Loading";
      this.field_18 = new Font("TimesRoman", 0, 15);
      this.field_19 = new Font("Helvetica", 1, 13);
      this.field_20 = new Font("Helvetica", 0, 12);
      this.field_24 = false;
      this.field_25 = false;
      this.field_26 = false;
      this.field_27 = false;
      this.field_28 = false;
      this.field_29 = false;
      this.field_30 = false;
      this.field_31 = false;
      this.field_32 = 1;
      this.field_39 = false;
      this.inputTextCurrent = "";
      this.inputTextFinal = "";
      this.field_42 = "";
      this.field_43 = "";
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_7 = null;
      field_23 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ";
   }
}
