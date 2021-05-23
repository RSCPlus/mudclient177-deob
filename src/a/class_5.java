package a;

import a.Utility;
import java.io.IOException;
import java.math.BigInteger;

// $FF: renamed from: a.e
public class class_5 {

	// inauthentic boolean used for testing; set to true for original behaviour
	public boolean reenableOpcodeEncryption = false;

   // $FF: renamed from: a int
   private static final int field_564;
   // $FF: renamed from: b int
   private int field_565;
   // $FF: renamed from: c int
   private int field_566;
   // $FF: renamed from: d int
   private int field_567;
   // $FF: renamed from: e int
   private int field_568;
   // $FF: renamed from: f int
   private int opcodeFriend;
   // $FF: renamed from: g int[]
   public static int[] field_570;
   // $FF: renamed from: h int[]
   public static int[] field_571;
   // $FF: renamed from: i int
   protected int maxOutgoingDataSize;
   // $FF: renamed from: j boolean
   protected boolean field_573;
   // $FF: renamed from: k java.lang.String
   protected String field_574;
   // $FF: renamed from: l int
   protected int field_575;
   // $FF: renamed from: m int
   final int field_576;
   // $FF: renamed from: n int
   final int field_577;
   // $FF: renamed from: o int
   final int field_578;
   // $FF: renamed from: p int
   final int field_579;
   // $FF: renamed from: q int
   final int field_580;
   // $FF: renamed from: r int
   final int field_581;
   // $FF: renamed from: s int
   final int field_582;
   // $FF: renamed from: t int
   final int field_583;
   // $FF: renamed from: u int
   final int field_584;
   // $FF: renamed from: v int
   final int field_585;
   // $FF: renamed from: w int
   final int field_586;
   // $FF: renamed from: x int
   final int field_587;
   // $FF: renamed from: y char[]
   static char[] field_588;
   // $FF: renamed from: z int
   protected int field_589;
   // $FF: renamed from: A int
   public int field_590;
   // $FF: renamed from: B int
   public int field_591;
   // $FF: renamed from: C int
   public int outgoingDataOffset;
   // $FF: renamed from: D int
   private int outgoingOffsetTotal;
   // $FF: renamed from: E int
   private int field_594;
   // $FF: renamed from: F byte[]
   public byte[] outgoingData;
   // $FF: renamed from: G int[]
   private static int[] field_596;
   // $FF: renamed from: H int
   public static int field_597;


   // $FF: renamed from: <init> () void
   public class_5() {
      super();
      this.field_566 = 3141592;
      this.field_568 = 3141592;
      this.maxOutgoingDataSize = 5000;
      this.field_573 = false;
      this.field_574 = "";
      this.field_576 = 61;
      this.field_577 = 59;
      this.field_578 = 42;
      this.field_579 = 43;
      this.field_580 = 44;
      this.field_581 = 45;
      this.field_582 = 46;
      this.field_583 = 47;
      this.field_584 = 92;
      this.field_585 = 32;
      this.field_586 = 124;
      this.field_587 = 34;
      this.outgoingOffsetTotal = 3;
      this.field_594 = 8;
   }

   // $FF: renamed from: a () void
   public void method_143() {}

   // $FF: renamed from: b () int
   public int read() throws IOException {
      return 0;
   }

   // $FF: renamed from: c () int
   public int available() throws IOException {
      return 0;
   }

   // $FF: renamed from: a (int, int, byte[]) void
   public void method_146(int var1, int var2, byte[] var3) throws IOException {}

   // $FF: renamed from: a (byte[], int, int) void
   public void method_147(byte[] var1, int var2, int var3) throws IOException {}

   // $FF: renamed from: d () int
   public int method_148() throws IOException {
      return this.read();
   }

   // $FF: renamed from: e () int
   public int method_149() throws IOException {
      int var1 = this.method_148();
      int var2 = this.method_148();
      return var1 * 256 + var2;
   }

   // $FF: renamed from: f () int
   public int readInt() throws IOException {
      int var1 = this.method_149();
      int var2 = this.method_149();
      return var1 * 65536 + var2;
   }

   // $FF: renamed from: a (int, byte[]) void
   public void method_151(int var1, byte[] var2) throws IOException {
      this.method_146(var1, 0, var2);
   }

