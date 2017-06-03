package avengers;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class RollDicePanel extends JPanel {
 
    private Die _leftDie;   
  //private Die _rightDie;
    private int diceval;
    
    public int getDiceval() {
		System.out.println(diceval);
		return diceval;
	}


	public void setDiceval(int diceval) {
		this.diceval = diceval;
	}


	RollDicePanel() {
        //... Create the dice
        _leftDie  = new Die();
        
        
        //...Create the button to roll the dice
        JButton rollButton = new JButton("New Roll");
        rollButton.setFont(new Font("Sansserif", Font.PLAIN, 24));
        
        //... Add listener.
        rollButton.addActionListener(new RollListener());
        
        //... Layout components
        this.setLayout(new BorderLayout(5, 5));
        this.add(rollButton, BorderLayout.NORTH);
        this.add(_leftDie , BorderLayout.CENTER);
       //setDiceval(_leftDie.getValue());
        _leftDie.getValue();
        this.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    }
    
    
    ////////////////////////////////////////// inner listener class RollListener
    private class RollListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            _leftDie.roll();
          
        }
    }
}