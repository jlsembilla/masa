package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mainFrm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static mainFrm obj = new mainFrm();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					obj.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainFrm() {
		setResizable(false);
		setTitle("Login Form");
		
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int x = JOptionPane.showConfirmDialog(null ,"Do you really want to exit?", "PROGRAM", JOptionPane.YES_NO_OPTION);
				if(x == 0)
				{
					System.exit(0);
				}
				else {
					obj.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
		});
		FlatLightLaf.setup();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 528);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("MASA");
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 50));
		lblNewLabel_2.setBounds(34, 82, 159, 94);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(mainFrm.class.getResource("/images/sweetsPng.png")));
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(10, 202, 220, 251);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(254, 0, 4, 479);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(254, 0, 329, 479);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(24, 203, 264, 25);
		panel_2.add(textField);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Constantia", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField.setBackground(Color.GRAY);
		textField.setBorder(BorderFactory.createCompoundBorder(
				textField.getBorder(), 
		        BorderFactory.createEmptyBorder(3, 5, 5, 5)));
		
		JLabel lblNewLabel_1_1 = new JLabel("Username");
		lblNewLabel_1_1.setBounds(24, 160, 72, 32);
		panel_2.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(SystemColor.control);
		lblNewLabel_1_1.setFont(new Font("Best School", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("ACCOUNT LOGIN");
		lblNewLabel_1.setBounds(10, 43, 317, 32);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(SystemColor.control);
		lblNewLabel_1.setFont(new Font("Best School", Font.PLAIN, 30));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(SystemColor.menu);
		lblNewLabel_1_1_1.setFont(new Font("Best School", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(24, 247, 72, 32);
		panel_2.add(lblNewLabel_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('•');
		passwordField.setFont(new Font("Constantia", Font.PLAIN, 16));
		passwordField.setBackground(Color.GRAY);
		passwordField.setForeground(Color.WHITE);
		passwordField.setBounds(24, 290, 264, 25);
		passwordField.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(passwordField);
		passwordField.setBorder(BorderFactory.createCompoundBorder(
				textField.getBorder(), 
		        BorderFactory.createEmptyBorder(1, 5, 5, 5)));
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setFont(new Font("Constantia", Font.PLAIN, 15));
		btnNewButton.setBounds(24, 342, 94, 32);
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton.setBorderPainted(false);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1.setFont(new Font("Constantia", Font.PLAIN, 15));
		btnNewButton_1.setBounds(124, 342, 164, 32);
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton_1.setBorderPainted(false);
		panel_2.add(btnNewButton_1);
		
		this.setLocationRelativeTo(null);
	}
}
