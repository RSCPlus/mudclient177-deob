package a;

import java.util.zip.CRC32;

// $FF: renamed from: a.d
public class Buffer {

   // $FF: renamed from: a byte[]
   byte[] field_991;
   // $FF: renamed from: b int
   int field_992;
   // $FF: renamed from: c java.util.zip.CRC32
   static CRC32 field_993;
   // $FF: renamed from: d int[]
   private static final int[] field_994;


   // $FF: renamed from: <init> () void
   private Buffer() {
      super();
   }

   // $FF: renamed from: <init> (byte[]) void
   public Buffer(byte[] var1) {
      super();
      this.field_991 = var1;
      this.field_992 = 0;
   }

   // $FF: renamed from: a () int
   public int method_407() {
      return this.field_991[this.field_992++] & 255;
   }

   // $FF: renamed from: b () int
   public int method_408() {
      this.field_992 += 2;
      return ((this.field_991[this.field_992 - 2] & 255) << 8) + (this.field_991[this.field_992 - 1] & 255);
   }

   // $FF: renamed from: c () int
   public int method_409() {
      this.field_992 += 4;
      return ((this.field_991[this.field_992 - 4] & 255) << 24) + ((this.field_991[this.field_992 - 3] & 255) << 16) + ((this.field_991[this.field_992 - 2] & 255) << 8) + (this.field_991[this.field_992 - 1] & 255);
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_993 = new CRC32();
      field_994 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   }
}
