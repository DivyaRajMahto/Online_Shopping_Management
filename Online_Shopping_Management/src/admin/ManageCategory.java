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
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManageCategory extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageCategory frame = new ManageCategory();
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
	public ManageCategory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 614);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"           Category ID", "           Category Name", "            Description"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.setBounds(268, 166, 602, 360);
		contentPane.add(table);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblSearch.setForeground(new Color(255, 255, 255));
		lblSearch.setBounds(572, 112, 74, 38);
		contentPane.add(lblSearch);
		
		textField = new JTextField();
		textField.setBounds(656, 117, 214, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(26, 51, 51));
		panel.setBounds(0, 0, 880, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCategory = new JLabel("Manage Category");
		lblCategory.setBounds(271, 11, 420, 49);
		panel.add(lblCategory);
		lblCategory.setFont(new Font("Wide Latin", Font.PLAIN, 24));
		lblCategory.setForeground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("Category ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(20, 152, 204, 38);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(20, 185, 220, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCategoryName = new JLabel("Category Name");
		lblCategoryName.setForeground(Color.WHITE);
		lblCategoryName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCategoryName.setBounds(20, 228, 204, 38);
		contentPane.add(lblCategoryName);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setForeground(Color.WHITE);
		lblDescription.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDescription.setBounds(20, 305, 204, 38);
		contentPane.add(lblDescription);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(20, 261, 220, 33);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(20, 340, 220, 33);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(30, 60, 60));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(30, 384, 90, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(28, 55, 55));
		btnNewButton_1.setBounds(130, 384, 110, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Delete");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(new Color(28, 55, 55));
		btnNewButton_1_1.setBounds(30, 445, 90, 38);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Clear");
		btnNewButton_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManageCategory manage_category = new ManageCategory();
				manage_category.show();
				dispose();
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1_2.setBackground(new Color(28, 55, 55));
		btnNewButton_1_2.setBounds(130, 445, 110, 38);
		contentPane.add(btnNewButton_1_2);
	}
}
