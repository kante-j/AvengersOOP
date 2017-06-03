package avengers;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pick extends JFrame implements Questions {

	private JPanel contentPane;
	private JComboBox textField;
	private JTextArea textArea;
	private String path;
	private int answer=1;

	/**
	 * Launch the application.
	 */
	public Pick(String path, int answer){
		this.path = path;
		this.answer = answer;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pick frame = new Pick();
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
	public Pick() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		
		
		textField = new JComboBox();
		textField.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		panel.add(textField);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check())
					JOptionPane.showMessageDialog(null,"Exellent!");
				else JOptionPane.showMessageDialog(null,"Fail!");
			
			}
		});
		panel.add(btnSubmit);
		
		textArea = new JTextArea();
		JTextArea textArea = new JTextArea();
		  try
        {
            FileReader reader = new FileReader( "pick1.txt" );
            BufferedReader br = new BufferedReader(reader);
            textArea.read( br, null );
            br.close();
            textArea.requestFocus();
        }
        catch(Exception e2) { 
        	
        }
		  JScrollPane pane = new JScrollPane(textArea);
		contentPane.add(pane, BorderLayout.CENTER);
	}

	@Override
	public boolean check() {
		int answer2 = textField.getSelectedIndex();
		if(answer==answer2)
		return true;
		else 
		return false;
	}

	@Override
	public void showDescription() {
		// TODO Auto-generated method stub
		
	}

}
