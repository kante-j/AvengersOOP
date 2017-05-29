package avengers;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class DrawChar extends JPanel {
	Image image;
	// Select_Char sc = new Select_Char();
	// int charval = sc.getCharval();

	public DrawChar(int charval) {
		if (charval == 1) {
			image = new ImageIcon("HULK.png").getImage();
		} else if (charval == 2) {
			image = new ImageIcon("CaptineAmerica.png").getImage();
		}
	}

	// 오버라이딩..,
	public void paint(Graphics g) {
		super.paint(g);
		Image img = new ImageIcon(image).getImage();
		g.drawImage(img, 0, 0, null);
	}
}