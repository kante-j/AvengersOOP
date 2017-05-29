package avengers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class map {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					map window = new map(1);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public map(int charval) {
		initialize(charval);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int charval) {
		frame = new JFrame();
		frame.setBounds(0, 0, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
					.addContainerGap())
		);
		DrawChar dc = new DrawChar(charval);
		dc.setBounds(0,0,220,330);
		dc.setOpaque(false);
		layeredPane.add(dc);
		
		RollDicePanel rdp = new RollDicePanel();
		rdp.setBounds(0, 574, 139, 127);
		layeredPane.add(rdp);
		
		
		Mappanel imgP = new Mappanel();
		imgP.setBounds(0,0,1250,750);
		layeredPane.add(imgP);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(167, 120, 57, 15);
		layeredPane.add(lblNewLabel);
		
	}
}
