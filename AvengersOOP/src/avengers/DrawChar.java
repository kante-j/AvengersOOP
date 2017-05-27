package avengers;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class DrawChar extends JPanel {
	Image image;
	public DrawChar() {
		image = new ImageIcon("HULK.png").getImage();

	}

	// 오버라이딩..,
	public void paint(Graphics g) {
		super.paint(g);
		Image img = new ImageIcon("HULK.png").getImage();
		g.drawImage(img, 0, 0, null);
	}
}