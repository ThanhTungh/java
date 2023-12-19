package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(47, 157, 96, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(47, 89, 96, 29);
		contentPane.add(lblNewLabel_1);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUsername.setColumns(10);
		txtUsername.setBounds(153, 89, 295, 29);
		contentPane.add(txtUsername);
		
		JLabel lblNewLabel_2 = new JLabel("Sign in");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(209, 10, 174, 41);
		contentPane.add(lblNewLabel_2);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(350, 283, 96, 29);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(125, 283, 96, 29);
		contentPane.add(btnCancel);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPassword.setBounds(153, 154, 295, 29);
		contentPane.add(txtPassword);
		
		JCheckBox ckShowPassword = new JCheckBox("Show password");
		ckShowPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ckShowPassword.setBounds(153, 207, 141, 21);
		contentPane.add(ckShowPassword);
		
		//-----------------------
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText("");
				txtPassword.setText("");
			}
		});
		ckShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtPassword.echoCharIsSet()) {
					txtPassword.setEchoChar('\0');
				}else {
					txtPassword.setEchoChar('●');
				}
			}
		});
		//////////////////////
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUsername.getText().equals("QuanDH") && txtPassword.getText().equals("123456")) {
					dispose(); //close the current JFrame
					//Display a new JFrame
					Home h = new Home();
					h.receiveInformation("QuanDH");
					h.setVisible(true);
					
				}else {
					JOptionPane.showConfirmDialog(null, "Username or Password is INVALID", 
							"Warning", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
	}
}
