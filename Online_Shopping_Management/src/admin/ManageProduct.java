package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManageProduct extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_ProductID;
	private JTextField textField_ProductName;
	private JTextField textField_Category;
	private JTextField textField_Quantity;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageProduct frame = new ManageProduct();
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
	public ManageProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1139, 769);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Product ID", "Product Name", "Category", "Quantity", "Price"},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(465, 172, 598, 442);
		contentPane.add(table);
		
		JLabel lbSearch = new JLabel("Search");
		lbSearch.setForeground(new Color(255, 255, 255));
		lbSearch.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbSearch.setBounds(643, 114, 95, 36);
		contentPane.add(lbSearch);
		
		textField = new JTextField();
		textField.setBounds(748, 120, 311, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbProductID = new JLabel("Product ID");
		lbProductID.setForeground(new Color(255, 255, 255));
		lbProductID.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbProductID.setBounds(85, 157, 133, 36);
		contentPane.add(lbProductID);
		
		textField_ProductID = new JTextField();
		textField_ProductID.setBounds(87, 189, 333, 41);
		contentPane.add(textField_ProductID);
		textField_ProductID.setColumns(10);
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setForeground(new Color(255, 255, 255));
		lblProductName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProductName.setBounds(85, 229, 225, 36);
		contentPane.add(lblProductName);
		
		textField_ProductName = new JTextField();
		textField_ProductName.setColumns(10);
		textField_ProductName.setBounds(85, 264, 333, 41);
		contentPane.add(textField_ProductName);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setForeground(new Color(255, 255, 255));
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCategory.setBounds(85, 306, 225, 36);
		contentPane.add(lblCategory);
		
		textField_Category = new JTextField();
		textField_Category.setColumns(10);
		textField_Category.setBounds(85, 342, 333, 41);
		contentPane.add(textField_Category);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setForeground(new Color(255, 255, 255));
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQuantity.setBounds(85, 388, 225, 36);
		contentPane.add(lblQuantity);
		
		textField_Quantity = new JTextField();
		textField_Quantity.setColumns(10);
		textField_Quantity.setBounds(85, 420, 333, 41);
		contentPane.add(textField_Quantity);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(new Color(255, 255, 255));
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(85, 461, 225, 36);
		contentPane.add(lblPrice);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 505, 333, 41);
		contentPane.add(textField_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBackground(new Color(34, 68, 68));
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnSave.setBounds(113, 598, 115, 41);
		contentPane.add(btnSave);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBackground(new Color(34, 68, 68));
		btnUpdate.setBounds(257, 598, 115, 41);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDelete.setBackground(new Color(34, 68, 68));
		btnDelete.setBounds(113, 650, 115, 41);
		contentPane.add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManageProduct manage_product = new ManageProduct();
				manage_product.show();
				dispose();
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnClear.setBackground(new Color(34, 68, 68));
		btnClear.setBounds(257, 650, 115, 41);
		contentPane.add(btnClear);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(28, 55, 55));
		panel.setBounds(0, 0, 1123, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblManageProducts = new JLabel("Manage Products");
		lblManageProducts.setBounds(375, 11, 420, 49);
		panel.add(lblManageProducts);
		lblManageProducts.setForeground(Color.WHITE);
		lblManageProducts.setFont(new Font("Wide Latin", Font.PLAIN, 24));
	}
}
