package avengers;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Hulk extends Avengers_char {
	
	@Override
	public void gotPower(int num) {
		//question ���� �ٸ��� �ޱ�
	}
	
	@Override
	public void gotSpeed(int num) {
		//question ���� �ٸ��� �ޱ�
	}

	public void paintComponent(Graphics g){
		Image img = new ImageIcon("ironman.jpg").getImage();
		g.drawImage(img, 50, 130, null);
	}
}
