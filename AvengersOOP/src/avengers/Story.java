package avengers;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.ComponentOrientation;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Story {

	
	private JFrame frame;
	private JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Story window = new Story();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Story() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 805, 570);
		frame.getContentPane().add(panel=new JPanel(){
			public void paintComponent(Graphics g){
	 		
			Image im = new ImageIcon("background2.jpg").getImage();
			g.drawImage(im,0,0, 805, 570, null);
	 		
	 	}
			
		});
		Font font = new Font("arian", Font.BOLD, 15);
		
		JTextPane txtpnStartStoryOne = new JTextPane();
		txtpnStartStoryOne.setForeground(new Color(255, 255, 255));
		txtpnStartStoryOne.setText("\r\nOne day in a peaceful earth, a terrible alien appeared to destroy all the earth's computer systems.\r\n\r\nIn order to save the Earth computer system, we have to save the earth by solving the Java problem.\r\n\r\nYou can provide the avengers heroes with the power to defeat the alien every time you hit the problem.\r\n\r\ngood luck!");
		txtpnStartStoryOne.setOpaque(false);
		txtpnStartStoryOne.setFont(new Font("±¼¸²", Font.BOLD, 25));
		
		JButton btnStart = new JButton("NEXT");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(124)
					.addComponent(txtpnStartStoryOne, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(109, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(634, Short.MAX_VALUE)
					.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(50))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(33)
					.addComponent(txtpnStartStoryOne, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnStart)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
	}
}

 	