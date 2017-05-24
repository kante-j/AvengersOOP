package avengers;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Custombutton extends JButton implements MouseListener {
	
	Dimension size = new Dimension(250,150);
	
	boolean hover = false;
	boolean click = false;
	
	String text = " ";
	
	public Custombutton(String text){
		setVisible(true);
		setFocusable(true);
		setContentAreaFilled(false);
		setBorderPainted(false);
		
		this.text = text;
		
		addMouseListener(this);
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(click){
			g.setColor(Color.WHITE);
			g.fillRect(0,0,250,250);
		}
		
		g.setColor(new Color(224, hover ? 160 : 224, 224));
		
		g.fillRect(0,0,250,7);
		g.fillRect(0,143,250,7);
		g.fillRect(0,0,7,150);
		g.fillRect(243, 0, 7, 150);
		
		g.setColor(new Color(128, 128, 128));
		
		g.fillRect(14, 14, 222, 122);

		g.setColor(Color.WHITE);
		
		g.setFont(Font.decode("arial-BOLD-ITALIC-30"));
		
		FontMetrics metrics = g.getFontMetrics();
		
		int width = metrics.stringWidth(text);
		
		g.drawString(text, 125-width/2, 75);
	}
	
	@Override
	public Dimension getPreferredSize(){
		return size;
	}
	@Override
	public Dimension getMaximumSize(){
		return size;
	}
	@Override
	public Dimension getMinimumSize(){
		return size;
	}
	
	public void setButtonText(String text){
		this.text = text;
	}
	
	public String getButtonText(){
		return text;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		hover = true;
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		click = false;
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		hover = true;
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		hover = false;
		
	}

	
	
}
