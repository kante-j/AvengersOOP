package avengers;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Select_Char{

	private JFrame frame;
	private int charval=0;

	

	public int getCharval() {
		return charval;
	}


	public void setCharval(int charval) {
		this.charval = charval;
	}


	/**
	 * Launch the application.
	 */

	public void run() {
		try {
			Select_Char window = new Select_Char();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Select_Char() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		characters player = null;
		
	
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 984, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton ButtonHulk = new JButton("hulk");
		ButtonHulk.setContentAreaFilled(false);
		ButtonHulk.setOpaque(false);

		ButtonHulk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ButtonHulk.setOpaque(true);
				ButtonHulk.setBackground(Color.gray);
			}

			public void mouseExited(MouseEvent e) {
				ButtonHulk.setOpaque(false);
			}
		});
		ButtonHulk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCharval(1);
				new map(charval);
				frame.setVisible(false);
				
			}
		});
		ButtonHulk.setIcon(new ImageIcon("C:\\Users\\Jiseok\\Desktop\\Avengers\\HULK.png"));

		JButton ButtonCap = new JButton("captine");
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

				setCharval(2);
				new map(charval);
				frame.setVisible(false);
			}
		});
		ButtonCap.setIcon(new ImageIcon("C:\\Users\\Jiseok\\Desktop\\Avengers\\CaptineAmerica.png"));

		JLabel lblChooseYourPlayer = new JLabel("CHOOSE YOUR PLAYER!");
		lblChooseYourPlayer.setForeground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addComponent(ButtonHulk)
										.addPreferredGap(ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
										.addComponent(ButtonCap).addContainerGap())
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addComponent(lblChooseYourPlayer).addGap(444)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(80).addComponent(lblChooseYourPlayer).addGap(4)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(ButtonCap, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(ButtonHulk, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE))
				.addContainerGap(73, Short.MAX_VALUE)));
		frame.getContentPane().setLayout(groupLayout);
	}

}
