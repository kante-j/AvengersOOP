package avengers;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Hulk extends Avengers_char {
	
	@Override
	public void gotPower(int num) {
		//question 따라 다르게 받기
	}
	
	@Override
	public void gotSpeed(int num) {
		//question 따라 다르게 받기
	}

	public void paintComponent(Graphics g){
		Image img = new ImageIcon("ironman.jpg").getImage();
		g.drawImage(img, 50, 130, null);
	}
}
