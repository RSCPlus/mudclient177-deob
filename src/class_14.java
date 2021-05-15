import a.a.class_15;
import a.a.class_8;
import a.a.class_9;

import java.io.IOException;

// $FF: renamed from: f
public class class_14 {

   // $FF: renamed from: a boolean
   boolean field_820;
   // $FF: renamed from: b boolean
   boolean field_821;
   // $FF: renamed from: c a.a.g
   class_9 field_822;
   // $FF: renamed from: d a.a.j
   class_8 field_823;
   // $FF: renamed from: e int
   int field_824;
   // $FF: renamed from: f int
   final int field_825;
   // $FF: renamed from: g int
   final int field_826;
   // $FF: renamed from: h int[]
   int[] field_827;
   // $FF: renamed from: i byte[]
   byte[] field_828;
   // $FF: renamed from: j byte[]
   byte[] field_829;
   // $FF: renamed from: k byte[]
   byte[] field_830;
   // $FF: renamed from: l byte[]
   byte[] field_831;
   // $FF: renamed from: m byte[][]
   byte[][] field_832;
   // $FF: renamed from: n byte[][]
   byte[][] field_833;
   // $FF: renamed from: o byte[][]
   byte[][] field_834;
   // $FF: renamed from: p byte[][]
   byte[][] field_835;
   // $FF: renamed from: q byte[][]
   byte[][] field_836;
   // $FF: renamed from: r byte[][]
   byte[][] field_837;
   // $FF: renamed from: s byte[][]
   byte[][] field_838;
   // $FF: renamed from: t int[][]
   int[][] field_839;
   // $FF: renamed from: u int
   int field_840;
   // $FF: renamed from: v int
   int field_841;
   // $FF: renamed from: w int[]
   int[] field_842;
   // $FF: renamed from: x int[]
   int[] field_843;
   // $FF: renamed from: y int[][]
   int[][] field_844;
   // $FF: renamed from: z int[][]
   int[][] field_845;
   // $FF: renamed from: A int[][]
   int[][] field_846;
   // $FF: renamed from: B boolean
   boolean field_847;
   // $FF: renamed from: C a.a.f[]
   class_15[] field_848;
   // $FF: renamed from: D a.a.f[][]
   class_15[][] field_849;
   // $FF: renamed from: E a.a.f[][]
   class_15[][] field_850;
   // $FF: renamed from: F a.a.f
   class_15 field_851;


   // $FF: renamed from: <init> (a.a.j, a.a.g) void
   public class_14(class_8 var1, class_9 var2) {
      super();
      int var7 = class_4.field_563;
      this.field_820 = false;
      this.field_821 = true;
      this.field_824 = 750;
      this.field_825 = 12345678;
      this.field_826 = 128;
      this.field_827 = new int[256];
      this.field_832 = new byte[4][2304];
      this.field_833 = new byte[4][2304];
      this.field_834 = new byte[4][2304];
      this.field_835 = new byte[4][2304];
      this.field_836 = new byte[4][2304];
      this.field_837 = new byte[4][2304];
      this.field_838 = new byte[4][2304];
      this.field_839 = new int[4][2304];
      this.field_840 = 96;
      this.field_841 = 96;
      this.field_842 = new int[this.field_840 * this.field_841 * 2];
      this.field_843 = new int[this.field_840 * this.field_841 * 2];
      this.field_844 = new int[this.field_840][this.field_841];
      this.field_845 = new int[this.field_840][this.field_841];
      this.field_846 = new int[this.field_840][this.field_841];
      this.field_847 = false;
      this.field_848 = new class_15[64];
      this.field_849 = new class_15[4][64];
      this.field_850 = new class_15[4][64];
      this.field_823 = var1;
      this.field_822 = var2;
      int var3 = 0;
      if(var7 != 0 || var3 < 64) {
         do {
            this.field_827[var3] = class_8.method_212(255 - var3 * 4, 255 - (int)((double)var3 * 1.75D), 255 - var3 * 4);
            ++var3;
         } while(var3 < 64);
      }

      int var4 = 0;
      if(var7 != 0) {
         this.field_827[var4 + 64] = class_8.method_212(var4 * 3, 144, 0);
         ++var4;
      }

      while(var4 < 64) {
         this.field_827[var4 + 64] = class_8.method_212(var4 * 3, 144, 0);
         ++var4;
      }

      int var5 = 0;
      if(var7 != 0 || var5 < 64) {
         do {
            this.field_827[var5 + 128] = class_8.method_212(192 - (int)((double)var5 * 1.5D), 144 - (int)((double)var5 * 1.5D), 0);
            ++var5;
         } while(var5 < 64);
      }

      int var6 = 0;
      if(var7 != 0 || var6 < 64) {
         do {
            this.field_827[var6 + 192] = class_8.method_212(96 - (int)((double)var6 * 1.5D), 48 + (int)((double)var6 * 1.5D), 0);
            ++var6;
         } while(var6 < 64);

      }
   }

