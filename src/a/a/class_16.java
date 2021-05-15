package a.a;

import a.a.class_0;
import a.a.class_9;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;

// $FF: renamed from: a.a.c
public class class_16 extends Frame {

   // $FF: renamed from: a int
   int field_937;
   // $FF: renamed from: b int
   int field_938;
   // $FF: renamed from: c int
   int field_939;
   // $FF: renamed from: d int
   int field_940;
   // $FF: renamed from: e a.a.a
   class_0 field_941;
   // $FF: renamed from: f java.awt.Graphics
   Graphics field_942;


   // $FF: renamed from: <init> (a.a.a, int, int, java.lang.String, boolean, boolean) void
   public class_16(class_0 var1, int var2, int var3, String var4, boolean var5, boolean var6) {
      super();
      label11: {
         this.field_940 = 28;
         this.field_937 = var2;
         this.field_938 = var3;
         this.field_941 = var1;
         if(var6) {
            this.field_940 = 48;
            if(!class_9.field_759) {
               break label11;
            }
         }

         this.field_940 = 28;
      }

      this.setTitle(var4);
      this.setResizable(var5);
      this.show();
      this.toFront();
      this.resize(this.field_937, this.field_938);
      this.field_942 = this.getGraphics();
   }

   public Graphics getGraphics() {
      Graphics var1 = super.getGraphics();
      if(this.field_939 == 0) {
         var1.translate(0, 24);
         if(!class_9.field_759) {
            return var1;
         }
      }

      var1.translate(-5, 0);
      return var1;
   }

   public void resize(int var1, int var2) {
      super.resize(var1, var2 + this.field_940);
   }

   public boolean handleEvent(Event var1) {
      boolean var2 = class_9.field_759;
      if(var1.id == 401) {
         this.field_941.keyDown(var1, var1.key);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 402) {
         this.field_941.keyUp(var1, var1.key);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 501) {
         this.field_941.mouseDown(var1, var1.x, var1.y - 24);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 506) {
         this.field_941.mouseDrag(var1, var1.x, var1.y - 24);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 502) {
         this.field_941.mouseUp(var1, var1.x, var1.y - 24);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 503) {
         this.field_941.mouseMove(var1, var1.x, var1.y - 24);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 201) {
         this.field_941.destroy();
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 1001) {
         this.field_941.action(var1, var1.target);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 403) {
         this.field_941.keyDown(var1, var1.key);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 404) {
         this.field_941.keyUp(var1, var1.key);
      }

      return true;
   }

   public final void paint(Graphics var1) {
      this.field_941.paint(var1);
   }
}
