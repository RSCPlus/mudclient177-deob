import a.a.class_9;
import java.awt.Component;

// $FF: renamed from: d
public class class_10 extends class_9 {

   // $FF: renamed from: L mudclient
   public mudclient field_760;


   // $FF: renamed from: <init> (int, int, int, java.awt.Component) void
   public class_10(int var1, int var2, int var3, Component var4) {
      super(var1, var2, var3, var4);
      boolean var5 = false;
      if(var5) {
         new class_9(var1, var2, var3, var4);
      }

   }

   // $FF: renamed from: a (int, int, int, int, int, int, int) void
   public void method_257(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var5 >= '\uc350') {
         this.field_760.method_89(var1, var2, var3, var4, var5 - '\uc350', var6, var7);
      } else if(var5 >= '\u9c40') {
         this.field_760.method_90(var1, var2, var3, var4, var5 - '\u9c40', var6, var7);
      } else if(var5 >= 20000) {
         this.field_760.method_91(var1, var2, var3, var4, var5 - 20000, var6, var7);
      } else if(var5 >= 5000) {
         this.field_760.method_92(var1, var2, var3, var4, var5 - 5000, var6, var7);
      } else {
         super.method_243(var1, var2, var3, var4, var5);
      }
   }
}