   // $FF: renamed from: a (int, int, int, int, int, int, int[], int[], boolean) int
   public int method_321(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8, boolean var9) {
      int var19 = class_4.field_563;
      int var10 = 0;
      int var11;
      if(var19 != 0) {
         var11 = 0;
         if(var19 == 0 && var11 >= this.field_841) {
            ++var10;
         } else {
            while(true) {
               this.field_844[var10][var11] = 0;
               ++var11;
               if(var11 >= this.field_841) {
                  ++var10;
                  break;
               }
            }
         }
      }

      while(var10 < this.field_840) {
         var11 = 0;
         if(var19 == 0 && var11 >= this.field_841) {
            ++var10;
         } else {
            do {
               this.field_844[var10][var11] = 0;
               ++var11;
            } while(var11 < this.field_841);

            ++var10;
         }
      }

      byte var20 = 0;
      int var12 = 0;
      int var13 = var1;
      int var14 = var2;
      this.field_844[var1][var2] = 99;
      var7[var20] = var1;
      var11 = var20 + 1;
      var8[var20] = var2;
      int var15 = var7.length;
      boolean var16 = false;
      if(var19 != 0 || var12 != var11) {
         do {
            var13 = var7[var12];
            var14 = var8[var12];
            var12 = (var12 + 1) % var15;
            if(var13 >= var3 && var13 <= var5 && var14 >= var4 && var14 <= var6) {
               var16 = true;
               if(var19 == 0) {
                  break;
               }
            }

            if(var9) {
               if(var13 > 0 && var13 - 1 >= var3 && var13 - 1 <= var5 && var14 >= var4 && var14 <= var6 && (this.field_845[var13 - 1][var14] & 8) == 0) {
                  var16 = true;
                  if(var19 == 0) {
                     break;
                  }
               }

               if(var13 < this.field_840 - 1 && var13 + 1 >= var3 && var13 + 1 <= var5 && var14 >= var4 && var14 <= var6 && (this.field_845[var13 + 1][var14] & 2) == 0) {
                  var16 = true;
                  if(var19 == 0) {
                     break;
                  }
               }

               if(var14 > 0 && var13 >= var3 && var13 <= var5 && var14 - 1 >= var4 && var14 - 1 <= var6 && (this.field_845[var13][var14 - 1] & 4) == 0) {
                  var16 = true;
                  if(var19 == 0) {
                     break;
                  }
               }

               if(var14 < this.field_841 - 1 && var13 >= var3 && var13 <= var5 && var14 + 1 >= var4 && var14 + 1 <= var6 && (this.field_845[var13][var14 + 1] & 1) == 0) {
                  var16 = true;
                  if(var19 == 0) {
                     break;
                  }
               }
            }

            if(var13 > 0 && this.field_844[var13 - 1][var14] == 0 && (this.field_845[var13 - 1][var14] & 120) == 0) {
               var7[var11] = var13 - 1;
               var8[var11] = var14;
               var11 = (var11 + 1) % var15;
               this.field_844[var13 - 1][var14] = 2;
            }

            if(var13 < this.field_840 - 1 && this.field_844[var13 + 1][var14] == 0 && (this.field_845[var13 + 1][var14] & 114) == 0) {
               var7[var11] = var13 + 1;
               var8[var11] = var14;
               var11 = (var11 + 1) % var15;
               this.field_844[var13 + 1][var14] = 8;
            }

            if(var14 > 0 && this.field_844[var13][var14 - 1] == 0 && (this.field_845[var13][var14 - 1] & 116) == 0) {
               var7[var11] = var13;
               var8[var11] = var14 - 1;
               var11 = (var11 + 1) % var15;
               this.field_844[var13][var14 - 1] = 1;
            }

            if(var14 < this.field_841 - 1 && this.field_844[var13][var14 + 1] == 0 && (this.field_845[var13][var14 + 1] & 113) == 0) {
               var7[var11] = var13;
               var8[var11] = var14 + 1;
               var11 = (var11 + 1) % var15;
               this.field_844[var13][var14 + 1] = 4;
            }

            if(var13 > 0 && var14 > 0 && (this.field_845[var13][var14 - 1] & 116) == 0 && (this.field_845[var13 - 1][var14] & 120) == 0 && (this.field_845[var13 - 1][var14 - 1] & 124) == 0 && this.field_844[var13 - 1][var14 - 1] == 0) {
               var7[var11] = var13 - 1;
               var8[var11] = var14 - 1;
               var11 = (var11 + 1) % var15;
               this.field_844[var13 - 1][var14 - 1] = 3;
            }

            if(var13 < this.field_840 - 1 && var14 > 0 && (this.field_845[var13][var14 - 1] & 116) == 0 && (this.field_845[var13 + 1][var14] & 114) == 0 && (this.field_845[var13 + 1][var14 - 1] & 118) == 0 && this.field_844[var13 + 1][var14 - 1] == 0) {
               var7[var11] = var13 + 1;
               var8[var11] = var14 - 1;
               var11 = (var11 + 1) % var15;
               this.field_844[var13 + 1][var14 - 1] = 9;
            }

            if(var13 > 0 && var14 < this.field_841 - 1 && (this.field_845[var13][var14 + 1] & 113) == 0 && (this.field_845[var13 - 1][var14] & 120) == 0 && (this.field_845[var13 - 1][var14 + 1] & 121) == 0 && this.field_844[var13 - 1][var14 + 1] == 0) {
               var7[var11] = var13 - 1;
               var8[var11] = var14 + 1;
               var11 = (var11 + 1) % var15;
               this.field_844[var13 - 1][var14 + 1] = 6;
            }

            if(var13 < this.field_840 - 1 && var14 < this.field_841 - 1 && (this.field_845[var13][var14 + 1] & 113) == 0 && (this.field_845[var13 + 1][var14] & 114) == 0 && (this.field_845[var13 + 1][var14 + 1] & 115) == 0 && this.field_844[var13 + 1][var14 + 1] == 0) {
               var7[var11] = var13 + 1;
               var8[var11] = var14 + 1;
               var11 = (var11 + 1) % var15;
               this.field_844[var13 + 1][var14 + 1] = 12;
            }
         } while(var12 != var11);
      }

      if(!var16) {
         return -1;
      } else {
         byte var21 = 0;
         var7[var21] = var13;
         var12 = var21 + 1;
         var8[var21] = var14;
         int var18;
         int var17 = var18 = this.field_844[var13][var14];
         if(var19 == 0 && var13 == var1 && var14 == var2) {
            return var12;
         } else {
            do {
               if(var17 != var18) {
                  var18 = var17;
                  var7[var12] = var13;
                  var8[var12++] = var14;
               }

               label165: {
                  if((var17 & 2) != 0) {
                     ++var13;
                     if(var19 == 0) {
                        break label165;
                     }
                  }

                  if((var17 & 8) != 0) {
                     --var13;
                  }
               }

               label160: {
                  if((var17 & 1) != 0) {
                     ++var14;
                     if(var19 == 0) {
                        break label160;
                     }
                  }

                  if((var17 & 4) != 0) {
                     --var14;
                  }
               }

               var17 = this.field_844[var13][var14];
            } while(var13 != var1 || var14 != var2);

            return var12;
         }
      }
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_322(int var1, int var2, int var3) {
      this.field_845[var1][var2] |= var3;
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_323(int var1, int var2, int var3) {
      this.field_845[var1][var2] &= '\uffff' - var3;
   }

   // $FF: renamed from: a (int, int, int, int) void
   public void method_324(int var1, int var2, int var3, int var4) {
      int var5 = class_4.field_563;
      if(var1 >= 0 && var2 >= 0 && var1 < this.field_840 - 1 && var2 < this.field_841 - 1) {
         if(class_4.field_532[var4] == 1) {
            label47: {
               if(var3 == 0) {
                  this.field_845[var1][var2] |= 1;
                  if(var2 <= 0) {
                     break label47;
                  }

                  this.method_322(var1, var2 - 1, 4);
                  if(var5 == 0) {
                     break label47;
                  }
               }

               if(var3 == 1) {
                  this.field_845[var1][var2] |= 2;
                  if(var1 <= 0) {
                     break label47;
                  }

                  this.method_322(var1 - 1, var2, 8);
                  if(var5 == 0) {
                     break label47;
                  }
               }

               if(var3 == 2) {
                  this.field_845[var1][var2] |= 16;
                  if(var5 == 0) {
                     break label47;
                  }
               }

               if(var3 == 3) {
                  this.field_845[var1][var2] |= 32;
               }
            }

            this.method_328(var1, var2, 1, 1);
         }

      }
   }

   // $FF: renamed from: b (int, int, int, int) void
   public void method_325(int var1, int var2, int var3, int var4) {
      int var5 = class_4.field_563;
      if(var1 >= 0 && var2 >= 0 && var1 < this.field_840 - 1 && var2 < this.field_841 - 1) {
         if(class_4.field_532[var4] == 1) {
            label47: {
               if(var3 == 0) {
                  this.field_845[var1][var2] &= '\ufffe';
                  if(var2 <= 0) {
                     break label47;
                  }

                  this.method_323(var1, var2 - 1, 4);
                  if(var5 == 0) {
                     break label47;
                  }
               }

               if(var3 == 1) {
                  this.field_845[var1][var2] &= '\ufffd';
                  if(var1 <= 0) {
                     break label47;
                  }

                  this.method_323(var1 - 1, var2, 8);
                  if(var5 == 0) {
                     break label47;
                  }
               }

               if(var3 == 2) {
                  this.field_845[var1][var2] &= '\uffef';
                  if(var5 == 0) {
                     break label47;
                  }
               }

               if(var3 == 3) {
                  this.field_845[var1][var2] &= '\uffdf';
               }
            }

            this.method_328(var1, var2, 1, 1);
         }

      }
   }

   // $FF: renamed from: c (int, int, int) void
   public void method_326(int var1, int var2, int var3) {
      int var9 = class_4.field_563;
      if(var1 >= 0 && var2 >= 0 && var1 < this.field_840 - 1 && var2 < this.field_841 - 1) {
         if(class_4.field_522[var3] == 1 || class_4.field_522[var3] == 2) {
            int var4;
            int var5;
            int var6;
            label105: {
               var4 = this.method_341(var1, var2);
               if(var4 == 0 || var4 == 4) {
                  var5 = class_4.field_520[var3];
                  var6 = class_4.field_521[var3];
                  if(var9 == 0) {
                     break label105;
                  }
               }

               var6 = class_4.field_520[var3];
               var5 = class_4.field_521[var3];
            }

            int var7 = var1;
            if(var9 != 0 || var1 < var1 + var5) {
               do {
                  int var8 = var2;
                  if(var9 == 0 && var2 >= var2 + var6) {
                     ++var7;
                  } else {
                     do {
                        label104: {
                           if(class_4.field_522[var3] == 1) {
                              this.field_845[var7][var8] |= 64;
                              if(var9 == 0) {
                                 break label104;
                              }
                           }

                           if(var4 == 0) {
                              this.field_845[var7][var8] |= 2;
                              if(var7 <= 0) {
                                 break label104;
                              }

                              this.method_322(var7 - 1, var8, 8);
                              if(var9 == 0) {
                                 break label104;
                              }
                           }

                           if(var4 == 2) {
                              this.field_845[var7][var8] |= 4;
                              if(var8 >= this.field_841 - 1) {
                                 break label104;
                              }

                              this.method_322(var7, var8 + 1, 1);
                              if(var9 == 0) {
                                 break label104;
                              }
                           }

                           if(var4 == 4) {
                              this.field_845[var7][var8] |= 8;
                              if(var7 >= this.field_840 - 1) {
                                 break label104;
                              }

                              this.method_322(var7 + 1, var8, 2);
                              if(var9 == 0) {
                                 break label104;
                              }
                           }

                           if(var4 == 6) {
                              this.field_845[var7][var8] |= 1;
                              if(var8 > 0) {
                                 this.method_322(var7, var8 - 1, 4);
                              }
                           }
                        }

                        ++var8;
                     } while(var8 < var2 + var6);

                     ++var7;
                  }
               } while(var7 < var1 + var5);
            }

            this.method_328(var1, var2, var5, var6);
         }

      }
   }

   // $FF: renamed from: d (int, int, int) void
   public void method_327(int var1, int var2, int var3) {
      int var9 = class_4.field_563;
      if(var1 >= 0 && var2 >= 0 && var1 < this.field_840 - 1 && var2 < this.field_841 - 1) {
         if(class_4.field_522[var3] == 1 || class_4.field_522[var3] == 2) {
            int var4;
            int var5;
            int var6;
            label105: {
               var4 = this.method_341(var1, var2);
               if(var4 == 0 || var4 == 4) {
                  var5 = class_4.field_520[var3];
                  var6 = class_4.field_521[var3];
                  if(var9 == 0) {
                     break label105;
                  }
               }

               var6 = class_4.field_520[var3];
               var5 = class_4.field_521[var3];
            }

            int var7 = var1;
            if(var9 != 0 || var1 < var1 + var5) {
               do {
                  int var8 = var2;
                  if(var9 == 0 && var2 >= var2 + var6) {
                     ++var7;
                  } else {
                     do {
                        label104: {
                           if(class_4.field_522[var3] == 1) {
                              this.field_845[var7][var8] &= '\uffbf';
                              if(var9 == 0) {
                                 break label104;
                              }
                           }

                           if(var4 == 0) {
                              this.field_845[var7][var8] &= '\ufffd';
                              if(var7 <= 0) {
                                 break label104;
                              }

                              this.method_323(var7 - 1, var8, 8);
                              if(var9 == 0) {
                                 break label104;
                              }
                           }

                           if(var4 == 2) {
                              this.field_845[var7][var8] &= '\ufffb';
                              if(var8 >= this.field_841 - 1) {
                                 break label104;
                              }

                              this.method_323(var7, var8 + 1, 1);
                              if(var9 == 0) {
                                 break label104;
                              }
                           }

                           if(var4 == 4) {
                              this.field_845[var7][var8] &= '\ufff7';
                              if(var7 >= this.field_840 - 1) {
                                 break label104;
                              }

                              this.method_323(var7 + 1, var8, 2);
                              if(var9 == 0) {
                                 break label104;
                              }
                           }

                           if(var4 == 6) {
                              this.field_845[var7][var8] &= '\ufffe';
                              if(var8 > 0) {
                                 this.method_323(var7, var8 - 1, 4);
                              }
                           }
                        }

                        ++var8;
                     } while(var8 < var2 + var6);

                     ++var7;
                  }
               } while(var7 < var1 + var5);
            }

            this.method_328(var1, var2, var5, var6);
         }

      }
   }

   // $FF: renamed from: c (int, int, int, int) void
   public void method_328(int var1, int var2, int var3, int var4) {
      int var7 = class_4.field_563;
      if(var1 >= 1 && var2 >= 1 && var1 + var3 < this.field_840 && var2 + var4 < this.field_841) {
         int var5 = var1;
         if(var7 != 0 || var1 <= var1 + var3) {
            do {
               int var6 = var2;
               if(var7 == 0 && var2 > var2 + var4) {
                  ++var5;
               } else {
                  do {
                     label66: {
                        if((this.method_331(var5, var6) & 99) != 0 || (this.method_331(var5 - 1, var6) & 89) != 0 || (this.method_331(var5, var6 - 1) & 86) != 0 || (this.method_331(var5 - 1, var6 - 1) & 108) != 0) {
                           this.method_329(var5, var6, 35);
                           if(var7 == 0) {
                              break label66;
                           }
                        }

                        this.method_329(var5, var6, 0);
                     }

                     ++var6;
                  } while(var6 <= var2 + var4);

                  ++var5;
               }
            } while(var5 <= var1 + var3);

         }
      }
   }

   // $FF: renamed from: e (int, int, int) void
   public void method_329(int var1, int var2, int var3) {
      int var4 = var1 / 12;
      int var5 = var2 / 12;
      int var6 = (var1 - 1) / 12;
      int var7 = (var2 - 1) / 12;
      this.method_330(var4, var5, var1, var2, var3);
      if(var4 != var6) {
         this.method_330(var6, var5, var1, var2, var3);
      }

      if(var5 != var7) {
         this.method_330(var4, var7, var1, var2, var3);
      }

      if(var4 != var6 && var5 != var7) {
         this.method_330(var6, var7, var1, var2, var3);
      }

   }

   // $FF: renamed from: a (int, int, int, int, int) void
   public void method_330(int var1, int var2, int var3, int var4, int var5) {
      class_15 var6 = this.field_848[var1 + var2 * 8];
      int var7 = 0;
      if(class_4.field_563 != 0 || var7 < var6.field_852) {
         do {
            if(var6.field_898[var7] == var3 * 128 && var6.field_900[var7] == var4 * 128) {
               var6.method_374(var7, var5);
               return;
            }

            ++var7;
         } while(var7 < var6.field_852);

      }
   }

   // $FF: renamed from: a (int, int) int
   public int method_331(int var1, int var2) {
      return var1 >= 0 && var2 >= 0 && var1 < this.field_840 && var2 < this.field_841?this.field_845[var1][var2]:0;
   }

   // $FF: renamed from: b (int, int) int
   public int method_332(int var1, int var2) {
      int var3 = var1 >> 7;
      int var4 = var2 >> 7;
      int var5 = var1 & 127;
      int var6 = var2 & 127;
      if(var3 >= 0 && var4 >= 0 && var3 < this.field_840 - 1 && var4 < this.field_841 - 1) {
         int var7;
         int var8;
         int var9;
         label16: {
            if(var5 <= 128 - var6) {
               var7 = this.method_333(var3, var4);
               var8 = this.method_333(var3 + 1, var4) - var7;
               var9 = this.method_333(var3, var4 + 1) - var7;
               if(class_4.field_563 == 0) {
                  break label16;
               }
            }

            var7 = this.method_333(var3 + 1, var4 + 1);
            var8 = this.method_333(var3, var4 + 1) - var7;
            var9 = this.method_333(var3 + 1, var4) - var7;
            var5 = 128 - var5;
            var6 = 128 - var6;
         }

         int var10 = var7 + var8 * var5 / 128 + var9 * var6 / 128;
         return var10;
      } else {
         return 0;
      }
   }

   // $FF: renamed from: c (int, int) int
   public int method_333(int var1, int var2) {
      int var4 = class_4.field_563;
      if(var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if(var1 >= 48 && var2 < 48) {
            var3 = 1;
            var1 -= 48;
            if(var4 == 0) {
               return (this.field_832[var3][var1 * 48 + var2] & 255) * 3;
            }
         }

         if(var1 < 48 && var2 >= 48) {
            var3 = 2;
            var2 -= 48;
            if(var4 == 0) {
               return (this.field_832[var3][var1 * 48 + var2] & 255) * 3;
            }
         }

         if(var1 >= 48 && var2 >= 48) {
            var3 = 3;
            var1 -= 48;
            var2 -= 48;
         }

         return (this.field_832[var3][var1 * 48 + var2] & 255) * 3;
      } else {
         return 0;
      }
   }

   // $FF: renamed from: d (int, int) int
   public int method_334(int var1, int var2) {
      int var4 = class_4.field_563;
      if(var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if(var1 >= 48 && var2 < 48) {
            var3 = 1;
            var1 -= 48;
            if(var4 == 0) {
               return this.field_833[var3][var1 * 48 + var2] & 255;
            }
         }

         if(var1 < 48 && var2 >= 48) {
            var3 = 2;
            var2 -= 48;
            if(var4 == 0) {
               return this.field_833[var3][var1 * 48 + var2] & 255;
            }
         }

         if(var1 >= 48 && var2 >= 48) {
            var3 = 3;
            var1 -= 48;
            var2 -= 48;
         }

         return this.field_833[var3][var1 * 48 + var2] & 255;
      } else {
         return 0;
      }
   }

   // $FF: renamed from: f (int, int, int) int
   public int method_335(int var1, int var2, int var3) {
      int var5 = class_4.field_563;
      if(var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var4 = 0;
         if(var1 >= 48 && var2 < 48) {
            var4 = 1;
            var1 -= 48;
            if(var5 == 0) {
               return this.field_837[var4][var1 * 48 + var2] & 255;
            }
         }

         if(var1 < 48 && var2 >= 48) {
            var4 = 2;
            var2 -= 48;
            if(var5 == 0) {
               return this.field_837[var4][var1 * 48 + var2] & 255;
            }
         }

         if(var1 >= 48 && var2 >= 48) {
            var4 = 3;
            var1 -= 48;
            var2 -= 48;
         }

         return this.field_837[var4][var1 * 48 + var2] & 255;
      } else {
         return 0;
      }
   }

   // $FF: renamed from: g (int, int, int) void
   public void method_336(int var1, int var2, int var3) {
      int var5 = class_4.field_563;
      if(var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var4;
         label37: {
            var4 = 0;
            if(var1 >= 48 && var2 < 48) {
               var4 = 1;
               var1 -= 48;
               if(var5 == 0) {
                  break label37;
               }
            }

            if(var1 < 48 && var2 >= 48) {
               var4 = 2;
               var2 -= 48;
               if(var5 == 0) {
                  break label37;
               }
            }

            if(var1 >= 48 && var2 >= 48) {
               var4 = 3;
               var1 -= 48;
               var2 -= 48;
            }
         }

         this.field_837[var4][var1 * 48 + var2] = (byte)var3;
      }
   }

   // $FF: renamed from: h (int, int, int) int
   public int method_337(int var1, int var2, int var3) {
      int var4 = this.method_335(var1, var2, var3);
      if(var4 == 0) {
         return -1;
      } else {
         int var5 = class_4.field_539[var4 - 1];
         return var5 == 2?1:0;
      }
   }

   // $FF: renamed from: d (int, int, int, int) int
   public int method_338(int var1, int var2, int var3, int var4) {
      int var5 = this.method_335(var1, var2, var3);
      return var5 == 0?var4:class_4.field_538[var5 - 1];
   }

   // $FF: renamed from: e (int, int) int
   public int method_339(int var1, int var2) {
      int var4 = class_4.field_563;
      if(var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if(var1 >= 48 && var2 < 48) {
            var3 = 1;
            var1 -= 48;
            if(var4 == 0) {
               return this.field_839[var3][var1 * 48 + var2];
            }
         }

         if(var1 < 48 && var2 >= 48) {
            var3 = 2;
            var2 -= 48;
            if(var4 == 0) {
               return this.field_839[var3][var1 * 48 + var2];
            }
         }

         if(var1 >= 48 && var2 >= 48) {
            var3 = 3;
            var1 -= 48;
            var2 -= 48;
         }

         return this.field_839[var3][var1 * 48 + var2];
      } else {
         return 0;
      }
   }

   // $FF: renamed from: f (int, int) int
   public int method_340(int var1, int var2) {
      int var4 = class_4.field_563;
      if(var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if(var1 >= 48 && var2 < 48) {
            var3 = 1;
            var1 -= 48;
            if(var4 == 0) {
               return this.field_836[var3][var1 * 48 + var2];
            }
         }

         if(var1 < 48 && var2 >= 48) {
            var3 = 2;
            var2 -= 48;
            if(var4 == 0) {
               return this.field_836[var3][var1 * 48 + var2];
            }
         }

         if(var1 >= 48 && var2 >= 48) {
            var3 = 3;
            var1 -= 48;
            var2 -= 48;
         }

         return this.field_836[var3][var1 * 48 + var2];
      } else {
         return 0;
      }
   }

   // $FF: renamed from: g (int, int) int
   public int method_341(int var1, int var2) {
      int var4 = class_4.field_563;
      if(var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if(var1 >= 48 && var2 < 48) {
            var3 = 1;
            var1 -= 48;
            if(var4 == 0) {
               return this.field_838[var3][var1 * 48 + var2];
            }
         }

         if(var1 < 48 && var2 >= 48) {
            var3 = 2;
            var2 -= 48;
            if(var4 == 0) {
               return this.field_838[var3][var1 * 48 + var2];
            }
         }

         if(var1 >= 48 && var2 >= 48) {
            var3 = 3;
            var1 -= 48;
            var2 -= 48;
         }

         return this.field_838[var3][var1 * 48 + var2];
      } else {
         return 0;
      }
   }

   // $FF: renamed from: h (int, int) boolean
   public boolean method_342(int var1, int var2) {
      return this.method_340(var1, var2) > 0 || this.method_340(var1 - 1, var2) > 0 || this.method_340(var1 - 1, var2 - 1) > 0 || this.method_340(var1, var2 - 1) > 0;
   }

   // $FF: renamed from: i (int, int) boolean
   public boolean method_343(int var1, int var2) {
      return this.method_340(var1, var2) > 0 && this.method_340(var1 - 1, var2) > 0 && this.method_340(var1 - 1, var2 - 1) > 0 && this.method_340(var1, var2 - 1) > 0;
   }

   // $FF: renamed from: j (int, int) int
   public int method_344(int var1, int var2) {
      int var4 = class_4.field_563;
      if(var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if(var1 >= 48 && var2 < 48) {
            var3 = 1;
            var1 -= 48;
            if(var4 == 0) {
               return this.field_835[var3][var1 * 48 + var2] & 255;
            }
         }

         if(var1 < 48 && var2 >= 48) {
            var3 = 2;
            var2 -= 48;
            if(var4 == 0) {
               return this.field_835[var3][var1 * 48 + var2] & 255;
            }
         }

         if(var1 >= 48 && var2 >= 48) {
            var3 = 3;
            var1 -= 48;
            var2 -= 48;
         }

         return this.field_835[var3][var1 * 48 + var2] & 255;
      } else {
         return 0;
      }
   }

   // $FF: renamed from: k (int, int) int
   public int method_345(int var1, int var2) {
      int var4 = class_4.field_563;
      if(var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if(var1 >= 48 && var2 < 48) {
            var3 = 1;
            var1 -= 48;
            if(var4 == 0) {
               return this.field_834[var3][var1 * 48 + var2] & 255;
            }
         }

         if(var1 < 48 && var2 >= 48) {
            var3 = 2;
            var2 -= 48;
            if(var4 == 0) {
               return this.field_834[var3][var1 * 48 + var2] & 255;
            }
         }

         if(var1 >= 48 && var2 >= 48) {
            var3 = 3;
            var1 -= 48;
            var2 -= 48;
         }

         return this.field_834[var3][var1 * 48 + var2] & 255;
      } else {
         return 0;
      }
   }

   // $FF: renamed from: e (int, int, int, int) void
   public void method_346(int i, int j, int k, int l) {
      String s = "m" + k + i / 10 + i % 10 + j / 10 + j % 10;
      try {
         if (this.field_828 != null) {
            byte[] file_buf = a.class_21.method_460(s + ".hei", 0, this.field_828);
            if ((file_buf == null) && (this.field_830 != null))
               file_buf = a.class_21.method_460(s + ".hei", 0, this.field_830);
            if ((file_buf != null) && (file_buf.length > 0)) {
               int j1 = 0;
               int prev_val = 0;
               for (int j3 = 0; j3 < 2304;) {
                  int height = file_buf[(j1++)] & 0xFF;
                  if (height < 128) {
                     this.field_832[l][(j3++)] = (byte) height;
                     prev_val = height;
                  }
                  if (height >= 128) {
                     for (int l5 = 0; l5 < height - 128; l5++) {
                        this.field_832[l][(j3++)] = (byte) prev_val;
                     }
                  }
               }

               prev_val = 64;
               for (int k4 = 0; k4 < 48; k4++) {
                  for (int i6 = 0; i6 < 48; i6++) {
                     prev_val = this.field_832[l][(i6 * 48 + k4)]
                             + prev_val & 0x7F;
                     this.field_832[l][(i6 * 48 + k4)] = (byte) (prev_val * 2);
                  }

               }

               prev_val = 0;
               for (int j6 = 0; j6 < 2304;) {
                  int k7 = file_buf[(j1++)] & 0xFF;
                  if (k7 < 128) {
                     this.field_833[l][(j6++)] = (byte) k7;
                     prev_val = k7;
                  }
                  if (k7 >= 128) {
                     for (int i9 = 0; i9 < k7 - 128; i9++) {
                        this.field_833[l][(j6++)] = (byte) prev_val;
                     }
                  }
               }

               prev_val = 35;
               for (int l7 = 0; l7 < 48; l7++) {
                  for (int j9 = 0; j9 < 48; j9++) {
                     prev_val = this.field_833[l][(j9 * 48 + l7)]
                             + prev_val & 0x7F;
                     this.field_833[l][(j9 * 48 + l7)] = (byte) (prev_val * 2);
                  }
               }
            } else {
               for (int k1 = 0; k1 < 2304; k1++) {
                  this.field_832[l][k1] = 0;
                  this.field_833[l][k1] = 0;
               }
            }

            file_buf = a.class_21.method_460(s + ".dat", 0, this.field_829);
            if ((file_buf == null) && (this.field_831 != null))
               file_buf = a.class_21.method_460(s + ".dat", 0, this.field_831);
            if ((file_buf == null) || (file_buf.length == 0))
               throw new IOException();
            int l1 = 0;
            for (int l2 = 0; l2 < 2304;) {
               int k3 = file_buf[(l1++)] & 0xFF;
               if (k3 < 128)
                  this.field_834[l][(l2++)] = (byte) k3;
               else {
                  for (int l4 = 0; l4 < k3 - 128; l4++) {
                     this.field_834[l][(l2++)] = 0;
                  }
               }
            }

            for (int l3 = 0; l3 < 2304;) {
               int i5 = file_buf[(l1++)] & 0xFF;
               if (i5 < 128)
                  this.field_835[l][(l3++)] = (byte) i5;
               else {
                  for (int k6 = 0; k6 < i5 - 128; k6++) {
                     this.field_835[l][(l3++)] = 0;
                  }
               }
            }

            for (int j5 = 0; j5 < 2304;) {
               int l6 = file_buf[(l1++)] & 0xFF;
               if (l6 < 128)
                  this.field_839[l][(j5++)] = l6;
               else {
                  for (int i8 = 0; i8 < l6 - 128; i8++) {
                     this.field_839[l][(j5++)] = 0;
                  }
               }
            }

            for (int i7 = 0; i7 < 2304;) {
               int j8 = file_buf[(l1++)] & 0xFF;
               if (j8 < 128)
                  this.field_839[l][(i7++)] = (j8 + 12000);
               else {
                  i7 += j8 - 128;
               }
            }
            for (int k8 = 0; k8 < 2304;) {
               int k9 = file_buf[(l1++)] & 0xFF;
               if (k9 < 128)
                  this.field_836[l][(k8++)] = (byte) k9;
               else {
                  for (int j10 = 0; j10 < k9 - 128; j10++) {
                     this.field_836[l][(k8++)] = 0;
                  }
               }
            }

            int l9 = 0;
            for (int k10 = 0; k10 < 2304;) {
               int i11 = file_buf[(l1++)] & 0xFF;
               if (i11 < 128) {
                  this.field_837[l][(k10++)] = (byte) i11;
                  l9 = i11;
               } else {
                  for (int l11 = 0; l11 < i11 - 128; l11++) {
                     this.field_837[l][(k10++)] = (byte) l9;
                  }
               }
            }

            for (int j11 = 0; j11 < 2304;) {
               int i12 = file_buf[(l1++)] & 0xFF;
               if (i12 < 128)
                  this.field_838[l][(j11++)] = (byte) i12;
               else {
                  for (int l12 = 0; l12 < i12 - 128; l12++) {
                     this.field_838[l][(j11++)] = 0;
                  }
               }
            }

            file_buf = a.class_21.method_460(s + ".loc", 0, this.field_829);
            if ((file_buf != null) && (file_buf.length > 0)) {
               int i2 = 0;
               for (int j12 = 0; j12 < 2304;) {
                  int val = file_buf[(i2++)] & 0xFF;
                  if (val < 128) {
                     this.field_839[l][(j12++)] = (val + 48000);
                  } else {
                     j12 += val - 128;
                  }
               }
            }
         } else {
            byte[] abyte1 = new byte[20736];
            a.class_21.method_444("../gamedata/maps/" + s + ".jm", abyte1, 20736);
            int j2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 2304; i4++) {
               j2 = j2 + abyte1[(i3++)] & 0xFF;
               this.field_832[l][i4] = (byte) j2;
            }

            j2 = 0;
            for (int k5 = 0; k5 < 2304; k5++) {
               j2 = j2 + abyte1[(i3++)] & 0xFF;
               this.field_833[l][k5] = (byte) j2;
            }

            for (int j7 = 0; j7 < 2304; j7++) {
               this.field_834[l][j7] = abyte1[(i3++)];
            }
            for (int l8 = 0; l8 < 2304; l8++) {
               this.field_835[l][l8] = abyte1[(i3++)];
            }
            for (int i10 = 0; i10 < 2304; i10++) {
               this.field_839[l][i10] = ((abyte1[i3] & 0xFF) * 256 + (abyte1[(i3 + 1)] & 0xFF));
               i3 += 2;
            }

            for (int l10 = 0; l10 < 2304; l10++) {
               this.field_836[l][l10] = abyte1[(i3++)];
            }
            for (int k11 = 0; k11 < 2304; k11++) {
               this.field_837[l][k11] = abyte1[(i3++)];
            }
            for (int k12 = 0; k12 < 2304; k12++) {
               this.field_838[l][k12] = abyte1[(i3++)];
            }
         }
         return;
      } catch (IOException _ex) {
         int i1 = 0;

         for (; i1 < 2304; i1++) {
            this.field_832[l][i1] = 0;
            this.field_833[l][i1] = 0;
            this.field_834[l][i1] = 0;
            this.field_835[l][i1] = 0;
            this.field_839[l][i1] = 0;
            this.field_836[l][i1] = 0;
            this.field_837[l][i1] = 0;
            if (k == 0)
               this.field_837[l][i1] = -6;
            if (k == 3)
               this.field_837[l][i1] = 8;
            this.field_838[l][i1] = 0;
         }
      }
   }

   // $FF: renamed from: a () void
   public void method_347() {
      int var4 = class_4.field_563;
      if(this.field_821) {
         this.field_823.method_172();
      }

      int var1 = 0;
      if(var4 == 0 && var1 >= 64) {
         System.gc();
      } else {
         do {
            this.field_848[var1] = null;
            int var2 = 0;
            if(var4 != 0) {
               this.field_849[var2][var1] = null;
               ++var2;
            }

            while(var2 < 4) {
               this.field_849[var2][var1] = null;
               ++var2;
            }

            int var3 = 0;
            if(var4 != 0 || var3 < 4) {
               do {
                  this.field_850[var3][var1] = null;
                  ++var3;
               } while(var3 < 4);

               ++var1;
            } else {
               ++var1;
            }
         } while(var1 < 64);

         System.gc();
      }
   }

   // $FF: renamed from: i (int, int, int) void
   public void method_348(int var1, int var2, int var3) {
      this.method_347();
      int var4 = (var1 + 24) / 48;
      int var5 = (var2 + 24) / 48;
      this.method_351(var1, var2, var3, true);
      if(var3 == 0) {
         this.method_351(var1, var2, 1, false);
         this.method_351(var1, var2, 2, false);
         this.method_346(var4 - 1, var5 - 1, var3, 0);
         this.method_346(var4, var5 - 1, var3, 1);
         this.method_346(var4 - 1, var5, var3, 2);
         this.method_346(var4, var5, var3, 3);
         this.method_349();
      }

   }

   // $FF: renamed from: b () void
   public void method_349() {
      int var3 = class_4.field_563;
      int var1 = 0;
      if(var3 != 0 || var1 < 96) {
         do {
            int var2 = 0;
            if(var3 == 0 && var2 >= 96) {
               ++var1;
            } else {
               do {
                  if(this.method_335(var1, var2, 0) == 250) {
                     label57: {
                        if(var1 == 47 && this.method_335(var1 + 1, var2, 0) != 250 && this.method_335(var1 + 1, var2, 0) != 2) {
                           this.method_336(var1, var2, 9);
                           if(var3 == 0) {
                              break label57;
                           }
                        }

                        if(var2 == 47 && this.method_335(var1, var2 + 1, 0) != 250 && this.method_335(var1, var2 + 1, 0) != 2) {
                           this.method_336(var1, var2, 9);
                           if(var3 == 0) {
                              break label57;
                           }
                        }

                        this.method_336(var1, var2, 2);
                     }
                  }

                  ++var2;
               } while(var2 < 96);

               ++var1;
            }
         } while(var1 < 96);

      }
   }

   // $FF: renamed from: b (int, int, int, int, int) void
   public void method_350(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 * 3;
      int var7 = var2 * 3;
      int var8 = this.field_823.method_209(var4);
      int var9 = this.field_823.method_209(var5);
      var8 = var8 >> 1 & 8355711;
      var9 = var9 >> 1 & 8355711;
      if(var3 == 0) {
         this.field_822.method_229(var6, var7, 3, var8);
         this.field_822.method_229(var6, var7 + 1, 2, var8);
         this.field_822.method_229(var6, var7 + 2, 1, var8);
         this.field_822.method_229(var6 + 2, var7 + 1, 1, var9);
         this.field_822.method_229(var6 + 1, var7 + 2, 2, var9);
      } else {
         if(var3 == 1) {
            this.field_822.method_229(var6, var7, 3, var9);
            this.field_822.method_229(var6 + 1, var7 + 1, 2, var9);
            this.field_822.method_229(var6 + 2, var7 + 2, 1, var9);
            this.field_822.method_229(var6, var7 + 1, 1, var8);
            this.field_822.method_229(var6, var7 + 2, 2, var8);
         }

      }
   }

   // $FF: renamed from: a (int, int, int, boolean) void
   public void method_351(int var1, int var2, int var3, boolean var4) {
      int var40 = class_4.field_563;
      int var5 = (var1 + 24) / 48;
      int var6 = (var2 + 24) / 48;
      this.method_346(var5 - 1, var6 - 1, var3, 0);
      this.method_346(var5, var6 - 1, var3, 1);
      this.method_346(var5 - 1, var6, var3, 2);
      this.method_346(var5, var6, var3, 3);
      this.method_349();
      if(this.field_851 == null) {
         this.field_851 = new class_15(this.field_840 * this.field_841 * 2 + 256, this.field_840 * this.field_841 * 2 + 256, true, true, false, false, true);
      }

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var17;
      int var18;
      int var20;
      int var43;
      int var44;
      if(var4) {
         this.field_822.method_223();
         var7 = 0;
         if(var40 != 0 || var7 < 96) {
            do {
               var8 = 0;
               if(var40 == 0 && var8 >= 96) {
                  ++var7;
               } else {
                  do {
                     this.field_845[var7][var8] = 0;
                     ++var8;
                  } while(var8 < 96);

                  ++var7;
               }
            } while(var7 < 96);
         }

         class_15 var41 = this.field_851;
         var41.method_359();
         var9 = 0;
         if(var40 != 0 || var9 < 96) {
            do {
               var10 = 0;
               if(var40 == 0 && var10 >= 96) {
                  ++var9;
               } else {
                  do {
                     var11 = -this.method_333(var9, var10);
                     if(this.method_335(var9, var10, var3) > 0 && class_4.field_539[this.method_335(var9, var10, var3) - 1] == 4) {
                        var11 = 0;
                     }

                     if(this.method_335(var9 - 1, var10, var3) > 0 && class_4.field_539[this.method_335(var9 - 1, var10, var3) - 1] == 4) {
                        var11 = 0;
                     }

                     if(this.method_335(var9, var10 - 1, var3) > 0 && class_4.field_539[this.method_335(var9, var10 - 1, var3) - 1] == 4) {
                        var11 = 0;
                     }

                     if(this.method_335(var9 - 1, var10 - 1, var3) > 0 && class_4.field_539[this.method_335(var9 - 1, var10 - 1, var3) - 1] == 4) {
                        var11 = 0;
                     }

                     var12 = var41.method_366(var9 * 128, var11, var10 * 128);
                     var13 = (int)(Math.random() * 10.0D) - 5;
                     var41.method_374(var12, var13);
                     ++var10;
                  } while(var10 < 96);

                  ++var9;
               }
            } while(var9 < 96);
         }

         var10 = 0;
         int[] var42;
         if(var40 != 0 || var10 < 95) {
            do {
               var11 = 0;
               if(var40 == 0 && var11 >= 95) {
                  ++var10;
               } else {
                  do {
                     var12 = this.method_334(var10, var11);
                     var13 = this.field_827[var12];
                     var14 = var13;
                     var15 = var13;
                     byte var16 = 0;
                     if(var3 == 1 || var3 == 2) {
                        var13 = 12345678;
                        var14 = 12345678;
                        var15 = 12345678;
                     }

                     if(this.method_335(var10, var11, var3) > 0) {
                        var17 = this.method_335(var10, var11, var3);
                        var12 = class_4.field_539[var17 - 1];
                        var18 = this.method_337(var10, var11, var3);
                        var13 = var14 = class_4.field_538[var17 - 1];
                        if(var12 == 4) {
                           var13 = 1;
                           var14 = 1;
                           if(var17 == 12) {
                              var13 = 31;
                              var14 = 31;
                           }
                        }

                        label1123: {
                           if(var12 == 5) {
                              if(this.method_339(var10, var11) <= 0 || this.method_339(var10, var11) >= 24000) {
                                 break label1123;
                              }

                              if(this.method_338(var10 - 1, var11, var3, var15) != 12345678 && this.method_338(var10, var11 - 1, var3, var15) != 12345678) {
                                 var13 = this.method_338(var10 - 1, var11, var3, var15);
                                 var16 = 0;
                                 if(var40 == 0) {
                                    break label1123;
                                 }
                              }

                              if(this.method_338(var10 + 1, var11, var3, var15) != 12345678 && this.method_338(var10, var11 + 1, var3, var15) != 12345678) {
                                 var14 = this.method_338(var10 + 1, var11, var3, var15);
                                 var16 = 0;
                                 if(var40 == 0) {
                                    break label1123;
                                 }
                              }

                              if(this.method_338(var10 + 1, var11, var3, var15) != 12345678 && this.method_338(var10, var11 - 1, var3, var15) != 12345678) {
                                 var14 = this.method_338(var10 + 1, var11, var3, var15);
                                 var16 = 1;
                                 if(var40 == 0) {
                                    break label1123;
                                 }
                              }

                              if(this.method_338(var10 - 1, var11, var3, var15) == 12345678 || this.method_338(var10, var11 + 1, var3, var15) == 12345678) {
                                 break label1123;
                              }

                              var13 = this.method_338(var10 - 1, var11, var3, var15);
                              var16 = 1;
                              if(var40 == 0) {
                                 break label1123;
                              }
                           }

                           if(var12 != 2 || this.method_339(var10, var11) > 0 && this.method_339(var10, var11) < 24000) {
                              label1175: {
                                 if(this.method_337(var10 - 1, var11, var3) != var18 && this.method_337(var10, var11 - 1, var3) != var18) {
                                    var13 = var15;
                                    var16 = 0;
                                    if(var40 == 0) {
                                       break label1175;
                                    }
                                 }

                                 if(this.method_337(var10 + 1, var11, var3) != var18 && this.method_337(var10, var11 + 1, var3) != var18) {
                                    var14 = var15;
                                    var16 = 0;
                                    if(var40 == 0) {
                                       break label1175;
                                    }
                                 }

                                 if(this.method_337(var10 + 1, var11, var3) != var18 && this.method_337(var10, var11 - 1, var3) != var18) {
                                    var14 = var15;
                                    var16 = 1;
                                    if(var40 == 0) {
                                       break label1175;
                                    }
                                 }

                                 if(this.method_337(var10 - 1, var11, var3) != var18 && this.method_337(var10, var11 + 1, var3) != var18) {
                                    var13 = var15;
                                    var16 = 1;
                                 }
                              }
                           }
                        }

                        if(class_4.field_540[var17 - 1] != 0) {
                           this.field_845[var10][var11] |= 64;
                        }

                        if(class_4.field_539[var17 - 1] == 2) {
                           this.field_845[var10][var11] |= 128;
                        }
                     }

                     label1167: {
                        this.method_350(var10, var11, var16, var13, var14);
                        var17 = this.method_333(var10 + 1, var11 + 1) - this.method_333(var10 + 1, var11) + this.method_333(var10, var11 + 1) - this.method_333(var10, var11);
                        if(var13 != var14 || var17 != 0) {
                           var42 = new int[3];
                           int[] var19 = new int[3];
                           if(var16 == 0) {
                              if(var13 != 12345678) {
                                 var42[0] = var11 + var10 * this.field_840 + this.field_840;
                                 var42[1] = var11 + var10 * this.field_840;
                                 var42[2] = var11 + var10 * this.field_840 + 1;
                                 var20 = var41.method_368(3, var42, 12345678, var13);
                                 this.field_842[var20] = var10;
                                 this.field_843[var20] = var11;
                                 var41.field_884[var20] = 200000 + var20;
                              }

                              if(var14 == 12345678) {
                                 break label1167;
                              }

                              var19[0] = var11 + var10 * this.field_840 + 1;
                              var19[1] = var11 + var10 * this.field_840 + this.field_840 + 1;
                              var19[2] = var11 + var10 * this.field_840 + this.field_840;
                              var20 = var41.method_368(3, var19, 12345678, var14);
                              this.field_842[var20] = var10;
                              this.field_843[var20] = var11;
                              var41.field_884[var20] = 200000 + var20;
                              if(var40 == 0) {
                                 break label1167;
                              }
                           }

                           if(var13 != 12345678) {
                              var42[0] = var11 + var10 * this.field_840 + 1;
                              var42[1] = var11 + var10 * this.field_840 + this.field_840 + 1;
                              var42[2] = var11 + var10 * this.field_840;
                              var20 = var41.method_368(3, var42, 12345678, var13);
                              this.field_842[var20] = var10;
                              this.field_843[var20] = var11;
                              var41.field_884[var20] = 200000 + var20;
                           }

                           if(var14 == 12345678) {
                              break label1167;
                           }

                           var19[0] = var11 + var10 * this.field_840 + this.field_840;
                           var19[1] = var11 + var10 * this.field_840;
                           var19[2] = var11 + var10 * this.field_840 + this.field_840 + 1;
                           var20 = var41.method_368(3, var19, 12345678, var14);
                           this.field_842[var20] = var10;
                           this.field_843[var20] = var11;
                           var41.field_884[var20] = 200000 + var20;
                           if(var40 == 0) {
                              break label1167;
                           }
                        }

                        if(var13 != 12345678) {
                           var42 = new int[]{var11 + var10 * this.field_840 + this.field_840, var11 + var10 * this.field_840, var11 + var10 * this.field_840 + 1, var11 + var10 * this.field_840 + this.field_840 + 1};
                           var44 = var41.method_368(4, var42, 12345678, var13);
                           this.field_842[var44] = var10;
                           this.field_843[var44] = var11;
                           var41.field_884[var44] = 200000 + var44;
                        }
                     }

                     ++var11;
                  } while(var11 < 95);

                  ++var10;
               }
            } while(var10 < 95);
         }

         var11 = 1;
         if(var40 != 0 || var11 < 95) {
            do {
               var12 = 1;
               if(var40 == 0 && var12 >= 95) {
                  ++var11;
               } else {
                  do {
                     label1128: {
                        if(this.method_335(var11, var12, var3) > 0 && class_4.field_539[this.method_335(var11, var12, var3) - 1] == 4) {
                           var13 = class_4.field_538[this.method_335(var11, var12, var3) - 1];
                           var14 = var41.method_366(var11 * 128, -this.method_333(var11, var12), var12 * 128);
                           var15 = var41.method_366((var11 + 1) * 128, -this.method_333(var11 + 1, var12), var12 * 128);
                           var43 = var41.method_366((var11 + 1) * 128, -this.method_333(var11 + 1, var12 + 1), (var12 + 1) * 128);
                           var17 = var41.method_366(var11 * 128, -this.method_333(var11, var12 + 1), (var12 + 1) * 128);
                           var42 = new int[]{var14, var15, var43, var17};
                           var44 = var41.method_368(4, var42, var13, 12345678);
                           this.field_842[var44] = var11;
                           this.field_843[var44] = var12;
                           var41.field_884[var44] = 200000 + var44;
                           this.method_350(var11, var12, 0, var13, var13);
                           if(var40 == 0) {
                              break label1128;
                           }
                        }

                        if(this.method_335(var11, var12, var3) == 0 || class_4.field_539[this.method_335(var11, var12, var3) - 1] != 3) {
                           if(this.method_335(var11, var12 + 1, var3) > 0 && class_4.field_539[this.method_335(var11, var12 + 1, var3) - 1] == 4) {
                              var13 = class_4.field_538[this.method_335(var11, var12 + 1, var3) - 1];
                              var14 = var41.method_366(var11 * 128, -this.method_333(var11, var12), var12 * 128);
                              var15 = var41.method_366((var11 + 1) * 128, -this.method_333(var11 + 1, var12), var12 * 128);
                              var43 = var41.method_366((var11 + 1) * 128, -this.method_333(var11 + 1, var12 + 1), (var12 + 1) * 128);
                              var17 = var41.method_366(var11 * 128, -this.method_333(var11, var12 + 1), (var12 + 1) * 128);
                              var42 = new int[]{var14, var15, var43, var17};
                              var44 = var41.method_368(4, var42, var13, 12345678);
                              this.field_842[var44] = var11;
                              this.field_843[var44] = var12;
                              var41.field_884[var44] = 200000 + var44;
                              this.method_350(var11, var12, 0, var13, var13);
                           }

                           if(this.method_335(var11, var12 - 1, var3) > 0 && class_4.field_539[this.method_335(var11, var12 - 1, var3) - 1] == 4) {
                              var13 = class_4.field_538[this.method_335(var11, var12 - 1, var3) - 1];
                              var14 = var41.method_366(var11 * 128, -this.method_333(var11, var12), var12 * 128);
                              var15 = var41.method_366((var11 + 1) * 128, -this.method_333(var11 + 1, var12), var12 * 128);
                              var43 = var41.method_366((var11 + 1) * 128, -this.method_333(var11 + 1, var12 + 1), (var12 + 1) * 128);
                              var17 = var41.method_366(var11 * 128, -this.method_333(var11, var12 + 1), (var12 + 1) * 128);
                              var42 = new int[]{var14, var15, var43, var17};
                              var44 = var41.method_368(4, var42, var13, 12345678);
                              this.field_842[var44] = var11;
                              this.field_843[var44] = var12;
                              var41.field_884[var44] = 200000 + var44;
                              this.method_350(var11, var12, 0, var13, var13);
                           }

                           if(this.method_335(var11 + 1, var12, var3) > 0 && class_4.field_539[this.method_335(var11 + 1, var12, var3) - 1] == 4) {
                              var13 = class_4.field_538[this.method_335(var11 + 1, var12, var3) - 1];
                              var14 = var41.method_366(var11 * 128, -this.method_333(var11, var12), var12 * 128);
                              var15 = var41.method_366((var11 + 1) * 128, -this.method_333(var11 + 1, var12), var12 * 128);
                              var43 = var41.method_366((var11 + 1) * 128, -this.method_333(var11 + 1, var12 + 1), (var12 + 1) * 128);
                              var17 = var41.method_366(var11 * 128, -this.method_333(var11, var12 + 1), (var12 + 1) * 128);
                              var42 = new int[]{var14, var15, var43, var17};
                              var44 = var41.method_368(4, var42, var13, 12345678);
                              this.field_842[var44] = var11;
                              this.field_843[var44] = var12;
                              var41.field_884[var44] = 200000 + var44;
                              this.method_350(var11, var12, 0, var13, var13);
                           }

                           if(this.method_335(var11 - 1, var12, var3) > 0 && class_4.field_539[this.method_335(var11 - 1, var12, var3) - 1] == 4) {
                              var13 = class_4.field_538[this.method_335(var11 - 1, var12, var3) - 1];
                              var14 = var41.method_366(var11 * 128, -this.method_333(var11, var12), var12 * 128);
                              var15 = var41.method_366((var11 + 1) * 128, -this.method_333(var11 + 1, var12), var12 * 128);
                              var43 = var41.method_366((var11 + 1) * 128, -this.method_333(var11 + 1, var12 + 1), (var12 + 1) * 128);
                              var17 = var41.method_366(var11 * 128, -this.method_333(var11, var12 + 1), (var12 + 1) * 128);
                              var42 = new int[]{var14, var15, var43, var17};
                              var44 = var41.method_368(4, var42, var13, 12345678);
                              this.field_842[var44] = var11;
                              this.field_843[var44] = var12;
                              var41.field_884[var44] = 200000 + var44;
                              this.method_350(var11, var12, 0, var13, var13);
                           }
                        }
                     }

                     ++var12;
                  } while(var12 < 95);

                  ++var11;
               }
            } while(var11 < 95);
         }

         var41.method_371(true, 40, 48, -50, -10, -50);
         this.field_848 = this.field_851.method_369(0, 0, 1536, 1536, 8, 64, 233, false);
         var12 = 0;
         if(var40 != 0 || var12 < 64) {
            do {
               this.field_823.method_170(this.field_848[var12]);
               ++var12;
            } while(var12 < 64);
         }

         var13 = 0;
         if(var40 != 0 || var13 < 96) {
            do {
               var14 = 0;
               if(var40 == 0 && var14 >= 96) {
                  ++var13;
               } else {
                  do {
                     this.field_846[var13][var14] = this.method_333(var13, var14);
                     ++var14;
                  } while(var14 < 96);

                  ++var13;
               }
            } while(var13 < 96);
         }
      }

      this.field_851.method_359();
      var7 = 6316128;
      var8 = 0;
      if(var40 != 0) {
         var9 = 0;
         if(var40 == 0 && var9 >= 95) {
            ++var8;
         } else {
            while(true) {
               var10 = this.method_344(var8, var9);
               if(var10 > 0 && (class_4.field_533[var10 - 1] == 0 || this.field_820)) {
                  this.method_353(this.field_851, var10 - 1, var8, var9, var8 + 1, var9);
                  if(var4 && class_4.field_532[var10 - 1] != 0) {
                     this.field_845[var8][var9] |= 1;
                     if(var9 > 0) {
                        this.method_322(var8, var9 - 1, 4);
                     }
                  }

                  if(var4) {
                     this.field_822.method_229(var8 * 3, var9 * 3, 3, var7);
                  }
               }

               var10 = this.method_345(var8, var9);
               if(var10 > 0 && (class_4.field_533[var10 - 1] == 0 || this.field_820)) {
                  this.method_353(this.field_851, var10 - 1, var8, var9, var8, var9 + 1);
                  if(var4 && class_4.field_532[var10 - 1] != 0) {
                     this.field_845[var8][var9] |= 2;
                     if(var8 > 0) {
                        this.method_322(var8 - 1, var9, 8);
                     }
                  }

                  if(var4) {
                     this.field_822.method_230(var8 * 3, var9 * 3, 3, var7);
                  }
               }

               var10 = this.method_339(var8, var9);
               if(var10 > 0 && var10 < 12000 && (class_4.field_533[var10 - 1] == 0 || this.field_820)) {
                  this.method_353(this.field_851, var10 - 1, var8, var9, var8 + 1, var9 + 1);
                  if(var4 && class_4.field_532[var10 - 1] != 0) {
                     this.field_845[var8][var9] |= 32;
                  }

                  if(var4) {
                     this.field_822.method_231(var8 * 3, var9 * 3, var7);
                     this.field_822.method_231(var8 * 3 + 1, var9 * 3 + 1, var7);
                     this.field_822.method_231(var8 * 3 + 2, var9 * 3 + 2, var7);
                  }
               }

               if(var10 > 12000 && var10 < 24000 && (class_4.field_533[var10 - 12001] == 0 || this.field_820)) {
                  this.method_353(this.field_851, var10 - 12001, var8 + 1, var9, var8, var9 + 1);
                  if(var4 && class_4.field_532[var10 - 12001] != 0) {
                     this.field_845[var8][var9] |= 16;
                  }

                  if(var4) {
                     this.field_822.method_231(var8 * 3 + 2, var9 * 3, var7);
                     this.field_822.method_231(var8 * 3 + 1, var9 * 3 + 1, var7);
                     this.field_822.method_231(var8 * 3, var9 * 3 + 2, var7);
                  }
               }

               ++var9;
               if(var9 >= 95) {
                  ++var8;
                  break;
               }
            }
         }
      }

      while(var8 < 95) {
         var9 = 0;
         if(var40 == 0 && var9 >= 95) {
            ++var8;
         } else {
            do {
               var10 = this.method_344(var8, var9);
               if(var10 > 0 && (class_4.field_533[var10 - 1] == 0 || this.field_820)) {
                  this.method_353(this.field_851, var10 - 1, var8, var9, var8 + 1, var9);
                  if(var4 && class_4.field_532[var10 - 1] != 0) {
                     this.field_845[var8][var9] |= 1;
                     if(var9 > 0) {
                        this.method_322(var8, var9 - 1, 4);
                     }
                  }

                  if(var4) {
                     this.field_822.method_229(var8 * 3, var9 * 3, 3, var7);
                  }
               }

               var10 = this.method_345(var8, var9);
               if(var10 > 0 && (class_4.field_533[var10 - 1] == 0 || this.field_820)) {
                  this.method_353(this.field_851, var10 - 1, var8, var9, var8, var9 + 1);
                  if(var4 && class_4.field_532[var10 - 1] != 0) {
                     this.field_845[var8][var9] |= 2;
                     if(var8 > 0) {
                        this.method_322(var8 - 1, var9, 8);
                     }
                  }

                  if(var4) {
                     this.field_822.method_230(var8 * 3, var9 * 3, 3, var7);
                  }
               }

               var10 = this.method_339(var8, var9);
               if(var10 > 0 && var10 < 12000 && (class_4.field_533[var10 - 1] == 0 || this.field_820)) {
                  this.method_353(this.field_851, var10 - 1, var8, var9, var8 + 1, var9 + 1);
                  if(var4 && class_4.field_532[var10 - 1] != 0) {
                     this.field_845[var8][var9] |= 32;
                  }

                  if(var4) {
                     this.field_822.method_231(var8 * 3, var9 * 3, var7);
                     this.field_822.method_231(var8 * 3 + 1, var9 * 3 + 1, var7);
                     this.field_822.method_231(var8 * 3 + 2, var9 * 3 + 2, var7);
                  }
               }

               if(var10 > 12000 && var10 < 24000 && (class_4.field_533[var10 - 12001] == 0 || this.field_820)) {
                  this.method_353(this.field_851, var10 - 12001, var8 + 1, var9, var8, var9 + 1);
                  if(var4 && class_4.field_532[var10 - 12001] != 0) {
                     this.field_845[var8][var9] |= 16;
                  }

                  if(var4) {
                     this.field_822.method_231(var8 * 3 + 2, var9 * 3, var7);
                     this.field_822.method_231(var8 * 3 + 1, var9 * 3 + 1, var7);
                     this.field_822.method_231(var8 * 3, var9 * 3 + 2, var7);
                  }
               }

               ++var9;
            } while(var9 < 95);

            ++var8;
         }
      }

      if(var4) {
         this.field_822.method_240(this.field_824 - 1, 0, 0, 285, 285);
      }

      this.field_851.method_371(false, 60, 24, -50, -10, -50);
      this.field_849[var3] = this.field_851.method_369(0, 0, 1536, 1536, 8, 64, 338, true);
      var9 = 0;
      if(var40 != 0) {
         this.field_823.method_170(this.field_849[var3][var9]);
         ++var9;
      }

      while(var9 < 64) {
         this.field_823.method_170(this.field_849[var3][var9]);
         ++var9;
      }

      var10 = 0;
      if(var40 != 0 || var10 < 95) {
         do {
            var11 = 0;
            if(var40 == 0 && var11 >= 95) {
               ++var10;
            } else {
               do {
                  var12 = this.method_344(var10, var11);
                  if(var12 > 0) {
                     this.method_354(var12 - 1, var10, var11, var10 + 1, var11);
                  }

                  var12 = this.method_345(var10, var11);
                  if(var12 > 0) {
                     this.method_354(var12 - 1, var10, var11, var10, var11 + 1);
                  }

                  var12 = this.method_339(var10, var11);
                  if(var12 > 0 && var12 < 12000) {
                     this.method_354(var12 - 1, var10, var11, var10 + 1, var11 + 1);
                  }

                  if(var12 > 12000 && var12 < 24000) {
                     this.method_354(var12 - 12001, var10 + 1, var11, var10, var11 + 1);
                  }

                  ++var11;
               } while(var11 < 95);

               ++var10;
            }
         } while(var10 < 95);
      }

      var11 = 1;
      int var21;
      int var22;
      int var23;
      int var24;
      int var25;
      int var26;
      if(var40 != 0) {
         var12 = 1;
         if(var40 == 0 && var12 >= 95) {
            ++var11;
         } else {
            while(true) {
               var13 = this.method_340(var11, var12);
               if(var13 > 0) {
                  label1139: {
                     var43 = var11 + 1;
                     var18 = var11 + 1;
                     var44 = var12 + 1;
                     var21 = var12 + 1;
                     var22 = 0;
                     var23 = this.field_846[var11][var12];
                     var24 = this.field_846[var43][var12];
                     var25 = this.field_846[var18][var44];
                     var26 = this.field_846[var11][var21];
                     if(var23 > 80000) {
                        var23 -= 80000;
                     }

                     if(var24 > 80000) {
                        var24 -= 80000;
                     }

                     if(var25 > 80000) {
                        var25 -= 80000;
                     }

                     if(var26 > 80000) {
                        var26 -= 80000;
                     }

                     if(var23 > var22) {
                        var22 = var23;
                     }

                     if(var24 > var22) {
                        var22 = var24;
                     }

                     if(var25 > var22) {
                        var22 = var25;
                     }

                     if(var26 > var22) {
                        var22 = var26;
                     }

                     if(var22 >= 80000) {
                        var22 -= 80000;
                     }

                     label687: {
                        if(var23 < 80000) {
                           this.field_846[var11][var12] = var22;
                           if(var40 == 0) {
                              break label687;
                           }
                        }

                        this.field_846[var11][var12] -= 80000;
                     }

                     label697: {
                        if(var24 < 80000) {
                           this.field_846[var43][var12] = var22;
                           if(var40 == 0) {
                              break label697;
                           }
                        }

                        this.field_846[var43][var12] -= 80000;
                     }

                     label707: {
                        if(var25 < 80000) {
                           this.field_846[var18][var44] = var22;
                           if(var40 == 0) {
                              break label707;
                           }
                        }

                        this.field_846[var18][var44] -= 80000;
                     }

                     if(var26 < 80000) {
                        this.field_846[var11][var21] = var22;
                        if(var40 == 0) {
                           break label1139;
                        }
                     }

                     this.field_846[var11][var21] -= 80000;
                  }
               }

               ++var12;
               if(var12 >= 95) {
                  ++var11;
                  break;
               }
            }
         }
      }

      while(var11 < 95) {
         var12 = 1;
         if(var40 == 0 && var12 >= 95) {
            ++var11;
         } else {
            do {
               var13 = this.method_340(var11, var12);
               if(var13 > 0) {
                  label1147: {
                     var43 = var11 + 1;
                     var18 = var11 + 1;
                     var44 = var12 + 1;
                     var21 = var12 + 1;
                     var22 = 0;
                     var23 = this.field_846[var11][var12];
                     var24 = this.field_846[var43][var12];
                     var25 = this.field_846[var18][var44];
                     var26 = this.field_846[var11][var21];
                     if(var23 > 80000) {
                        var23 -= 80000;
                     }

                     if(var24 > 80000) {
                        var24 -= 80000;
                     }

                     if(var25 > 80000) {
                        var25 -= 80000;
                     }

                     if(var26 > 80000) {
                        var26 -= 80000;
                     }

                     if(var23 > var22) {
                        var22 = var23;
                     }

                     if(var24 > var22) {
                        var22 = var24;
                     }

                     if(var25 > var22) {
                        var22 = var25;
                     }

                     if(var26 > var22) {
                        var22 = var26;
                     }

                     if(var22 >= 80000) {
                        var22 -= 80000;
                     }

                     label564: {
                        if(var23 < 80000) {
                           this.field_846[var11][var12] = var22;
                           if(var40 == 0) {
                              break label564;
                           }
                        }

                        this.field_846[var11][var12] -= 80000;
                     }

                     label559: {
                        if(var24 < 80000) {
                           this.field_846[var43][var12] = var22;
                           if(var40 == 0) {
                              break label559;
                           }
                        }

                        this.field_846[var43][var12] -= 80000;
                     }

                     label554: {
                        if(var25 < 80000) {
                           this.field_846[var18][var44] = var22;
                           if(var40 == 0) {
                              break label554;
                           }
                        }

                        this.field_846[var18][var44] -= 80000;
                     }

                     if(var26 < 80000) {
                        this.field_846[var11][var21] = var22;
                        if(var40 == 0) {
                           break label1147;
                        }
                     }

                     this.field_846[var11][var21] -= 80000;
                  }
               }

               ++var12;
            } while(var12 < 95);

            ++var11;
         }
      }

      this.field_851.method_359();
      var12 = 1;
      if(var40 != 0 || var12 < 95) {
         do {
            var13 = 1;
            if(var40 == 0 && var13 >= 95) {
               ++var12;
            } else {
               do {
                  var14 = this.method_340(var12, var13);
                  if(var14 > 0) {
                     label1143: {
                        var17 = var12 + 1;
                        var44 = var12 + 1;
                        var20 = var13 + 1;
                        var22 = var13 + 1;
                        var23 = var12 * 128;
                        var24 = var13 * 128;
                        var25 = var23 + 128;
                        var26 = var24 + 128;
                        int var27 = var23;
                        int var28 = var24;
                        int var29 = var25;
                        int var30 = var26;
                        int var31 = this.field_846[var12][var13];
                        int var32 = this.field_846[var17][var13];
                        int var33 = this.field_846[var44][var20];
                        int var34 = this.field_846[var12][var22];
                        int var35 = class_4.field_535[var14 - 1];
                        if(this.method_343(var12, var13) && var31 < 80000) {
                           var31 += var35 + 80000;
                           this.field_846[var12][var13] = var31;
                        }

                        if(this.method_343(var17, var13) && var32 < 80000) {
                           var32 += var35 + 80000;
                           this.field_846[var17][var13] = var32;
                        }

                        if(this.method_343(var44, var20) && var33 < 80000) {
                           var33 += var35 + 80000;
                           this.field_846[var44][var20] = var33;
                        }

                        if(this.method_343(var12, var22) && var34 < 80000) {
                           var34 += var35 + 80000;
                           this.field_846[var12][var22] = var34;
                        }

                        if(var31 >= 80000) {
                           var31 -= 80000;
                        }

                        if(var32 >= 80000) {
                           var32 -= 80000;
                        }

                        if(var33 >= 80000) {
                           var33 -= 80000;
                        }

                        if(var34 >= 80000) {
                           var34 -= 80000;
                        }

                        byte var36 = 16;
                        if(!this.method_342(var12 - 1, var13)) {
                           var23 -= var36;
                        }

                        if(!this.method_342(var12 + 1, var13)) {
                           var23 += var36;
                        }

                        if(!this.method_342(var12, var13 - 1)) {
                           var24 -= var36;
                        }

                        if(!this.method_342(var12, var13 + 1)) {
                           var24 += var36;
                        }

                        if(!this.method_342(var17 - 1, var13)) {
                           var25 -= var36;
                        }

                        if(!this.method_342(var17 + 1, var13)) {
                           var25 += var36;
                        }

                        if(!this.method_342(var17, var13 - 1)) {
                           var28 = var24 - var36;
                        }

                        if(!this.method_342(var17, var13 + 1)) {
                           var28 += var36;
                        }

                        if(!this.method_342(var44 - 1, var20)) {
                           var29 = var25 - var36;
                        }

                        if(!this.method_342(var44 + 1, var20)) {
                           var29 += var36;
                        }

                        if(!this.method_342(var44, var20 - 1)) {
                           var26 -= var36;
                        }

                        if(!this.method_342(var44, var20 + 1)) {
                           var26 += var36;
                        }

                        if(!this.method_342(var12 - 1, var22)) {
                           var27 = var23 - var36;
                        }

                        if(!this.method_342(var12 + 1, var22)) {
                           var27 += var36;
                        }

                        if(!this.method_342(var12, var22 - 1)) {
                           var30 = var26 - var36;
                        }

                        if(!this.method_342(var12, var22 + 1)) {
                           var30 += var36;
                        }

                        var14 = class_4.field_536[var14 - 1];
                        var31 = -var31;
                        var32 = -var32;
                        var33 = -var33;
                        var34 = -var34;
                        int[] var37;
                        if(this.method_339(var12, var13) > 12000 && this.method_339(var12, var13) < 24000 && this.method_340(var12 - 1, var13 - 1) == 0) {
                           var37 = new int[]{this.field_851.method_366(var29, var33, var26), this.field_851.method_366(var27, var34, var30), this.field_851.method_366(var25, var32, var28)};
                           this.field_851.method_368(3, var37, var14, 12345678);
                           if(var40 == 0) {
                              break label1143;
                           }
                        }

                        if(this.method_339(var12, var13) > 12000 && this.method_339(var12, var13) < 24000 && this.method_340(var12 + 1, var13 + 1) == 0) {
                           var37 = new int[]{this.field_851.method_366(var23, var31, var24), this.field_851.method_366(var25, var32, var28), this.field_851.method_366(var27, var34, var30)};
                           this.field_851.method_368(3, var37, var14, 12345678);
                           if(var40 == 0) {
                              break label1143;
                           }
                        }

                        if(this.method_339(var12, var13) > 0 && this.method_339(var12, var13) < 12000 && this.method_340(var12 + 1, var13 - 1) == 0) {
                           var37 = new int[]{this.field_851.method_366(var27, var34, var30), this.field_851.method_366(var23, var31, var24), this.field_851.method_366(var29, var33, var26)};
                           this.field_851.method_368(3, var37, var14, 12345678);
                           if(var40 == 0) {
                              break label1143;
                           }
                        }

                        if(this.method_339(var12, var13) > 0 && this.method_339(var12, var13) < 12000 && this.method_340(var12 - 1, var13 + 1) == 0) {
                           var37 = new int[]{this.field_851.method_366(var25, var32, var28), this.field_851.method_366(var29, var33, var26), this.field_851.method_366(var23, var31, var24)};
                           this.field_851.method_368(3, var37, var14, 12345678);
                           if(var40 == 0) {
                              break label1143;
                           }
                        }

                        if(var31 == var32 && var33 == var34) {
                           var37 = new int[]{this.field_851.method_366(var23, var31, var24), this.field_851.method_366(var25, var32, var28), this.field_851.method_366(var29, var33, var26), this.field_851.method_366(var27, var34, var30)};
                           this.field_851.method_368(4, var37, var14, 12345678);
                           if(var40 == 0) {
                              break label1143;
                           }
                        }

                        if(var31 == var34 && var32 == var33) {
                           var37 = new int[]{this.field_851.method_366(var27, var34, var30), this.field_851.method_366(var23, var31, var24), this.field_851.method_366(var25, var32, var28), this.field_851.method_366(var29, var33, var26)};
                           this.field_851.method_368(4, var37, var14, 12345678);
                           if(var40 == 0) {
                              break label1143;
                           }
                        }

                        boolean var45 = true;
                        if(this.method_340(var12 - 1, var13 - 1) > 0) {
                           var45 = false;
                        }

                        if(this.method_340(var12 + 1, var13 + 1) > 0) {
                           var45 = false;
                        }

                        int[] var38;
                        int[] var39;
                        if(!var45) {
                           var38 = new int[]{this.field_851.method_366(var25, var32, var28), this.field_851.method_366(var29, var33, var26), this.field_851.method_366(var23, var31, var24)};
                           this.field_851.method_368(3, var38, var14, 12345678);
                           var39 = new int[]{this.field_851.method_366(var27, var34, var30), this.field_851.method_366(var23, var31, var24), this.field_851.method_366(var29, var33, var26)};
                           this.field_851.method_368(3, var39, var14, 12345678);
                           if(var40 == 0) {
                              break label1143;
                           }
                        }

                        var38 = new int[]{this.field_851.method_366(var23, var31, var24), this.field_851.method_366(var25, var32, var28), this.field_851.method_366(var27, var34, var30)};
                        this.field_851.method_368(3, var38, var14, 12345678);
                        var39 = new int[]{this.field_851.method_366(var29, var33, var26), this.field_851.method_366(var27, var34, var30), this.field_851.method_366(var25, var32, var28)};
                        this.field_851.method_368(3, var39, var14, 12345678);
                     }
                  }

                  ++var13;
               } while(var13 < 95);

               ++var12;
            }
         } while(var12 < 95);
      }

      this.field_851.method_371(true, 50, 50, -50, -10, -50);
      this.field_850[var3] = this.field_851.method_369(0, 0, 1536, 1536, 8, 64, 169, true);
      var13 = 0;
      if(var40 != 0) {
         this.field_823.method_170(this.field_850[var3][var13]);
         ++var13;
      }

      while(var13 < 64) {
         this.field_823.method_170(this.field_850[var3][var13]);
         ++var13;
      }

      if(this.field_850[var3][0] == null) {
         throw new RuntimeException("null roof!");
      } else {
         var14 = 0;
         if(var40 != 0 || var14 < 96) {
            do {
               var15 = 0;
               if(var40 == 0 && var15 >= 96) {
                  ++var14;
               } else {
                  do {
                     if(this.field_846[var14][var15] >= 80000) {
                        this.field_846[var14][var15] -= 80000;
                     }

                     ++var15;
                  } while(var15 < 96);

                  ++var14;
               }
            } while(var14 < 96);

         }
      }
   }

   // $FF: renamed from: a (a.a.f[]) void
   public void method_352(class_15[] var1) {
      int var14 = class_4.field_563;
      int var2 = 0;
      if(var14 != 0 || var2 < this.field_840 - 2) {
         do {
            int var3 = 0;
            if(var14 == 0 && var3 >= this.field_841 - 2) {
               ++var2;
            } else {
               do {
                  if(this.method_339(var2, var3) > '\ubb80' && this.method_339(var2, var3) < '\uea60') {
                     int var4;
                     int var6;
                     int var7;
                     label120: {
                        var4 = this.method_339(var2, var3) - '\ubb81';
                        int var5 = this.method_341(var2, var3);
                        if(var5 == 0 || var5 == 4) {
                           var6 = class_4.field_520[var4];
                           var7 = class_4.field_521[var4];
                           if(var14 == 0) {
                              break label120;
                           }
                        }

                        var7 = class_4.field_520[var4];
                        var6 = class_4.field_521[var4];
                     }

                     this.method_326(var2, var3, var4);
                     class_15 var8 = var1[class_4.field_519[var4]].method_391(false, true, false, false);
                     int var9 = (var2 + var2 + var6) * 128 / 2;
                     int var10 = (var3 + var3 + var7) * 128 / 2;
                     var8.method_377(var9, -this.method_332(var9, var10), var10);
                     var8.method_376(0, this.method_341(var2, var3) * 32, 0);
                     this.field_823.method_170(var8);
                     var8.method_372(48, 48, -50, -10, -50);
                     if(var6 > 1 || var7 > 1) {
                        int var11 = var2;
                        if(var14 != 0 || var2 < var2 + var6) {
                           do {
                              int var12 = var3;
                              if(var14 == 0 && var3 >= var3 + var7) {
                                 ++var11;
                              } else {
                                 do {
                                    if((var11 > var2 || var12 > var3) && this.method_339(var11, var12) - '\ubb81' == var4) {
                                       byte var13;
                                       label117: {
                                          var9 = var11;
                                          var10 = var12;
                                          var13 = 0;
                                          if(var11 >= 48 && var12 < 48) {
                                             var13 = 1;
                                             var9 = var11 - 48;
                                             if(var14 == 0) {
                                                break label117;
                                             }
                                          }

                                          if(var9 < 48 && var12 >= 48) {
                                             var13 = 2;
                                             var10 = var12 - 48;
                                             if(var14 == 0) {
                                                break label117;
                                             }
                                          }

                                          if(var9 >= 48 && var10 >= 48) {
                                             var13 = 3;
                                             var9 -= 48;
                                             var10 -= 48;
                                          }
                                       }

                                       this.field_839[var13][var9 * 48 + var10] = 0;
                                    }

                                    ++var12;
                                 } while(var12 < var3 + var7);

                                 ++var11;
                              }
                           } while(var11 < var2 + var6);
                        }
                     }
                  }

                  ++var3;
               } while(var3 < this.field_841 - 2);

               ++var2;
            }
         } while(var2 < this.field_840 - 2);

      }
   }

   // $FF: renamed from: a (a.a.f, int, int, int, int, int) void
   public void method_353(class_15 var1, int var2, int var3, int var4, int var5, int var6) {
      this.method_329(var3, var4, 40);
      this.method_329(var5, var6, 40);
      int var7 = class_4.field_529[var2];
      int var8 = class_4.field_530[var2];
      int var9 = class_4.field_531[var2];
      int var10 = var3 * 128;
      int var11 = var4 * 128;
      int var12 = var5 * 128;
      int var13 = var6 * 128;
      int var14 = var1.method_366(var10, -this.field_846[var3][var4], var11);
      int var15 = var1.method_366(var10, -this.field_846[var3][var4] - var7, var11);
      int var16 = var1.method_366(var12, -this.field_846[var5][var6] - var7, var13);
      int var17 = var1.method_366(var12, -this.field_846[var5][var6], var13);
      int[] var18 = new int[]{var14, var15, var16, var17};
      int var19 = var1.method_368(4, var18, var8, var9);
      if(class_4.field_533[var2] == 5) {
         var1.field_884[var19] = 30000 + var2;
      } else {
         var1.field_884[var19] = 0;
      }
   }

   // $FF: renamed from: c (int, int, int, int, int) void
   public void method_354(int var1, int var2, int var3, int var4, int var5) {
      int var6 = class_4.field_529[var1];
      if(this.field_846[var2][var3] < 80000) {
         this.field_846[var2][var3] += 80000 + var6;
      }

      if(this.field_846[var4][var5] < 80000) {
         this.field_846[var4][var5] += 80000 + var6;
      }

   }
}
