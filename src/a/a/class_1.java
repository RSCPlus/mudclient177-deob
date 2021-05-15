package a.a;

import a.class_20;
import a.class_21;
import a.class_22;
import a.a.class_0;
import a.a.class_6;
import a.a.class_9;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import java.math.BigInteger;

// $FF: renamed from: a.a.b
public class class_1 extends class_0 {

   // $FF: renamed from: R java.lang.String[]
   public static String[] field_44;
   // $FF: renamed from: S int
   public static int field_45;
   // $FF: renamed from: T int
   public static int field_46;
   // $FF: renamed from: U java.lang.String
   public String field_47;
   // $FF: renamed from: V int
   public int field_48;
   // $FF: renamed from: W java.lang.String
   String field_49;
   // $FF: renamed from: X java.lang.String
   String field_50;
   // $FF: renamed from: Y a.a.k
   public class_6 field_51;
   // $FF: renamed from: Z byte[]
   byte[] field_52;
   // $FF: renamed from: ba int
   int field_53;
   // $FF: renamed from: bb long
   long field_54;
   // $FF: renamed from: bc int
   public int field_55;
   // $FF: renamed from: bd long[]
   public long[] field_56;
   // $FF: renamed from: be int[]
   public int[] field_57;
   // $FF: renamed from: bf int
   public int field_58;
   // $FF: renamed from: bg long[]
   public long[] field_59;
   // $FF: renamed from: bh int
   public int field_60;
   // $FF: renamed from: bi int
   public int field_61;
   // $FF: renamed from: bj int
   public int field_62;
   // $FF: renamed from: bk int
   public int field_63;
   // $FF: renamed from: bl java.math.BigInteger
   public BigInteger field_64;
   // $FF: renamed from: bm java.math.BigInteger
   public BigInteger field_65;
   // $FF: renamed from: bn int
   public int field_66;
   // $FF: renamed from: bo int
   public int field_67;
   // $FF: renamed from: bp int[]
   public static final int[] field_68;


   // $FF: renamed from: a (java.math.BigInteger, java.math.BigInteger) void
   public void method_24(BigInteger var1, BigInteger var2) {
      this.field_64 = var1;
      this.field_65 = var2;
   }

   // $FF: renamed from: j () int
   public int method_25() {
      return 0;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, boolean) void
   public void method_26(String var1, String var2, boolean var3) {
      boolean var8 = class_9.field_759;
      if(this.field_67 > 0) {
         this.method_43(field_44[6], field_44[7]);

         try {
            Thread.sleep(2000L);
         } catch (Exception var10) {
            ;
         }

         this.method_43(field_44[8], field_44[9]);
      } else {
         try {
            this.field_49 = var1;
            var1 = class_21.method_453(var1, 20);
            this.field_50 = var2;
            var2 = class_21.method_453(var2, 20);
            if(var1.trim().length() == 0) {
               this.method_43(field_44[0], field_44[1]);
            } else {
               label124: {
                  if(var3) {
                     this.method_29(field_44[2], field_44[3]);
                     if(!var8) {
                        break label124;
                     }
                  }

                  this.method_43(field_44[6], field_44[7]);
               }

               this.field_51 = new class_6(this.method_20(this.field_47, this.field_48), this);
               this.field_51.field_591 = field_46;
               int var4 = this.field_51.method_150();
               this.field_66 = var4;
               System.out.println("Session id: " + var4);
               int var5 = 0;

               try {
                  if(this.method_8()) {
                     String var6 = this.getParameter("referid");
                     var5 = Integer.parseInt(var6);
                     String var7 = this.getParameter("limit30");
                     if(var7.equals("1")) {
                        var5 += 50;
                     }
                  }
               } catch (Exception var11) {
                  ;
               }

               label118: {
                  if(var3) {
                     this.field_51.method_160(19, 712);
                     if(!var8) {
                        break label118;
                     }
                  }

                  this.field_51.method_160(0, 625);
               }

               this.field_51.method_154(field_45);
               this.field_51.method_154(var5);
               this.field_51.method_156(class_21.method_456(var1));
               this.field_51.method_159(var2, var4, this.field_64, this.field_65);
               this.field_51.method_155(this.method_25());
               this.field_51.method_163();
               this.field_51.method_144();
               int var13 = this.field_51.method_144();
               var13 = this.field_51.method_161(var13, field_68);
               System.out.println("Login response: " + var13);
               if(var13 == 0) {
                  this.field_53 = 0;
                  this.method_45();
               } else if(var13 == 1) {
                  this.field_53 = 0;
                  this.method_44();
               } else if(var3) {
                  var1 = "";
                  var2 = "";
                  this.method_46();
               } else if(var13 == 3) {
                  this.method_43(field_44[10], field_44[11]);
               } else if(var13 == 4) {
                  this.method_43(field_44[4], field_44[5]);
               } else if(var13 == 5) {
                  this.method_43(field_44[16], field_44[17]);
               } else if(var13 == 6) {
                  this.method_43(field_44[18], field_44[19]);
               } else if(var13 == 7) {
                  this.method_43(field_44[20], field_44[21]);
               } else if(var13 == 11) {
                  this.method_43(field_44[22], field_44[23]);
               } else if(var13 == 12) {
                  this.method_43(field_44[24], field_44[25]);
               } else if(var13 == 13) {
                  this.method_43(field_44[14], field_44[15]);
               } else if(var13 == 14) {
                  this.method_43(field_44[8], field_44[9]);
                  this.field_67 = 1500;
               } else if(var13 == 15) {
                  this.method_43(field_44[26], field_44[27]);
               } else if(var13 == 16) {
                  this.method_43(field_44[28], field_44[29]);
               } else {
                  this.method_43(field_44[12], field_44[13]);
               }
            }
         } catch (Exception var12) {
            System.out.println(String.valueOf(var12));
            if(this.field_53 > 0) {
               try {
                  Thread.sleep(5000L);
               } catch (Exception var9) {
                  ;
               }

               --this.field_53;
               this.method_26(this.field_49, this.field_50, var3);
            }

            if(var3) {
               this.field_49 = "";
               this.field_50 = "";
               this.method_46();
               if(!var8) {
                  return;
               }
            }

            this.method_43(field_44[12], field_44[13]);
         }
      }
   }

