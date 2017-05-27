package avengers;

import javax.swing.*;
import java.awt.*;

public class RollDice extends JApplet {
	

	    public RollDice() {
	        this.setContentPane(new RollDicePanel());
	    }
	    
	
	    public static void main(String[] args) {
	        JFrame window = new JFrame("Dice Demo");
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        window.setContentPane(new RollDicePanel());
	        window.pack();
	        window.setLocationRelativeTo(null);
	        window.setVisible(true);
	    }
	}