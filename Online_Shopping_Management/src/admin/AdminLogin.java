package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField_AdminID;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 590);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(31, 61, 61));
		panel.setBounds(179, 11, 464, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setBounds(90, 13, 335, 55);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Wide Latin", Font.BOLD, 28));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(18, 0, 91, 72);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\divya\\Downloads\\icons8-user-64.png"));
		
		JLabel lbAdminID = new JLabel("Admin ID : ");
		lbAdminID.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lbAdminID.setForeground(Color.WHITE);
		lbAdminID.setBounds(146, 165, 207, 64);
		contentPane.add(lbAdminID);
		
		textField_AdminID = new JTextField();
		textField_AdminID.setBounds(303, 179, 340, 48);
		contentPane.add(textField_AdminID);
		textField_AdminID.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblPassword.setBounds(146, 246, 207, 64);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminDashboard admin = new AdminDashboard();
				admin.show();
				dispose();
			}
		});
		btnLogin.setBackground(new Color(33, 65, 65));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Wide Latin", Font.PLAIN, 19));
		btnLogin.setBounds(211, 419, 133, 48);
		contentPane.add(btnLogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminLogin admin_login = new AdminLogin();
				admin_login.show();
				dispose();
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		btnClear.setBackground(new Color(33, 65, 65));
		btnClear.setBounds(412, 419, 133, 48);
		contentPane.add(btnClear);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(303, 260, 340, 48);
		contentPane.add(passwordField);
	}
}