   // $FF: renamed from: k () void
   public void method_27() {
      if(this.field_51 != null) {
         try {
            this.field_51.method_160(1, 325);
            this.field_51.method_163();
         } catch (IOException var1) {
            ;
         }
      }

      this.field_49 = "";
      this.field_50 = "";
      this.method_46();
   }

   // $FF: renamed from: l () void
   public void method_28() {
      System.out.println("Lost connection");
      this.field_53 = 10;
      this.method_26(this.field_49, this.field_50, true);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public void method_29(String var1, String var2) {
      Graphics var3 = this.getGraphics();
      Font var4 = new Font("Helvetica", 1, 15);
      short var5 = 512;
      short var6 = 344;
      var3.setColor(Color.black);
      var3.fillRect(var5 / 2 - 140, var6 / 2 - 25, 280, 50);
      var3.setColor(Color.white);
      var3.drawRect(var5 / 2 - 140, var6 / 2 - 25, 280, 50);
      this.method_17(var3, var1, var4, var5 / 2, var6 / 2 - 10);
      this.method_17(var3, var2, var4, var5 / 2, var6 / 2 + 10);
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) void
   public void method_30(String var1, String var2) {
      if(this.field_67 > 0) {
         this.method_43(field_44[6], field_44[7]);

         try {
            Thread.sleep(2000L);
         } catch (Exception var7) {
            ;
         }

         this.method_43(field_44[8], field_44[9]);
      } else {
         try {
            var1 = class_21.method_453(var1, 20);
            var2 = class_21.method_453(var2, 20);
            this.method_43(field_44[6], field_44[7]);
            this.field_51 = new class_6(this.method_20(this.field_47, this.field_48), this);
            int var3 = this.field_51.method_150();
            this.field_66 = var3;
            System.out.println("Session id: " + var3);
            int var4 = 0;

            try {
               if(this.method_8()) {
                  String var5 = this.getParameter("referid");
                  var4 = Integer.parseInt(var5);
                  String var6 = this.getParameter("limit30");
                  if(var6.equals("1")) {
                     var4 += 50;
                  }
               }
            } catch (Exception var8) {
               ;
            }

            this.field_51.method_160(2, 129);
            this.field_51.method_154(field_45);
            this.field_51.method_156(class_21.method_456(var1));
            this.field_51.method_154(var4);
            this.field_51.method_159(var2, var3, this.field_64, this.field_65);
            this.field_51.method_155(this.method_25());
            this.field_51.method_163();
            this.field_51.method_144();
            int var10 = this.field_51.method_144();
            this.field_51.method_143();
            var10 = this.field_51.method_161(var10, field_68);
            System.out.println("Newplayer response: " + var10);
            if(var10 == 2) {
               this.method_48();
            } else if(var10 == 3) {
               this.method_43(field_44[14], field_44[15]);
            } else if(var10 == 4) {
               this.method_43(field_44[4], field_44[5]);
            } else if(var10 == 5) {
               this.method_43(field_44[16], field_44[17]);
            } else if(var10 == 6) {
               this.method_43(field_44[18], field_44[19]);
            } else if(var10 == 7) {
               this.method_43(field_44[20], field_44[21]);
            } else if(var10 == 11) {
               this.method_43(field_44[22], field_44[23]);
            } else if(var10 == 12) {
               this.method_43(field_44[24], field_44[25]);
            } else if(var10 == 13) {
               this.method_43(field_44[14], field_44[15]);
            } else if(var10 == 14) {
               this.method_43(field_44[8], field_44[9]);
               this.field_67 = 1500;
            } else if(var10 == 15) {
               this.method_43(field_44[26], field_44[27]);
            } else if(var10 == 16) {
               this.method_43(field_44[28], field_44[29]);
            } else {
               this.method_43(field_44[12], field_44[13]);
            }
         } catch (Exception var9) {
            System.out.println(String.valueOf(var9));
            this.method_43(field_44[12], field_44[13]);
         }
      }
   }

   // $FF: renamed from: m () void
   public void method_31() {
      long var1 = System.currentTimeMillis();
      if(this.field_51.method_165()) {
         this.field_54 = var1;
      }

      if(var1 - this.field_54 > 5000L) {
         this.field_54 = var1;
         this.field_51.method_160(5, 348);
         this.field_51.method_162();
      }

      try {
         this.field_51.method_164(20);
      } catch (IOException var4) {
         this.method_28();
         return;
      }

      if(this.method_51()) {
         int var3 = this.field_51.method_152(this.field_52);
         if(var3 > 0) {
            this.method_32(this.field_52[0] & 255, var3);
         }

      }
   }

   // $FF: renamed from: a (int, int) void
   public void method_32(int var1, int var2) {
      boolean var7 = class_9.field_759;
      var1 = this.field_51.method_161(var1, field_68);
      if(var1 == 8) {
         String var3 = new String(this.field_52, 1, var2 - 1);
         this.method_50(var3);
      }

      if(var1 == 9) {
         this.method_27();
      }

      if(var1 == 10) {
         this.method_47();
      } else {
         int var9;
         if(var1 != 23) {
            long var10;
            if(var1 != 24) {
               if(var1 != 26) {
                  if(var1 == 27) {
                     this.field_60 = this.field_52[1];
                     this.field_61 = this.field_52[2];
                     this.field_62 = this.field_52[3];
                     this.field_63 = this.field_52[4];
                  } else if(var1 == 28) {
                     var10 = class_21.method_449(this.field_52, 1);
                     String var11 = class_20.method_417(class_22.method_463(this.field_52, 9, var2 - 9));
                     this.method_50("@pri@" + class_21.method_457(var10) + ": tells you " + var11);
                  } else {
                     this.method_49(var1, var2, this.field_52);
                  }
               } else {
                  this.field_58 = class_21.method_446(this.field_52[1]);
                  var9 = 0;
                  if(var7 || var9 < this.field_58) {
                     do {
                        this.field_59[var9] = class_21.method_449(this.field_52, 2 + var9 * 8);
                        ++var9;
                     } while(var9 < this.field_58);

                  }
               }
            } else {
               var10 = class_21.method_449(this.field_52, 1);
               int var5 = this.field_52[9] & 255;
               int var6 = 0;
               if(!var7 && var6 >= this.field_55) {
                  this.field_56[this.field_55] = var10;
                  this.field_57[this.field_55] = var5;
                  ++this.field_55;
                  this.method_50("@pri@" + class_21.method_457(var10) + " has been added to your friends list");
                  this.method_33();
               } else {
                  do {
                     if(this.field_56[var6] == var10) {
                        if(this.field_57[var6] == 0 && var5 != 0) {
                           this.method_50("@pri@" + class_21.method_457(var10) + " has logged in");
                        }

                        if(this.field_57[var6] != 0 && var5 == 0) {
                           this.method_50("@pri@" + class_21.method_457(var10) + " has logged out");
                        }

                        this.field_57[var6] = var5;
                        boolean var8 = false;
                        this.method_33();
                        return;
                     }

                     ++var6;
                  } while(var6 < this.field_55);

                  this.field_56[this.field_55] = var10;
                  this.field_57[this.field_55] = var5;
                  ++this.field_55;
                  this.method_50("@pri@" + class_21.method_457(var10) + " has been added to your friends list");
                  this.method_33();
               }
            }
         } else {
            this.field_55 = class_21.method_446(this.field_52[1]);
            var9 = 0;
            if(!var7 && var9 >= this.field_55) {
               this.method_33();
            } else {
               do {
                  this.field_56[var9] = class_21.method_449(this.field_52, 2 + var9 * 9);
                  this.field_57[var9] = class_21.method_446(this.field_52[10 + var9 * 9]);
                  ++var9;
               } while(var9 < this.field_55);

               this.method_33();
            }
         }
      }
   }

   // $FF: renamed from: n () void
   public void method_33() {
      boolean var6 = class_9.field_759;
      boolean var1 = true;
      if(var6 || var1) {
         do {
            var1 = false;
            int var2 = 0;
            if(var6 || var2 < this.field_55 - 1) {
               do {
                  if(this.field_57[var2] < this.field_57[var2 + 1]) {
                     int var3 = this.field_57[var2];
                     this.field_57[var2] = this.field_57[var2 + 1];
                     this.field_57[var2 + 1] = var3;
                     long var4 = this.field_56[var2];
                     this.field_56[var2] = this.field_56[var2 + 1];
                     this.field_56[var2 + 1] = var4;
                     var1 = true;
                  }

                  ++var2;
               } while(var2 < this.field_55 - 1);
            }
         } while(var1);

      }
   }

   // $FF: renamed from: c (java.lang.String, java.lang.String) void
   public void method_34(String var1, String var2) {
      var1 = class_21.method_453(var1, 20);
      var2 = class_21.method_453(var2, 20);
      this.field_51.method_160(25, 551);
      this.field_51.method_159(var1 + var2, this.field_66, this.field_64, this.field_65);
      this.field_51.method_162();
   }

   // $FF: renamed from: a (int, int, int, int) void
   public void method_35(int var1, int var2, int var3, int var4) {
      this.field_51.method_160(31, 777);
      this.field_51.method_153(var1);
      this.field_51.method_153(var2);
      this.field_51.method_153(var3);
      this.field_51.method_153(var4);
      this.field_51.method_162();
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_36(String var1) {
      long var2 = class_21.method_456(var1);
      this.field_51.method_160(29, 101);
      this.field_51.method_156(var2);
      this.field_51.method_162();
      int var4 = 0;
      if(class_9.field_759) {
         if(this.field_59[var4] == var2) {
            return;
         }

         ++var4;
      }

      while(var4 < this.field_58) {
         if(this.field_59[var4] == var2) {
            return;
         }

         ++var4;
      }

      if(this.field_58 < 50) {
         this.field_59[this.field_58++] = var2;
      }
   }

   // $FF: renamed from: a (long) void
   public void method_37(long var1) {
      boolean var5 = class_9.field_759;
      this.field_51.method_160(30, 511);
      this.field_51.method_156(var1);
      this.field_51.method_162();
      int var3 = 0;
      if(var5 || var3 < this.field_58) {
         while(this.field_59[var3] != var1) {
            ++var3;
            if(var3 >= this.field_58) {
               return;
            }
         }

         --this.field_58;
         int var4 = var3;
         if(var5 || var3 < this.field_58) {
            do {
               this.field_59[var4] = this.field_59[var4 + 1];
               ++var4;
            } while(var4 < this.field_58);

         }
      }
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_38(String var1) {
      this.field_51.method_160(26, 622);
      this.field_51.method_156(class_21.method_456(var1));
      this.field_51.method_162();
   }

   // $FF: renamed from: b (long) void
   public void method_39(long var1) {
      boolean var5 = class_9.field_759;
      this.field_51.method_160(27, 707);
      this.field_51.method_156(var1);
      this.field_51.method_162();
      int var3 = 0;
      if(var5 || var3 < this.field_55) {
         do {
            if(this.field_56[var3] == var1) {
               --this.field_55;
               int var4 = var3;
               if(var5 || var3 < this.field_55) {
                  do {
                     this.field_56[var4] = this.field_56[var4 + 1];
                     this.field_57[var4] = this.field_57[var4 + 1];
                     ++var4;
                  } while(var4 < this.field_55);
               }

               if(!var5) {
                  break;
               }
            }

            ++var3;
         } while(var3 < this.field_55);
      }

      this.method_50("@pri@" + class_21.method_457(var1) + " has been removed from your friends list");
   }

   // $FF: renamed from: a (long, byte[], int) void
   public void method_40(long var1, byte[] var3, int var4) {
      this.field_51.method_160(28, 185);
      this.field_51.method_156(var1);
      this.field_51.method_158(var3, 0, var4);
      this.field_51.method_162();
   }

   // $FF: renamed from: a (byte[], int) void
   public void method_41(byte[] var1, int var2) {
      this.field_51.method_160(3, 643);
      this.field_51.method_158(var1, 0, var2);
      this.field_51.method_162();
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_42(String var1) {
      this.field_51.method_160(7, 293);
      this.field_51.method_157(var1);
      this.field_51.method_162();
   }

   // $FF: renamed from: d (java.lang.String, java.lang.String) void
   public void method_43(String var1, String var2) {}

   // $FF: renamed from: o () void
   public void method_44() {}

   // $FF: renamed from: p () void
   public void method_45() {}

   // $FF: renamed from: q () void
   public void method_46() {}

   // $FF: renamed from: r () void
   public void method_47() {}

   // $FF: renamed from: s () void
   public void method_48() {}

   // $FF: renamed from: a (int, int, byte[]) void
   public void method_49(int var1, int var2, byte[] var3) {}

   // $FF: renamed from: d (java.lang.String) void
   public void method_50(String var1) {}

   // $FF: renamed from: t () boolean
   public boolean method_51() {
      return true;
   }

   // $FF: renamed from: <init> () void
   public class_1() {
      super();
      this.field_47 = "127.0.0.1";
      this.field_48 = '\uaa4a';
      this.field_49 = "";
      this.field_50 = "";
      this.field_52 = new byte[5000];
      this.field_56 = new long[100];
      this.field_57 = new int[100];
      this.field_59 = new long[50];
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_44 = new String[50];
      field_45 = 1;
      field_44[0] = "You must enter both a username";
      field_44[1] = "and a password - Please try again";
      field_44[2] = "Connection lost! Please wait...";
      field_44[3] = "Attempting to re-establish";
      field_44[4] = "That username is already in use.";
      field_44[5] = "Wait 60 seconds then retry";
      field_44[6] = "Please wait...";
      field_44[7] = "Connecting to server";
      field_44[8] = "Sorry! The server is currently full.";
      field_44[9] = "Please try again later";
      field_44[10] = "Invalid username or password.";
      field_44[11] = "Try again, or create a new account";
      field_44[12] = "Sorry! Unable to connect to server.";
      field_44[13] = "Check your internet settings";
      field_44[14] = "Username already taken.";
      field_44[15] = "Please choose another username";
      field_44[16] = "The client has been updated.";
      field_44[17] = "Please reload this page";
      field_44[18] = "You may only use 1 character at once.";
      field_44[19] = "Your ip-address is already in use";
      field_44[20] = "Login attempts exceeded!";
      field_44[21] = "Please try again in 5 minutes";
      field_44[22] = "Account has been temporarily disabled";
      field_44[23] = "check your message inbox for details";
      field_44[24] = "Account has been permanently disabled";
      field_44[25] = "check your message inbox for details";
      field_44[26] = "You need a members account";
      field_44[27] = "to login to this server";
      field_44[28] = "Please login to a members server";
      field_44[29] = "to access member-only features";
      field_68 = new int[]{124, 345, 953, 124, 634, 636, 661, 127, 177, 295, 559, 384, 321, 679, 871, 592, 679, 347, 926, 585, 681, 195, 785, 679, 818, 115, 226, 799, 925, 852, 194, 966, 32, 3, 4, 5, 6, 7, 8, 9, 40, 1, 2, 3, 4, 5, 6, 7, 8, 9, 50, 444, 52, 3, 4, 5, 6, 7, 8, 9, 60, 1, 2, 3, 4, 5, 6, 7, 8, 9, 70, 1, 2, 3, 4, 5, 6, 7, 8, 9, 80, 1, 2, 3, 4, 5, 6, 7, 8, 9, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9, 110, 1, 2, 3, 4, 5, 6, 7, 8, 9, 120, 1, 2, 3, 4, 5, 6, 7, 8, 9, 130, 1, 2, 3, 4, 5, 6, 7, 8, 9, 140, 1, 2, 3, 4, 5, 6, 7, 8, 9, 150, 1, 2, 3, 4, 5, 6, 7, 8, 9, 160, 1, 2, 3, 4, 5, 6, 7, 8, 9, 170, 1, 2, 3, 4, 5, 6, 7, 8, 9, 180, 1, 2, 3, 4, 5, 6, 7, 8, 9, 694, 235, 846, 834, 300, 200, 298, 278, 247, 286, 346, 144, 23, 913, 812, 765, 432, 176, 935, 452, 542, 45, 346, 65, 637, 62, 354, 123, 34, 912, 812, 834, 698, 324, 872, 912, 438, 765, 344, 731, 625, 783, 176, 658, 128, 854, 489, 85, 6, 865, 43, 573, 132, 527, 235, 434, 658, 912, 825, 298, 753, 282, 652, 439, 629, 945};
   }
}