   // $FF: renamed from: a (byte[]) int
   public int method_152(byte[] var1) {
      try {
         ++this.field_590;
         if(this.field_591 > 0 && this.field_590 > this.field_591) {
            this.field_573 = true;
            this.field_574 = "time-out";
            this.field_591 += this.field_591;
            return 0;
         }

         if(this.field_589 == 0 && this.available() >= 2) {
            this.field_589 = this.read();
            if(this.field_589 >= 160) {
               this.field_589 = (this.field_589 - 160) * 256 + this.read();
            }
         }

         if(this.field_589 > 0 && this.available() >= this.field_589) {
            label30: {
               if(this.field_589 >= 160) {
                  this.method_151(this.field_589, var1);
                  if(field_597 == 0) {
                     break label30;
                  }
               }

               var1[this.field_589 - 1] = (byte)this.read();
               if(this.field_589 > 1) {
                  this.method_151(this.field_589 - 1, var1);
               }
            }

            int var2 = this.field_589;
            this.field_589 = 0;
            this.field_590 = 0;
            return var2;
         }
      } catch (IOException var3) {
         this.field_573 = true;
         this.field_574 = var3.getMessage();
      }

      return 0;
   }

   // $FF: renamed from: a (int) void
   public void putByte(int var1) {
      this.outgoingData[this.outgoingOffsetTotal++] = (byte)var1;
   }

   // $FF: renamed from: b (int) void
   public void putShort(int var1) {
      this.outgoingData[this.outgoingOffsetTotal++] = (byte)(var1 >> 8);
      this.outgoingData[this.outgoingOffsetTotal++] = (byte)var1;
   }

   // $FF: renamed from: c (int) void
   public void putInt(int var1) {
      this.outgoingData[this.outgoingOffsetTotal++] = (byte)(var1 >> 24);
      this.outgoingData[this.outgoingOffsetTotal++] = (byte)(var1 >> 16);
      this.outgoingData[this.outgoingOffsetTotal++] = (byte)(var1 >> 8);
      this.outgoingData[this.outgoingOffsetTotal++] = (byte)var1;
   }

   // $FF: renamed from: a (long) void
   public void putLong(long var1) {
      this.putInt((int)(var1 >> 32));
      this.putInt((int)(var1 & -1L));
   }

   // $FF: renamed from: a (java.lang.String) void
   public void putUnterminatedString(String var1) {
      var1.getBytes(0, var1.length(), this.outgoingData, this.outgoingOffsetTotal);
      this.outgoingOffsetTotal += var1.length();
   }

   // $FF: renamed from: b (byte[], int, int) void
   public void put177RSCString(byte[] message, int begin, int length) {
      int offset = 0;
      if(field_597 != 0 || offset < length) {
         do {
            this.outgoingData[this.outgoingOffsetTotal++] = message[begin + offset];
            ++offset;
         } while(offset < length);

      }
   }

   // $FF: renamed from: a (java.lang.String, int, java.math.BigInteger, java.math.BigInteger) void
   public void putPassword(String var1, int var2, BigInteger var3, BigInteger var4) {
      int var14 = field_597;
      byte[] var5 = var1.getBytes();
      int var6 = var5.length;
      byte[] var7 = new byte[15];
      int var8 = 0;
      if(var14 != 0 || var8 < var6) {
         do {
            var7[0] = (byte)((int)(1.0D + Math.random() * 127.0D));
            var7[1] = (byte)((int)(Math.random() * 256.0D));
            var7[2] = (byte)((int)(Math.random() * 256.0D));
            var7[3] = (byte)((int)(Math.random() * 256.0D));
            Utility.method_445(var7, 4, var2);
            int var9 = 0;
            if(var14 != 0) {
               label38: {
                  if(var8 + var9 < var6) {
                     var7[8 + var9] = var5[var8 + var9];
                     if(var14 == 0) {
                        break label38;
                     }
                  }

                  var7[8 + var9] = 32;
               }

               ++var9;
            }

            for(; var9 < 7; ++var9) {
               if(var8 + var9 < var6) {
                  var7[8 + var9] = var5[var8 + var9];
                  if(var14 == 0) {
                     continue;
                  }
               }

               var7[8 + var9] = 32;
            }

            BigInteger var10 = new BigInteger(1, var7);
            BigInteger var11 = var10.modPow(var3, var4);
            byte[] var12 = var11.toByteArray();
            this.outgoingData[this.outgoingOffsetTotal++] = (byte)var12.length;
            int var13 = 0;
            if(var14 != 0 || var13 < var12.length) {
               do {
                  this.outgoingData[this.outgoingOffsetTotal++] = var12[var13];
                  ++var13;
               } while(var13 < var12.length);

               var8 += 7;
            } else {
               var8 += 7;
            }
         } while(var8 < var6);

      }
   }

