package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JTextField;

public class LoginFrm {

	private JFrame frmWelcomeToMasas;
	private JTextField textUser;
	public Border border = BorderFactory.createLineBorder(Color.WHITE, 2);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrm window = new LoginFrm();
					window.frmWelcomeToMasas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginFrm() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToMasas = new JFrame();
		frmWelcomeToMasas.setTitle("WELCOME TO MASAS");
		frmWelcomeToMasas.setBounds(100, 100, 664, 496);
		frmWelcomeToMasas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToMasas.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmWelcomeToMasas.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/sweetsPng.png")));
		lblNewLabel.setBounds(35, 169, 220, 251);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(302, 0, 4, 468);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(302, 0, 350, 468);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ACCOUNT LOGIN");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Best School", Font.PLAIN, 22));
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setBounds(0, 30, 350, 32);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Username");
		lblNewLabel_1_1.setFont(new Font("Best School", Font.PLAIN, 16));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(138, 146, 72, 32);
		panel_2.add(lblNewLabel_1_1);
		
		textUser = new JTextField();
		textUser.setForeground(Color.WHITE);
		textUser.setBorder(border);
		textUser.setBackground(Color.GRAY);
		textUser.setFont(new Font("Best School", Font.PLAIN, 16));
		textUser.setBounds(60, 179, 230, 23);
		panel_2.add(textUser);
		textUser.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MASA");
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 50));
		lblNewLabel_2.setBounds(81, 42, 159, 94);
		panel.add(lblNewLabel_2);
	}
}
