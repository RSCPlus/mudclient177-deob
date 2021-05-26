package a.a;

import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;

// $FF: renamed from: a.a.c
public class GameFrame extends Frame {

   // $FF: renamed from: a int
   int windowWidth;
   // $FF: renamed from: b int
   int windowHeight;
   // $FF: renamed from: c int
   int field_939;
   // $FF: renamed from: d int
   int windowYTranslation;
   // $FF: renamed from: e a.a.a
   GameShell gameShell;
   // $FF: renamed from: f java.awt.Graphics
   Graphics graphics;


   // $FF: renamed from: <init> (a.a.a, int, int, java.lang.String, boolean, boolean) void
   public GameFrame(GameShell var1, int var2, int var3, String var4, boolean var5, boolean var6) {
      super();
      label11: {
         this.windowYTranslation = 28;
         this.windowWidth = var2;
         this.windowHeight = var3;
         this.gameShell = var1;
         if(var6) {
            this.windowYTranslation = 48;
            if(!Surface.field_759) {
               break label11;
            }
         }

         this.windowYTranslation = 28;
      }

      this.setTitle(var4);
      this.setResizable(var5);
      this.show();
      this.toFront();
      this.resize(this.windowWidth, this.windowHeight);
      this.graphics = this.getGraphics();
   }

   public Graphics getGraphics() {
      Graphics var1 = super.getGraphics();
      if(this.field_939 == 0) {
         var1.translate(0, 24);
         if(!Surface.field_759) {
            return var1;
         }
      }

      var1.translate(-5, 0);
      return var1;
   }

   public void resize(int var1, int var2) {
      super.resize(var1, var2 + this.windowYTranslation);
   }

   public boolean handleEvent(Event var1) {
      boolean var2 = Surface.field_759;
      if(var1.id == 401) {
         this.gameShell.keyDown(var1, var1.key);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 402) {
         this.gameShell.keyUp(var1, var1.key);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 501) {
         this.gameShell.mouseDown(var1, var1.x, var1.y - 24);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 506) {
         this.gameShell.mouseDrag(var1, var1.x, var1.y - 24);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 502) {
         this.gameShell.mouseUp(var1, var1.x, var1.y - 24);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 503) {
         this.gameShell.mouseMove(var1, var1.x, var1.y - 24);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 201) {
         this.gameShell.destroy();
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 1001) {
         this.gameShell.action(var1, var1.target);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 403) {
         this.gameShell.keyDown(var1, var1.key);
         if(!var2) {
            return true;
         }
      }

      if(var1.id == 404) {
         this.gameShell.keyUp(var1, var1.key);
      }

      return true;
   }

   public final void paint(Graphics var1) {
      this.gameShell.paint(var1);
   }
}
