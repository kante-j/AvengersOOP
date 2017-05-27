package avengers;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

import com.sun.imageio.stream.StreamCloser.CloseAction;

public class Menu extends JPanel {

	JFrame frame = new JFrame("Tutorial");
	JPanel panel = new JPanel();
	
	public boolean started = false;

	public Menu() {

		frame.setSize(640, 480);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		// panel.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		// panel.add(Box.createVerticalStrut(280));
		Custombutton button = new Custombutton("START");
		button.setOpaque(false);
		panel.add(button);
		button.setAlignmentX(CENTER_ALIGNMENT);
		button.addActionListener(new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				start();
				frame.setVisible(false);
				new Story();
			}

		});
		
		frame.add(panel);
		panel.add(Box.createVerticalGlue());

	}

	public void start() {
		started = true;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img = new ImageIcon("avengers_background.jpg").getImage();
		g.drawImage(img, 0, 0, 640, 480, null);

	}
}
