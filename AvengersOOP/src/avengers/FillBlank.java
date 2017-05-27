package avengers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FillBlank extends JFrame implements Questions{

	private JPanel contentPane;
	private JTextField textField;
	private BufferedImage bi = null;
	private String answer="implements";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FillBlank frame = new FillBlank();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FillBlank() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel;
		contentPane.add(panel=new JPanel(){
			
			public void paintComponent(Graphics g){
				BufferedImage bi = null;
				try {
					bi=bufferedImage();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				g.drawImage(bi,0,0,750, 300, null);
			
			}});
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1;
		
		
		
		
		panel.add(panel_1=new JPanel(), BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Answer : ");
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(check())
					JOptionPane.showMessageDialog(null,"Exellent!");
				else JOptionPane.showMessageDialog(null,"Fail!");
			}
		});
		panel_1.add(btnNewButton);
	}
	private BufferedImage bufferedImage() throws Exception{
		File file =new File("./fillblank1.png.jpg");
		BufferedImage bi = ImageIO.read(file);
		return bi;
	}

	@Override
	public boolean check() {
		String answer2 = textField.getText();
		if(answer.equalsIgnoreCase(answer2))
			return true;
		else 
		return false;
	}

	@Override
	public void showDescription() {
		
		
	}

}