   // $FF: renamed from: a (int, int) void
   public void newPacket(int opcode, int opcodeFriend) {
      this.opcodeFriend = opcodeFriend;
      if(this.outgoingDataOffset > this.maxOutgoingDataSize * 4 / 5) {
         try {
            this.newPacket_(0);
         } catch (IOException var4) {
            this.field_573 = true;
            this.field_574 = var4.getMessage();
         }
      }

      if(this.outgoingData == null) {
         this.outgoingData = new byte[this.maxOutgoingDataSize];
      }

      this.outgoingData[this.outgoingDataOffset + 2] = (byte)opcode;
      this.outgoingData[this.outgoingDataOffset + 3] = 0;
      this.outgoingOffsetTotal = this.outgoingDataOffset + 3;
      this.field_594 = 8;
   }

   // $FF: renamed from: a (int, int[]) int
   public int method_161(int var1, int[] var2) {
   	if (reenableOpcodeEncryption) { // Inauthentic If statement
      int var3 = var1 - this.field_568 & 255;
      int var4 = var2[var3];
      this.field_567 = (this.field_567 + var4) % field_564;
      char var5 = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...".charAt(this.field_567);
      this.field_568 = this.field_568 * 3 + var5 + var4 & '\uffff';
      return var3;
		} else {
			return var1; // inauthentic return statement
		}
   }

   // $FF: renamed from: g () void
   public void flushPacket_() {
      int var6 = field_597;
		 if (reenableOpcodeEncryption) { // Inauthentic If statement
      int var1 = this.outgoingData[this.outgoingDataOffset + 2] & 255;
      this.outgoingData[this.outgoingDataOffset + 2] = (byte)(var1 + this.field_566);
      int opcodeFriend = this.opcodeFriend;
      this.field_565 = (this.field_565 + opcodeFriend) % field_564;
      char var3 = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...".charAt(this.field_565);
      this.field_566 = this.field_566 * 3 + var3 + opcodeFriend & '\uffff';
		 }
      if(this.field_594 != 8) {
         ++this.outgoingOffsetTotal;
      }

      label22: {
         int packetLength = this.outgoingOffsetTotal - this.outgoingDataOffset - 2;
         if(packetLength >= 160) {
            this.outgoingData[this.outgoingDataOffset] = (byte)(160 + packetLength / 256);
            this.outgoingData[this.outgoingDataOffset + 1] = (byte)(packetLength & 255);
            if(var6 == 0) {
               break label22;
            }
         }

         this.outgoingData[this.outgoingDataOffset] = (byte)packetLength;
         --this.outgoingOffsetTotal;
         this.outgoingData[this.outgoingDataOffset + 1] = this.outgoingData[this.outgoingOffsetTotal];
      }

      if(this.maxOutgoingDataSize <= 10000) {
         int var5 = this.outgoingData[this.outgoingDataOffset + 2] & 255;
         ++field_570[var5];
         field_571[var5] += this.outgoingOffsetTotal - this.outgoingDataOffset;
      }

      this.outgoingDataOffset = this.outgoingOffsetTotal;
      if(Utility.field_1009 != 0) {
         ++var6;
         field_597 = var6;
      }

   }

   // $FF: renamed from: h () void
   public void flushPacket() throws IOException {
      this.flushPacket_();
      this.newPacket_(0);
   }

   // $FF: renamed from: d (int) void
   public void newPacket_(int var1) throws IOException {
      if(this.field_573) {
         this.outgoingDataOffset = 0;
         this.outgoingOffsetTotal = 3;
         this.field_573 = false;
         throw new IOException(this.field_574);
      } else {
         ++this.field_575;
         if(this.field_575 >= var1) {
            if(this.outgoingDataOffset > 0) {
               this.field_575 = 0;
               this.method_147(this.outgoingData, 0, this.outgoingDataOffset);
            }

            this.outgoingDataOffset = 0;
            this.outgoingOffsetTotal = 3;
         }
      }
   }

   // $FF: renamed from: i () boolean
   public boolean method_165() {
      return this.outgoingDataOffset > 0;
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_564 = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...".length();
      field_570 = new int[256];
      field_571 = new int[256];
      field_588 = new char[256];

      for(int var0 = 0; var0 < 256; ++var0) {
         field_588[var0] = (char)var0;
      }

      field_588[61] = 61;
      field_588[59] = 59;
      field_588[42] = 42;
      field_588[43] = 43;
      field_588[44] = 44;
      field_588[45] = 45;
      field_588[46] = 46;
      field_588[47] = 47;
      field_588[92] = 92;
      field_588[124] = 124;
      field_588[33] = 33;
      field_588[34] = 34;
      field_596 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   }
}
