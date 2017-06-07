package avengers;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

public class DrawCircle101 extends JPanel {
   
   private static JFrame fr;


   int x,y;
   int a = 10; //움직이는 거리 speed
   int b = 1;
   public DrawCircle101() {
         new Thread(){
            public void run(){
               while(true){
               x+=b;
               System.out.println(DrawCircle101.this.getWidth());
               //200
               if(x<=200){ 
                  //a = -a;
               }
               
               else{
                  break;
               }
               repaint();
               try {
                  Thread.sleep(50);
               } catch (InterruptedException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }
               }
            }
         }.start();
   }

   @Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D)g;
      g2d.setColor(Color.green);
      g2d.setBackground(Color.blue);
      g2d.fillOval(x, y, 100, 100);
      System.out.println("Graphic");
   }
   
   public static void main(String[] args){
      
      fr = new JFrame();
      fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      DrawCircle101 dr = new DrawCircle101();
      fr.add(dr);
      
      fr.setSize(300,300);
      fr.setVisible(true);

      
      
   }

   
}
