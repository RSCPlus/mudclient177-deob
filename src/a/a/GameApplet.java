package a.a;

import a.class_20;
import a.class_21;
import a.class_22;
import a.a.class_0;
import a.a.ClientStream;
import a.a.class_9;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import java.math.BigInteger;

// $FF: renamed from: a.a.b
public class GameApplet extends class_0 {

   // $FF: renamed from: R java.lang.String[]
   public static String[] loginResponses;
   // $FF: renamed from: S int
   public static int clientVersion;
   // $FF: renamed from: T int
   public static int field_46;
   // $FF: renamed from: U java.lang.String
   public String address;
   // $FF: renamed from: V int
   public int port;
   // $FF: renamed from: W java.lang.String
   String username_;
   // $FF: renamed from: X java.lang.String
   String password_;
   // $FF: renamed from: Y a.a.k
   public ClientStream clientStream;
   // $FF: renamed from: Z byte[]
   byte[] incomingBytes;
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
   public int ignoreListCount;
   // $FF: renamed from: bg long[]
   public long[] ignoreListAccNames;
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
   public int sessionId;
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
   public int getRandomDat() {
      return 0;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, boolean) void
   public void login(String username, String password, boolean reconnecting) {
      boolean var8 = class_9.field_759;
      if(this.field_67 > 0) {
         this.method_43(loginResponses[6], loginResponses[7]);

         try {
            Thread.sleep(2000L);
         } catch (Exception var10) {
            ;
         }

         this.method_43(loginResponses[8], loginResponses[9]);
      } else {
         try {
            this.username_ = username;
            username = class_21.method_453(username, 20);
            this.password_ = password;
            password = class_21.method_453(password, 20);
            if(username.trim().length() == 0) {
               this.method_43(loginResponses[0], loginResponses[1]);
            } else {
               label124: {
                  if(reconnecting) {
                     this.method_29(loginResponses[2], loginResponses[3]);
                     if(!var8) {
                        break label124;
                     }
                  }

                  this.method_43(loginResponses[6], loginResponses[7]);
               }

            	 this.clientStream = new ClientStream(this.connect(this.address, this.port), this);
               this.clientStream.field_591 = field_46;
               int sessionId = this.clientStream.readInt();
               this.sessionId = sessionId;
               System.out.println("Session id: " + sessionId); // authentic System.out.println
               int limit30 = 0;

               try {
                  if(this.method_8()) {
                     String referId = this.getParameter("referid");
                     limit30 = Integer.parseInt(referId);
                     String limit30Read = this.getParameter("limit30");
                     if(limit30Read.equals("1")) {
                        limit30 += 50;
                     }
                  }
               } catch (Exception var11) {
                  ;
               }

               label118: {
                  if(reconnecting) {
                     this.clientStream.newPacket(19, 712);
                     if(!var8) {
                        break label118;
                     }
                  }

                  this.clientStream.newPacket(0, 625);
               }

               this.clientStream.putShort(clientVersion);
               this.clientStream.putShort(limit30);
               this.clientStream.putLong(class_21.hashUsername(username));
               this.clientStream.putPassword(password, sessionId, this.field_64, this.field_65);
               this.clientStream.putInt(this.getRandomDat());
               this.clientStream.flushPacket();
               this.clientStream.read();
               int loginResponse = this.clientStream.read();
               loginResponse = this.clientStream.method_161(loginResponse, field_68);
               System.out.println("Login response: " + loginResponse); // authentic System.out.println
               if(loginResponse == 0) {
                  this.field_53 = 0;
                  this.method_45();
               } else if(loginResponse == 1) {
                  this.field_53 = 0;
                  this.method_44();
               } else if(reconnecting) {
                  username = "";
                  password = "";
                  this.method_46();
               } else if(loginResponse == 3) {
                  this.method_43(loginResponses[10], loginResponses[11]);
               } else if(loginResponse == 4) {
                  this.method_43(loginResponses[4], loginResponses[5]);
               } else if(loginResponse == 5) {
                  this.method_43(loginResponses[16], loginResponses[17]);
               } else if(loginResponse == 6) {
                  this.method_43(loginResponses[18], loginResponses[19]);
               } else if(loginResponse == 7) {
                  this.method_43(loginResponses[20], loginResponses[21]);
               } else if(loginResponse == 11) {
                  this.method_43(loginResponses[22], loginResponses[23]);
               } else if(loginResponse == 12) {
                  this.method_43(loginResponses[24], loginResponses[25]);
               } else if(loginResponse == 13) {
                  this.method_43(loginResponses[14], loginResponses[15]);
               } else if(loginResponse == 14) {
                  this.method_43(loginResponses[8], loginResponses[9]);
                  this.field_67 = 1500;
               } else if(loginResponse == 15) {
                  this.method_43(loginResponses[26], loginResponses[27]);
               } else if(loginResponse == 16) {
                  this.method_43(loginResponses[28], loginResponses[29]);
               } else {
                  this.method_43(loginResponses[12], loginResponses[13]);
               }
            }
         } catch (Exception var12) {
            System.out.println(String.valueOf(var12)); // authentic System.out.println
            if(this.field_53 > 0) {
               try {
                  Thread.sleep(5000L);
               } catch (Exception var9) {
                  ;
               }

               --this.field_53;
               this.login(this.username_, this.password_, reconnecting);
            }

            if(reconnecting) {
               this.username_ = "";
               this.password_ = "";
               this.method_46();
               if(!var8) {
                  return;
               }
            }

            this.method_43(loginResponses[12], loginResponses[13]);
         }
      }
   }

