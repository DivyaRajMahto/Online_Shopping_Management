package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManageSupplier extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSupplierID;
	private JTextField textFieldName;
	private JTextField textFieldEmail;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textFieldAddress1;
	private JTextField textFieldAddress2;
	private JTable table;
	private JTable table_1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageSupplier frame = new ManageSupplier();
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
	public ManageSupplier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 863);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbSupplierID = new JLabel("Supplier ID");
		lbSupplierID.setForeground(new Color(255, 255, 255));
		lbSupplierID.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbSupplierID.setBounds(36, 131, 278, 27);
		contentPane.add(lbSupplierID);
		
		textFieldSupplierID = new JTextField();
		textFieldSupplierID.setBounds(36, 169, 365, 44);
		contentPane.add(textFieldSupplierID);
		textFieldSupplierID.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblName.setBounds(36, 222, 278, 27);
		contentPane.add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(36, 260, 365, 44);
		contentPane.add(textFieldName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblEmail.setBounds(36, 315, 278, 27);
		contentPane.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(36, 353, 365, 44);
		contentPane.add(textFieldEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPassword.setBounds(36, 408, 278, 27);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(36, 446, 365, 44);
		contentPane.add(passwordField);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPhone.setBounds(510, 131, 278, 27);
		contentPane.add(lblPhone);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(504, 169, 365, 44);
		contentPane.add(textField);
		
		JLabel lblAddressLine1 = new JLabel("Address Line 1 ( State & Area )");
		lblAddressLine1.setForeground(Color.WHITE);
		lblAddressLine1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblAddressLine1.setBounds(504, 222, 360, 27);
		contentPane.add(lblAddressLine1);
		
		textFieldAddress1 = new JTextField();
		textFieldAddress1.setColumns(10);
		textFieldAddress1.setBounds(499, 260, 365, 44);
		contentPane.add(textFieldAddress1);
		
		JLabel lblAddressLine2 = new JLabel("Address Line 2 ( Country )");
		lblAddressLine2.setForeground(Color.WHITE);
		lblAddressLine2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblAddressLine2.setBounds(504, 315, 360, 27);
		contentPane.add(lblAddressLine2);
		
		textFieldAddress2 = new JTextField();
		textFieldAddress2.setColumns(10);
		textFieldAddress2.setBounds(504, 353, 365, 44);
		contentPane.add(textFieldAddress2);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(29, 58, 58));
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnUpdate.setBounds(520, 437, 157, 50);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDelete.setBackground(new Color(29, 58, 58));
		btnDelete.setBounds(720, 437, 144, 50);
		contentPane.add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManageSupplier manage_supplier = new ManageSupplier();
				manage_supplier.show();
				dispose();
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnClear.setBackground(new Color(29, 58, 58));
		btnClear.setBounds(629, 498, 137, 50);
		contentPane.add(btnClear);
		
		table = new JTable();
		table.setBounds(163, 591, -77, -101);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setSurrendersFocusOnKeystroke(true);
		table_1.setFillsViewportHeight(true);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Supplier ID", "Name", "Email", "Password", "Phone", "Address Line 1", "Address Line 2"},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "Address Line 2"
			}
		));
		table_1.setBounds(10, 638, 938, 176);
		contentPane.add(table_1);
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(551, 583, 103, 44);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(650, 594, 291, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 563, 967, 44);
		contentPane.add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(35, 71, 71));
		panel.setBounds(0, 0, 987, 58);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Manage Suppliers");
		lblNewLabel_1.setBounds(277, 11, 428, 44);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Wide Latin", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(Color.WHITE);
	}
}
