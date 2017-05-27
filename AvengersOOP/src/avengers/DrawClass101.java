package avengers;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.*;

public class DrawClass101 extends JPanel {
   
   private static JFrame fr;


   int x,y;
   int a = 10; //움직이는 거리 speed
   int b = 1;
   public DrawClass101() {
         new Thread(){
            public void run(){
               while(true){
 // 내가 처음에 했던 실수는 while문을 Thread 바깥으로 빼서
   // 무한 루프를 돌게되어 결과가 뜨지 않았던 것이다.
 // Thread를 쓰는 목적을 잘 생각해보고 코딩을 해야겠다.
               x+=b;
               System.out.println(DrawClass101.this.getWidth());
               //200
               if(x<=200){
                  //a = -a;
               }
               
               else{
                  break;
               }
               repaint();
               try {
                  Thread.sleep(0);
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
g2d.drawOval(0, 0, 50, 50);
      System.out.println("Graphic");
   }
   
   public static void main(String[] args){
      
      fr = new JFrame();
      fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      DrawClass101 dr = new DrawClass101();
      fr.add(dr);
      
      fr.setSize(300,300);
      fr.setVisible(true);

      
      
   }

   
}