package avengers;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.*;
import javax.swing.*;

public class Map_Avengers extends JFrame {
	private JFrame frame;
	Container content;
	Map_Avengers imgP;

	public Map_Avengers(String title) {
		super(title);
		frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		Mappanel imgP = new Mappanel();
		DrawChar dc = new DrawChar();
		
		layeredPane.add(imgP);
		layeredPane.add(dc);
		
		setSize(1230, 750);
		setVisible(true);
	}

	public static void main(String[] args) {
		Map_Avengers ma = new Map_Avengers("map.png");
	}
}