package avengers;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class SelectChar extends JFrame {

	public int charval=0;
   private JPanel contentPane;

   String[] char_profile = new String[2];
   String[] hulk, captine;
   characters player;
private boolean started=false;
   
   
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               SelectChar frame = new SelectChar();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }
   
   public SelectChar() {
      
      
      try {
         File f = new File("character_property.txt");
         FileReader fr = new FileReader(f);
         BufferedReader br = new BufferedReader(fr);
         
         char_profile[0] = br.readLine();
         char_profile[1] = br.readLine();
         br.close();
         
         hulk = char_profile[0].split(",");
         captine = char_profile[1].split(",");
         
         
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      
      setForeground(Color.BLACK);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 892, 518);
      contentPane = new JPanel();
      contentPane.setBackground(Color.BLACK);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      
      JButton ButtonHulk = new JButton("hulk_power");
      
      
      ButtonHulk.setContentAreaFilled(false);
      ButtonHulk.setOpaque(false);
      
      ButtonHulk.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) {
            ButtonHulk.setOpaque(true);
            ButtonHulk.setBackground(Color.gray);
         }
         public void mouseExited(MouseEvent e){
            ButtonHulk.setOpaque(false);
         }
      });
      ButtonHulk.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 charval=1;
        		start();
				
				new Map_Avengers();
//            
//           // player.setType(hulk[0]);
//            player.setPower(Integer.parseInt(hulk[1]));
//            player.setSpeed(Integer.parseInt(hulk[2]));
//            
            
         }
      });
      ButtonHulk.setIcon(new ImageIcon("HULK.png"));
      
      
      JButton ButtonCap = new JButton("captine_power");
      
      ButtonCap.setBorderPainted(false);
      ButtonCap.setContentAreaFilled(false);
      ButtonCap.setOpaque(false);
      
      ButtonCap.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) {
            ButtonCap.setOpaque(true);
            ButtonCap.setBackground(Color.WHITE);
         }
         public void mouseExited(MouseEvent e) {
            ButtonCap.setOpaque(false);
         }
      });
      ButtonCap.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 
        	 
            
         }
      });
      ButtonCap.setIcon(new ImageIcon("CaptineAmerica.png"));
      
      JLabel lblChooseOnePlayer = new JLabel("CHOOSE ONE PLAYER!");
      lblChooseOnePlayer.setForeground(Color.WHITE);
      lblChooseOnePlayer.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 21));
      GroupLayout gl_contentPane = new GroupLayout(contentPane);
      gl_contentPane.setHorizontalGroup(
         gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                  .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                     .addContainerGap()
                     .addComponent(ButtonHulk)
                     .addPreferredGap(ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                     .addComponent(ButtonCap))
                  .addGroup(gl_contentPane.createSequentialGroup()
                     .addGap(289)
                     .addComponent(lblChooseOnePlayer)))
               .addContainerGap())
      );
      gl_contentPane.setVerticalGroup(
         gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addGap(78)
               .addComponent(lblChooseOnePlayer)
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                  .addComponent(ButtonCap, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
                  .addComponent(ButtonHulk))
               .addContainerGap(27, Short.MAX_VALUE))
      );
      contentPane.setLayout(gl_contentPane);
   }

	public void start() {
		 started = true;
	}
}
