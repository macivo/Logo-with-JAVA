import java.awt.Graphics;

public class demo extends java.applet.Applet {

   private LogoPrimitives logo;

      public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      for (int i0 = 1; i0 <= 3; i0++) {
         logo.fd(100);
         logo.rt(120);
         logo.wait(750);
      }
      logo.wait(1500);
      logo.cs();
      for (int i0 = 1; i0 <= 100; i0++) {
         for (int i1 = 1; i1 <= 3; i1++) {
            logo.fd(100);
            logo.rt(120);
            logo.wait(2);
         }
         logo.rt(10);
      }
      logo.wait(1000);
      logo.cs();
      for (int i0 = 1; i0 <= 1800; i0++) {
         logo.fd(10);
         logo.rt(i0 + 0.1);
         logo.wait(1);
      }
      logo.wait(1000);
      logo.cs();
      for (int i0 = 1; i0 <= 3600; i0++) {
         logo.fd(10);
         logo.rt(i0 + 0.2);
      }
      logo.wait(2000);
      logo.cs();
      for (int i0 = 1; i0 <= 8; i0++) {
         logo.rt(45);
         for (int i1 = 1; i1 <= 6; i1++) {
            for (int i2 = 1; i2 <= 90; i2++) {
               logo.fd(2);
               logo.rt(2);
               logo.wait(1);
            }
            logo.rt(90);
         }
      }
      logo.wait(2000);
      logo.cs();
      for (int i0 = 1; i0 <= 40; i0++) {
         for (int i1 = 1; i1 <= 34; i1++) {
            logo.fd(12);
            logo.rt(10);
            logo.wait(1);
         }
         logo.rt(90);
      }
   }
}
