package supplier;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class SupplierDashboared extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupplierDashboared frame = new SupplierDashboared();
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
	public SupplierDashboared() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1138, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 128));
		panel.setBounds(10, 10, 1104, 52);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ONLINE SHOPPING");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\prati\\OneDrive\\Pictures\\shop cart.png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(51, 7, 343, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("supplier@gmail.com");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(707, 10, 186, 29);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Logout");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(997, 10, 97, 29);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\prati\\OneDrive\\Pictures\\email.png"));
		lblNewLabel_13.setBounds(676, 10, 31, 32);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\prati\\OneDrive\\Pictures\\logout.png"));
		lblNewLabel_14.setBounds(953, 10, 45, 32);
		panel.add(lblNewLabel_14);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(10, 63, 250, 543);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 0, 255));
		panel_2.setBounds(0, 44, 250, 48);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("DASHBOARD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setBounds(46, 10, 162, 28);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Delivery");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Delivery dl = new Delivery();
				dl.show();
				dispose();
			}
		});
		lblNewLabel_2.setBounds(119, 138, 109, 33);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNewLabel_3 = new JLabel("My Deliveries");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyDeliveries md = new MyDeliveries();
				md.show();
				dispose();
			}
		});
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(120, 223, 130, 26);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("My Account");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SupplierAccount obj = new SupplierAccount();
				obj.show();
				Dispose();
			}

			private void Dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(119, 293, 109, 26);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\prati\\OneDrive\\Pictures\\login.png"));
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(52, 293, 45, 33);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\prati\\OneDrive\\Pictures\\delivery.png"));
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setBounds(52, 139, 45, 36);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\prati\\OneDrive\\Pictures\\deliveries.png"));
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setBounds(52, 220, 45, 41);
		panel_1.add(lblNewLabel_12);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(270, 95, 543, 201);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("My Statistics");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel_5.setBounds(184, 10, 195, 35);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_8 = new JLabel("My Deliveries:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8.setBounds(24, 62, 142, 26);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("0");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_9.setBounds(189, 69, 45, 19);
		panel_3.add(lblNewLabel_9);
	}
}
