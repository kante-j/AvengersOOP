package avengers;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.*;

public class DrawClass101 extends JPanel {
   
   private static JFrame fr;


   int x,y;
   int a = 10; //�����̴� �Ÿ� speed
   int b = 1;
   public DrawClass101() {
         new Thread(){
            public void run(){
               while(true){
 // ���� ó���� �ߴ� �Ǽ��� while���� Thread �ٱ����� ����
   // ���� ������ ���ԵǾ� ����� ���� �ʾҴ� ���̴�.
 // Thread�� ���� ������ �� �����غ��� �ڵ��� �ؾ߰ڴ�.
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