package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddSupplier extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSupplierID;
	private JTextField textFieldUserName;
	private JTextField textFieldEmail;
	private JPasswordField passwordField;
	private JTextField textFieldPhone;
	private JTextField textFieldAddress1;
	private JTextField textFieldAddress2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSupplier frame = new AddSupplier();
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
	public AddSupplier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 707);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbSupplierID = new JLabel("Supplier ID");
		lbSupplierID.setForeground(Color.WHITE);
		lbSupplierID.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbSupplierID.setBounds(38, 35, 150, 28);
		contentPane.add(lbSupplierID);
		
		textFieldSupplierID = new JTextField();
		textFieldSupplierID.setBounds(34, 64, 362, 38);
		contentPane.add(textFieldSupplierID);
		textFieldSupplierID.setColumns(10);
		
		JLabel lbUserName = new JLabel("UserName");
		lbUserName.setForeground(Color.WHITE);
		lbUserName.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbUserName.setBounds(38, 120, 150, 28);
		contentPane.add(lbUserName);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setColumns(10);
		textFieldUserName.setBounds(34, 148, 362, 38);
		contentPane.add(textFieldUserName);
		
		JLabel lbEmail = new JLabel("Email");
		lbEmail.setForeground(Color.WHITE);
		lbEmail.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbEmail.setBounds(34, 197, 150, 28);
		contentPane.add(lbEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(34, 227, 362, 38);
		contentPane.add(textFieldEmail);
		
		JLabel lbPassword = new JLabel("Password");
		lbPassword.setForeground(Color.WHITE);
		lbPassword.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbPassword.setBounds(34, 276, 150, 28);
		contentPane.add(lbPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(34, 305, 362, 38);
		contentPane.add(passwordField);
		
		JLabel lbPhone = new JLabel("Phone");
		lbPhone.setForeground(Color.WHITE);
		lbPhone.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbPhone.setBounds(34, 354, 150, 28);
		contentPane.add(lbPhone);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(34, 384, 362, 38);
		contentPane.add(textFieldPhone);
		
		JLabel lbAddress1 = new JLabel("Address Line 1 (State & Area )");
		lbAddress1.setForeground(Color.WHITE);
		lbAddress1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbAddress1.setBounds(38, 429, 362, 28);
		contentPane.add(lbAddress1);
		
		textFieldAddress1 = new JTextField();
		textFieldAddress1.setColumns(10);
		textFieldAddress1.setBounds(38, 465, 362, 38);
		contentPane.add(textFieldAddress1);
		
		JLabel lbSupplierID_1_1_1_1_1_1 = new JLabel("Address Line 2 ( Country )");
		lbSupplierID_1_1_1_1_1_1.setForeground(Color.WHITE);
		lbSupplierID_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbSupplierID_1_1_1_1_1_1.setBounds(38, 503, 331, 28);
		contentPane.add(lbSupplierID_1_1_1_1_1_1);
		
		textFieldAddress2 = new JTextField();
		textFieldAddress2.setColumns(10);
		textFieldAddress2.setBounds(38, 536, 362, 38);
		contentPane.add(textFieldAddress2);
		
		JButton btnNewButtonSave = new JButton("Save");
		btnNewButtonSave.setForeground(new Color(255, 255, 255));
		btnNewButtonSave.setBackground(new Color(35, 71, 71));
		btnNewButtonSave.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButtonSave.setBounds(81, 598, 107, 38);
		contentPane.add(btnNewButtonSave);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddSupplier add_supplier = new AddSupplier();
				add_supplier.show();
				dispose();
			}
		});
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setBackground(new Color(37, 73, 73));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnClear.setBounds(242, 598, 107, 38);
		contentPane.add(btnClear);
		
		JLabel lblNewLabel_1 = new JLabel("   X");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(465, 0, 42, 52);
		contentPane.add(lblNewLabel_1);
	}
}
