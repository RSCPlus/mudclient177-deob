package a;

import a.class_5;

// $FF: renamed from: a.h
public class class_22 {

   // $FF: renamed from: a byte[]
   public static byte[] field_1010;
   // $FF: renamed from: b char[]
   public static char[] field_1011;
   // $FF: renamed from: c char[]
   private static char[] field_1012;


   // $FF: renamed from: a (byte[], int, int) java.lang.String
   public static String method_463(byte[] var0, int var1, int var2) {
      int var9 = class_5.field_597;
      int var3 = 0;
      int var4 = -1;
      int var5 = 0;
      int var7;
      if(var9 != 0 || var5 < var2) {
         do {
            int var6;
            label65: {
               var6 = var0[var1++] & 255;
               var7 = var6 >> 4 & 15;
               if(var4 == -1) {
                  if(var7 < 13) {
                     field_1011[var3++] = field_1012[var7];
                     if(var9 == 0) {
                        break label65;
                     }
                  }

                  var4 = var7;
                  if(var9 == 0) {
                     break label65;
                  }
               }

               field_1011[var3++] = field_1012[(var4 << 4) + var7 - 195];
               var4 = -1;
            }

            label56: {
               var7 = var6 & 15;
               if(var4 == -1) {
                  if(var7 < 13) {
                     field_1011[var3++] = field_1012[var7];
                     if(var9 == 0) {
                        break label56;
                     }
                  }

                  var4 = var7;
                  if(var9 == 0) {
                     break label56;
                  }
               }

               field_1011[var3++] = field_1012[(var4 << 4) + var7 - 195];
               var4 = -1;
            }

            ++var5;
         } while(var5 < var2);
      }

      boolean var10 = true;
      var7 = 0;
      if(var9 == 0 && var7 >= var3) {
         return new String(field_1011, 0, var3);
      } else {
         do {
            char var8 = field_1011[var7];
            if(var7 > 4 && var8 == 64) {
               field_1011[var7] = 32;
            }

            if(var8 == 37) {
               field_1011[var7] = 32;
            }

            if(var10 && var8 >= 97 && var8 <= 122) {
               field_1011[var7] = (char)(field_1011[var7] + -32);
               var10 = false;
            }

            if(var8 == 46 || var8 == 33) {
               var10 = true;
            }

            ++var7;
         } while(var7 < var3);

         return new String(field_1011, 0, var3);
      }
   }

   // $FF: renamed from: a (java.lang.String) int
   public static int method_464(String var0) {
      int var7 = class_5.field_597;
      if(var0.length() > 80) {
         var0 = var0.substring(0, 80);
      }

      var0 = var0.toLowerCase();
      int var1 = 0;
      int var2 = -1;
      int var3 = 0;
      if(var7 == 0 && var3 >= var0.length()) {
         if(var2 != -1) {
            field_1010[var1++] = (byte)(var2 << 4);
         }

         return var1;
      } else {
         do {
            char var4 = var0.charAt(var3);
            int var5 = 0;
            int var6 = 0;
            if(var7 != 0 || var6 < field_1012.length) {
               do {
                  if(var4 == field_1012[var6]) {
                     var5 = var6;
                     if(var7 == 0) {
                        break;
                     }
                  }

                  ++var6;
               } while(var6 < field_1012.length);
            }

            if(var5 > 12) {
               var5 += 195;
            }

            label79: {
               if(var2 == -1) {
                  if(var5 < 13) {
                     var2 = var5;
                     if(var7 == 0) {
                        break label79;
                     }
                  }

                  field_1010[var1++] = (byte)var5;
                  if(var7 == 0) {
                     break label79;
                  }
               }

               if(var5 < 13) {
                  field_1010[var1++] = (byte)((var2 << 4) + var5);
                  var2 = -1;
                  if(var7 == 0) {
                     break label79;
                  }
               }

               field_1010[var1++] = (byte)((var2 << 4) + (var5 >> 4));
               var2 = var5 & 15;
            }

            ++var3;
         } while(var3 < var0.length());

         if(var2 != -1) {
            field_1010[var1++] = (byte)(var2 << 4);
         }

         return var1;
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_1010 = new byte[100];
      field_1011 = new char[100];
      field_1012 = new char[]{' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '\u00a3', '$', '%', '\"', '[', ']'};
   }
}
