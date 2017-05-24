package avengers;
import javax.swing.*;
import java.awt.BorderLayout;

public class testGUI {
	
	private JFrame frame;
	private JButton button;
	public void buildGUI(){
		frame = new JFrame("Mouse and Key App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Menu menu = new Menu();
		frame.add(menu);
		
		button = new JButton("Avengers");
		frame.add(button, BorderLayout.SOUTH);
		frame.setSize(1200, 800);
		
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		testGUI m = new testGUI();
		m.buildGUI();
	}
}