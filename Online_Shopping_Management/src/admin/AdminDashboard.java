package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminDashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard frame = new AdminDashboard();
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
	public AdminDashboard() {
		initComponents();
		init();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 728);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(36, 35, 63));
		panel.setBounds(0, 80, 320, 599);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 0, 255));
		panel_2.setBounds(0, 35, 320, 48);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("DASHBOARD");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			
		});
		lblNewLabel_1.setBounds(86, 0, 224, 48);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(49, 0, 96, 48);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\divya\\Downloads\\icons\\dashboard.png"));
		
		JLabel lbManageCat = new JLabel("Manage Categories");
		lbManageCat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManageCategory catgories = new ManageCategory();
				catgories.show();
				dispose();
				
			}
		});
		lbManageCat.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbManageCat.setForeground(new Color(126, 126, 126));
		lbManageCat.setBounds(74, 117, 246, 39);
		panel.add(lbManageCat);
		
		JLabel lblManageProducts = new JLabel("Manage Products");
		lblManageProducts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManageProduct products = new ManageProduct();
				products.show();
				dispose();
			}
		});
		lblManageProducts.setForeground(new Color(126, 126, 126));
		lblManageProducts.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblManageProducts.setBounds(74, 167, 246, 39);
		panel.add(lblManageProducts);
		
		JLabel lblManageUsers = new JLabel("Manage Users");
		lblManageUsers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManageUsers manage_user = new ManageUsers();
				manage_user.show();
				dispose();
			}
		});
		lblManageUsers.setForeground(new Color(126, 126, 126));
		lblManageUsers.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblManageUsers.setBounds(74, 217, 246, 39);
		panel.add(lblManageUsers);
		
		JLabel lblAddSupplier = new JLabel("Add Supplier");
		lblAddSupplier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddSupplier add_supplier = new AddSupplier();
				add_supplier.show();
				dispose();
				
			}
		});
		lblAddSupplier.setForeground(new Color(126, 126, 126));
		lblAddSupplier.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAddSupplier.setBounds(74, 267, 246, 39);
		panel.add(lblAddSupplier);
		
		JLabel lblManageSuppliers = new JLabel("Manage Suppliers");
		lblManageSuppliers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManageSupplier manage_supplier = new ManageSupplier();
				manage_supplier.show();
				dispose();
			}
		});
		lblManageSuppliers.setForeground(new Color(126, 126, 126));
		lblManageSuppliers.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblManageSuppliers.setBounds(74, 312, 246, 39);
		panel.add(lblManageSuppliers);
		
		JLabel lblSelectSupplier = new JLabel("Select Supplier");
		lblSelectSupplier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SelectSupplier select_supplier = new SelectSupplier();
				select_supplier.show();
				dispose();
			}
		});
		lblSelectSupplier.setForeground(new Color(126, 126, 126));
		lblSelectSupplier.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSelectSupplier.setBounds(74, 361, 246, 39);
		panel.add(lblSelectSupplier);
		
		JLabel lblTransaction = new JLabel("Transaction");
		lblTransaction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Transaction transactions = new Transaction();
				transactions.show();
				dispose();
				
			}
		});
		lblTransaction.setForeground(new Color(126, 126, 126));
		lblTransaction.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTransaction.setBounds(74, 411, 246, 39);
		panel.add(lblTransaction);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(38, 120, 58, 36);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\divya\\Downloads\\icons\\category_dark.png"));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(38, 167, 60, 43);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\divya\\Downloads\\icons\\product_dark.png"));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(38, 311, 47, 40);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\divya\\Downloads\\icons\\edit_supplier_dark.png"));
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setBounds(38, 217, 47, 40);
		panel.add(lblNewLabel_6_1);
		lblNewLabel_6_1.setIcon(new ImageIcon("C:\\Users\\divya\\Downloads\\icons\\edit_supplier_dark.png"));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(38, 362, 47, 39);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\divya\\Downloads\\icons\\supplier_dark.png"));
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(38, 272, 47, 29);
		panel.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\divya\\Downloads\\icons\\account_dark.png"));
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(38, 410, 52, 40);
		panel.add(lblNewLabel_8);
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\divya\\Downloads\\icons\\transaction_dark.png"));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(75, 186, 100));
		panel_1.setBounds(0, 0, 1197, 82);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ONLINE SHOPPING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(117, 27, 439, 33);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(10, -13, 100, 109);
		panel_1.add(lblNewLabel_9);
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\divya\\Downloads\\icons8-favorite-cart-100 (1).png"));
		
		JLabel lbadmingmail = new JLabel("admin@gmail.com");
		lbadmingmail.setForeground(new Color(255, 255, 255));
		lbadmingmail.setBounds(749, 24, 207, 36);
		panel_1.add(lbadmingmail);
		lbadmingmail.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(722, 27, 70, 35);
		panel_1.add(lblNewLabel_10);
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\divya\\Downloads\\icons\\user.png"));
		
		JLabel lbLogout = new JLabel("Logout");
		lbLogout.addMouseListener(new MouseAdapter() {
			private void init() {
				icons();
				
			}
			
			private void icons() {
				// TODO Auto-generated method stub
				
				
			}

			public void mouseClicked(java.awt.event.MouseEvent evt) {
				AdminLogin admin_login = new AdminLogin();
				admin_login.show();
				dispose();
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		lbLogout.setForeground(new Color(255, 255, 255));
		lbLogout.setBounds(1114, 24, 73, 36);
		panel_1.add(lbLogout);
		lbLogout.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(1083, 20, 47, 40);
		panel_1.add(lblNewLabel_11);
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\divya\\Downloads\\icons\\logout.png"));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(192, 192, 192));
		panel_3.setBounds(342, 127, 832, 173);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblStatistics = new JLabel("Statistics");
		lblStatistics.setBounds(385, 0, 258, 42);
		panel_3.add(lblStatistics);
		lblStatistics.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lbTotalCategory = new JLabel("Total Categories :  0");
		lbTotalCategory.setBounds(20, 44, 233, 39);
		panel_3.add(lbTotalCategory);
		lbTotalCategory.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JLabel lblTotalProducts = new JLabel("Total Products :  0");
		lblTotalProducts.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblTotalProducts.setBounds(20, 94, 233, 39);
		panel_3.add(lblTotalProducts);
		
		JLabel lblTotalUsers = new JLabel("Total Users :  0");
		lblTotalUsers.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblTotalUsers.setBounds(325, 44, 233, 39);
		panel_3.add(lblTotalUsers);
		
		JLabel lblTotalSuppliers = new JLabel("Total Suppliers :  0");
		lblTotalSuppliers.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblTotalSuppliers.setBounds(325, 81, 233, 39);
		panel_3.add(lblTotalSuppliers);
		
		JLabel lblTotalSales = new JLabel("Today Sales :  0.0");
		lblTotalSales.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblTotalSales.setBounds(568, 44, 233, 39);
		panel_3.add(lblTotalSales);
		
		JLabel lblTotalUsers_2 = new JLabel("Total Sales :  0.0");
		lblTotalUsers_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblTotalUsers_2.setBounds(568, 81, 233, 39);
		panel_3.add(lblTotalUsers_2);
	}

	private void init() {
		// TODO Auto-generated method stub
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
