package avengers;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class map extends JFrame{
	Container content;
	 Map_Avengers imgP;
	private JFrame frame= new JFrame("Game");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Mappanel chr = new Mappanel();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					map window = new map();
					//window.frame.setVisible(true);
					window.frame.setTitle("Game");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public map() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @return 
	 */
	public void initialize(){
		   Mappanel imgP = new Mappanel();
		   content = getContentPane();     
		   content.add(imgP, BorderLayout.CENTER);
		   setSize(1230	, 750);
		   setVisible(true);
		 }
	
		 
}