   // $FF: renamed from: k () void
   public void confirmLogout() {
      if(this.clientStream != null) {
         try {
            this.clientStream.newPacket(1, 325);
            this.clientStream.flushPacket();
         } catch (IOException var1) {
            ;
         }
      }

      this.username_ = "";
      this.password_ = "";
      this.method_46();
   }

   // $FF: renamed from: l () void
   public void method_28() {
      System.out.println("Lost connection"); // authentic System.out.println
      this.field_53 = 10;
      this.login(this.username_, this.password_, true);
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
         this.method_43(loginResponses[6], loginResponses[7]);

         try {
            Thread.sleep(2000L);
         } catch (Exception var7) {
            ;
         }

         this.method_43(loginResponses[8], loginResponses[9]);
      } else {
         try {
            var1 = class_21.method_453(var1, 20);
            var2 = class_21.method_453(var2, 20);
            this.method_43(loginResponses[6], loginResponses[7]);
            this.clientStream = new ClientStream(this.connect(this.address, this.port), this);
            int var3 = this.clientStream.readInt();
            this.sessionId = var3;
            System.out.println("Session id: " + var3); // authentic System.out.println
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

            this.clientStream.newPacket(2, 129);
            this.clientStream.putShort(clientVersion);
            this.clientStream.putLong(class_21.hashUsername(var1));
            this.clientStream.putShort(var4);
            this.clientStream.putPassword(var2, var3, this.field_64, this.field_65);
            this.clientStream.putInt(this.getRandomDat());
            this.clientStream.flushPacket();
            this.clientStream.read();
            int var10 = this.clientStream.read();
            this.clientStream.method_143();
            var10 = this.clientStream.method_161(var10, field_68);
            System.out.println("Newplayer response: " + var10); // authentic System.out.println
            if(var10 == 2) {
               this.method_48();
            } else if(var10 == 3) {
               this.method_43(loginResponses[14], loginResponses[15]);
            } else if(var10 == 4) {
               this.method_43(loginResponses[4], loginResponses[5]);
            } else if(var10 == 5) {
               this.method_43(loginResponses[16], loginResponses[17]);
            } else if(var10 == 6) {
               this.method_43(loginResponses[18], loginResponses[19]);
            } else if(var10 == 7) {
               this.method_43(loginResponses[20], loginResponses[21]);
            } else if(var10 == 11) {
               this.method_43(loginResponses[22], loginResponses[23]);
            } else if(var10 == 12) {
               this.method_43(loginResponses[24], loginResponses[25]);
            } else if(var10 == 13) {
               this.method_43(loginResponses[14], loginResponses[15]);
            } else if(var10 == 14) {
               this.method_43(loginResponses[8], loginResponses[9]);
               this.field_67 = 1500;
            } else if(var10 == 15) {
               this.method_43(loginResponses[26], loginResponses[27]);
            } else if(var10 == 16) {
               this.method_43(loginResponses[28], loginResponses[29]);
            } else {
               this.method_43(loginResponses[12], loginResponses[13]);
            }
         } catch (Exception var9) {
            System.out.println(String.valueOf(var9)); // authentic System.out.println
            this.method_43(loginResponses[12], loginResponses[13]);
         }
      }
   }

   // $FF: renamed from: m () void
   public void checkConnection() {
      long var1 = System.currentTimeMillis();
      if(this.clientStream.method_165()) {
         this.field_54 = var1;
      }

      if(var1 - this.field_54 > 5000L) {
         this.field_54 = var1;
         this.clientStream.newPacket(5, 348); // heartbeat packet
         this.clientStream.flushPacket_();
      }

      try {
         this.clientStream.newPacket_(20);
      } catch (IOException var4) {
         this.method_28();
         return;
      }

      if(this.method_51()) {
         int var3 = this.clientStream.method_152(this.incomingBytes);
         if(var3 > 0) {
            this.method_32(this.incomingBytes[0] & 255, var3);
         }

      }
   }

   // $FF: renamed from: a (int, int) void
   public void method_32(int opcode, int packetLength) {
      boolean var7 = class_9.field_759;
      opcode = this.clientStream.method_161(opcode, field_68);
      if(opcode == 8) {
         String var3 = new String(this.incomingBytes, 1, packetLength - 1);
         this.displayMessage(var3);
      }

      if(opcode == 9) {
         this.confirmLogout();
      }

      if(opcode == 10) {
         this.method_47();
      } else {
         int var9;
         if(opcode != 23) {
            long var10;
            if(opcode != 24) {
               if(opcode != 26) {
                  if(opcode == 27) {
                     this.field_60 = this.incomingBytes[1];
                     this.field_61 = this.incomingBytes[2];
                     this.field_62 = this.incomingBytes[3];
                     this.field_63 = this.incomingBytes[4];
                  } else if(opcode == 28) {
                     var10 = class_21.getUnsignedLong(this.incomingBytes, 1);
                     String var11 = class_20.formatChat(class_22.readChatString(this.incomingBytes, 9, packetLength - 9));
                     this.displayMessage("@pri@" + class_21.unhashUsername(var10) + ": tells you " + var11);
                  } else {
                     this.method_49(opcode, packetLength, this.incomingBytes);
                  }
               } else {
                  this.ignoreListCount = class_21.getUnsignedByte(this.incomingBytes[1]);
                  var9 = 0;
                  if(var7 || var9 < this.ignoreListCount) {
                     do {
                        this.ignoreListAccNames[var9] = class_21.getUnsignedLong(this.incomingBytes, 2 + var9 * 8);
                        ++var9;
                     } while(var9 < this.ignoreListCount);

                  }
               }
            } else {
               var10 = class_21.getUnsignedLong(this.incomingBytes, 1);
               int var5 = this.incomingBytes[9] & 255;
               int var6 = 0;
               if(!var7 && var6 >= this.field_55) {
                  this.field_56[this.field_55] = var10;
                  this.field_57[this.field_55] = var5;
                  ++this.field_55;
                  this.displayMessage("@pri@" + class_21.unhashUsername(var10) + " has been added to your friends list");
                  this.method_33();
               } else {
                  do {
                     if(this.field_56[var6] == var10) {
                        if(this.field_57[var6] == 0 && var5 != 0) {
                           this.displayMessage("@pri@" + class_21.unhashUsername(var10) + " has logged in");
                        }

                        if(this.field_57[var6] != 0 && var5 == 0) {
                           this.displayMessage("@pri@" + class_21.unhashUsername(var10) + " has logged out");
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
                  this.displayMessage("@pri@" + class_21.unhashUsername(var10) + " has been added to your friends list");
                  this.method_33();
               }
            }
         } else {
            this.field_55 = class_21.getUnsignedByte(this.incomingBytes[1]);
            var9 = 0;
            if(!var7 && var9 >= this.field_55) {
               this.method_33();
            } else {
               do {
                  this.field_56[var9] = class_21.getUnsignedLong(this.incomingBytes, 2 + var9 * 9);
                  this.field_57[var9] = class_21.getUnsignedByte(this.incomingBytes[10 + var9 * 9]);
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
   public void changePassword(String var1, String var2) {
      var1 = class_21.method_453(var1, 20);
      var2 = class_21.method_453(var2, 20);
      this.clientStream.newPacket(25, 551);
      this.clientStream.putPassword(var1 + var2, this.sessionId, this.field_64, this.field_65);
      this.clientStream.flushPacket_();
   }

   // $FF: renamed from: a (int, int, int, int) void
   public void sendPrivacySettings(int var1, int var2, int var3, int var4) {
      this.clientStream.newPacket(31, 777);
      this.clientStream.putByte(var1);
      this.clientStream.putByte(var2);
      this.clientStream.putByte(var3);
      this.clientStream.putByte(var4);
      this.clientStream.flushPacket_();
   }

   // $FF: renamed from: a (java.lang.String) void
   public void ignoreAdd(String var1) {
      long var2 = class_21.hashUsername(var1);
      this.clientStream.newPacket(29, 101);
      this.clientStream.putLong(var2);
      this.clientStream.flushPacket_();
      int var4 = 0;
      if(class_9.field_759) {
         if(this.ignoreListAccNames[var4] == var2) {
            return;
         }

         ++var4;
      }

      while(var4 < this.ignoreListCount) {
         if(this.ignoreListAccNames[var4] == var2) {
            return;
         }

         ++var4;
      }

      if(this.ignoreListCount < 50) {
         this.ignoreListAccNames[this.ignoreListCount++] = var2;
      }
   }

   // $FF: renamed from: a (long) void
   public void ignoreRemove(long var1) {
      boolean var5 = class_9.field_759;
      this.clientStream.newPacket(30, 511);
      this.clientStream.putLong(var1);
      this.clientStream.flushPacket_();
      int var3 = 0;
      if(var5 || var3 < this.ignoreListCount) {
         while(this.ignoreListAccNames[var3] != var1) {
            ++var3;
            if(var3 >= this.ignoreListCount) {
               return;
            }
         }

         --this.ignoreListCount;
         int var4 = var3;
         if(var5 || var3 < this.ignoreListCount) {
            do {
               this.ignoreListAccNames[var4] = this.ignoreListAccNames[var4 + 1];
               ++var4;
            } while(var4 < this.ignoreListCount);

         }
      }
   }

   // $FF: renamed from: b (java.lang.String) void
   public void friendAdd(String var1) {
      this.clientStream.newPacket(26, 622);
      this.clientStream.putLong(class_21.hashUsername(var1));
      this.clientStream.flushPacket_();
   }

   // $FF: renamed from: b (long) void
   public void friendRemove(long var1) {
      boolean var5 = class_9.field_759;
      this.clientStream.newPacket(27, 707);
      this.clientStream.putLong(var1);
      this.clientStream.flushPacket_();
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

      this.displayMessage("@pri@" + class_21.unhashUsername(var1) + " has been removed from your friends list");
   }

   // $FF: renamed from: a (long, byte[], int) void
   public void sendPrivateChat(long var1, byte[] var3, int var4) {
      this.clientStream.newPacket(28, 185);
      this.clientStream.putLong(var1);
      this.clientStream.put177RSCString(var3, 0, var4);
      this.clientStream.flushPacket_();
   }

   // $FF: renamed from: a (byte[], int) void
   public void sendChat(byte[] var1, int var2) {
      this.clientStream.newPacket(3, 643);
      this.clientStream.put177RSCString(var1, 0, var2);
      this.clientStream.flushPacket_();
   }

   // $FF: renamed from: c (java.lang.String) void
   public void sendCommandString(String var1) {
      this.clientStream.newPacket(7, 293);
      this.clientStream.putUnterminatedString(var1);
      this.clientStream.flushPacket_();
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
   public void displayMessage(String var1) {}

   // $FF: renamed from: t () boolean
   public boolean method_51() {
      return true;
   }

   // $FF: renamed from: <init> () void
   public GameApplet() {
      super();
      this.address = "127.0.0.1";
      this.port = '\uaa4a';
      this.username_ = "";
      this.password_ = "";
      this.incomingBytes = new byte[5000];
      this.field_56 = new long[100];
      this.field_57 = new int[100];
      this.ignoreListAccNames = new long[50];
   }

   // $FF: renamed from: <clinit> () void
   static {
      loginResponses = new String[50];
      clientVersion = 1;
      loginResponses[0] = "You must enter both a username";
      loginResponses[1] = "and a password - Please try again";
      loginResponses[2] = "Connection lost! Please wait...";
      loginResponses[3] = "Attempting to re-establish";
      loginResponses[4] = "That username is already in use.";
      loginResponses[5] = "Wait 60 seconds then retry";
      loginResponses[6] = "Please wait...";
      loginResponses[7] = "Connecting to server";
      loginResponses[8] = "Sorry! The server is currently full.";
      loginResponses[9] = "Please try again later";
      loginResponses[10] = "Invalid username or password.";
      loginResponses[11] = "Try again, or create a new account";
      loginResponses[12] = "Sorry! Unable to connect to server.";
      loginResponses[13] = "Check your internet settings";
      loginResponses[14] = "Username already taken.";
      loginResponses[15] = "Please choose another username";
      loginResponses[16] = "The client has been updated.";
      loginResponses[17] = "Please reload this page";
      loginResponses[18] = "You may only use 1 character at once.";
      loginResponses[19] = "Your ip-address is already in use";
      loginResponses[20] = "Login attempts exceeded!";
      loginResponses[21] = "Please try again in 5 minutes";
      loginResponses[22] = "Account has been temporarily disabled";
      loginResponses[23] = "check your message inbox for details";
      loginResponses[24] = "Account has been permanently disabled";
      loginResponses[25] = "check your message inbox for details";
      loginResponses[26] = "You need a members account";
      loginResponses[27] = "to login to this server";
      loginResponses[28] = "Please login to a members server";
      loginResponses[29] = "to access member-only features";
      field_68 = new int[]{124, 345, 953, 124, 634, 636, 661, 127, 177, 295, 559, 384, 321, 679, 871, 592, 679, 347, 926, 585, 681, 195, 785, 679, 818, 115, 226, 799, 925, 852, 194, 966, 32, 3, 4, 5, 6, 7, 8, 9, 40, 1, 2, 3, 4, 5, 6, 7, 8, 9, 50, 444, 52, 3, 4, 5, 6, 7, 8, 9, 60, 1, 2, 3, 4, 5, 6, 7, 8, 9, 70, 1, 2, 3, 4, 5, 6, 7, 8, 9, 80, 1, 2, 3, 4, 5, 6, 7, 8, 9, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9, 110, 1, 2, 3, 4, 5, 6, 7, 8, 9, 120, 1, 2, 3, 4, 5, 6, 7, 8, 9, 130, 1, 2, 3, 4, 5, 6, 7, 8, 9, 140, 1, 2, 3, 4, 5, 6, 7, 8, 9, 150, 1, 2, 3, 4, 5, 6, 7, 8, 9, 160, 1, 2, 3, 4, 5, 6, 7, 8, 9, 170, 1, 2, 3, 4, 5, 6, 7, 8, 9, 180, 1, 2, 3, 4, 5, 6, 7, 8, 9, 694, 235, 846, 834, 300, 200, 298, 278, 247, 286, 346, 144, 23, 913, 812, 765, 432, 176, 935, 452, 542, 45, 346, 65, 637, 62, 354, 123, 34, 912, 812, 834, 698, 324, 872, 912, 438, 765, 344, 731, 625, 783, 176, 658, 128, 854, 489, 85, 6, 865, 43, 573, 132, 527, 235, 434, 658, 912, 825, 298, 753, 282, 652, 439, 629, 945};
   }
}
