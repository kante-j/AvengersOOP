package avengers;

import javax.swing.*;


public class Main extends JFrame {
	
	public Main(){
		JPanel panel = new JPanel();
		
		setTitle("Tutorial");
		
		setSize(640,480);
		setResizable(false);
		
		Menu menu = new Menu();
		
		add(menu);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();

	}

}
