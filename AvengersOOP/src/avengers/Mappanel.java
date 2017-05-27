package avengers;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import avengers.Menu;

public class Mappanel extends JPanel {
	Image image;
	public Mappanel() {
		image = new ImageIcon("map.png").getImage();

	}

	// 오버라이딩..,
	public void paint(Graphics g) {
		// setOpaque(false);//투명하게
		super.paint(g);
		Image img = new ImageIcon("map.png").getImage();
		g.drawImage(img, 0, 0, null);
	}

	public void paintchar(Graphics g) {
		// setOpaque(false);//투명하게
		super.paint(g);
		Image img = new ImageIcon("HULK.png").getImage();
		g.drawImage(img, 0, 0, null);
	}
}