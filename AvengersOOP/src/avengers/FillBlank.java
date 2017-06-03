package avengers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import java.awt.TextArea;

public class FillBlank extends JFrame implements Questions{

	private JPanel contentPane;
	private JTextField textField;
	private BufferedImage bi = null;
	private String answer="20/120";
	private String path;
	/**
	 * Launch the application.
	 */
	
	public FillBlank(String path, String FillAnswer)
	{
		answer = FillAnswer;
		this.path = path;
	}
	
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
	 * @throws IOException 
	 */
	public FillBlank() throws IOException {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel;
		contentPane.add(panel=new JPanel());
		
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1;
		
		
		
		
		panel.add(panel_1=new JPanel(), BorderLayout.SOUTH);
		
		JTextArea textArea = new JTextArea();
		  try
          {
              FileReader reader = new FileReader( "fill3.txt" );
              BufferedReader br = new BufferedReader(reader);
              textArea.read( br, null );
              br.close();
              textArea.requestFocus();
          }
          catch(Exception e2) { 
          	
          }
		  JScrollPane pane = new JScrollPane(textArea);
		

		
		panel.add(pane, BorderLayout.CENTER);
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
