package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;

import Model.AgeGroup;
import Model.Employee;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class frm_Add extends JFrame {
	//Properties
	private JPanel contentPane;	
	private JLabel lblProfile;
	private JButton btnLogout;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnSubmit;
	private JButton btnCancel;
	private JTextField txtUsername;
	private JRadioButton rbMale;
	private JRadioButton rbFemale;
	private JTextArea txtAddress;
	private JCheckBox ckTravelling;
	private JCheckBox ckSport;
	private JCheckBox ckReading;
	private JComboBox cboAgeGroup;
	private Home parentForm;
	private boolean flag;
	private int id;
	private int index;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Add frame = new frm_Add();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//Constructors
	public frm_Add() {
		setTitle("Welcome to FPT");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 618, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 10, 584, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblProfile = new JLabel("Hello ...");
		lblProfile.setBounds(335, 9, 56, 20);
		panel.add(lblProfile);
		lblProfile.setForeground(Color.RED);
		lblProfile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProfile.setBackground(Color.WHITE);
		
		btnLogout = new JButton("Logout");
		btnLogout.setBounds(447, 5, 97, 29);
		panel.add(btnLogout);
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 71, 584, 455);
		contentPane.add(panel_1);
		
		lblNewLabel = new JLabel("Adding new employee");
		lblNewLabel.setBounds(152, 10, 314, 34);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		lblNewLabel_1 = new JLabel("Username: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(39, 83, 103, 20);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(39, 134, 103, 20);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Sex: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(39, 282, 103, 20);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Hobbies: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(39, 326, 103, 20);
		panel_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Age Group: ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(39, 379, 103, 20);
		panel_1.add(lblNewLabel_5);
		
		rbMale = new JRadioButton("Male");
		rbMale.setSelected(true);
		rbMale.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbMale.setBounds(139, 284, 103, 21);
		panel_1.add(rbMale);
		
		rbFemale = new JRadioButton("Female");
		rbFemale.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbFemale.setBounds(337, 284, 103, 21);
		panel_1.add(rbFemale);
		
		txtAddress = new JTextArea();
		txtAddress.setRows(5);
		txtAddress.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtAddress.setBounds(140, 134, 378, 117);
		panel_1.add(txtAddress);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUsername.setBounds(140, 71, 378, 34);
		panel_1.add(txtUsername);
		txtUsername.setColumns(10);
		
		ckTravelling = new JCheckBox("Travelling");
		ckTravelling.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ckTravelling.setBounds(140, 328, 118, 21);
		panel_1.add(ckTravelling);
		
		ckSport = new JCheckBox("Sport");
		ckSport.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ckSport.setBounds(288, 328, 118, 21);
		panel_1.add(ckSport);
		
		ckReading = new JCheckBox("Reading");
		ckReading.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ckReading.setBounds(435, 328, 83, 21);
		panel_1.add(ckReading);
		
		cboAgeGroup = new JComboBox();
		cboAgeGroup.setModel(new DefaultComboBoxModel(new String[] {"Under 18", "From 18 to 50", "Above 50"}));
		cboAgeGroup.setSelectedIndex(1);
		cboAgeGroup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cboAgeGroup.setBounds(140, 368, 378, 34);
		panel_1.add(cboAgeGroup);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSubmit.setBounds(411, 542, 125, 29);
		contentPane.add(btnSubmit);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(44, 542, 125, 29);
		contentPane.add(btnCancel);
		
		//---------------------------
		ButtonGroup g = new ButtonGroup();
		g.add(rbMale);
		g.add(rbFemale);
		//---------------------------
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login lg = new Login();
				lg.setVisible(true);
			}
		});
		/////////////////////
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtUsername.getText();
				String address = txtAddress.getText();
				String gender = rbMale.isSelected() ? "Male" : "Female";
				
				ArrayList<String> str = new ArrayList<>(3);
				if(ckTravelling.isSelected()) str.add("Travelling");
				if(ckSport.isSelected()) str.add("Sport");
				if(ckReading.isSelected()) str.add("Reading");
				
				String selectedAgeGroup = cboAgeGroup.getSelectedItem().toString();
		
				if(!flag) {
					Employee one = new Employee(name, address, rbMale.isSelected(),str, selectedAgeGroup);
					parentForm.updateTable(one);
				}else {
				//Edit
					Employee one = new Employee(id, name, address, rbMale.isSelected(),str, selectedAgeGroup);
					parentForm.editRowInTable(one, index);
				}
				
//				StringBuilder sb = new StringBuilder();
//				sb.append(name);
//				sb.append("\n");
//				sb.append(address);
//				sb.append("\n");
//				sb.append(gender);
//				sb.append("\n");
//				sb.append(str);
//				sb.append("\n");
//				sb.append(selectedAgeGroup);
//				sb.append("\n");
//				//Display
//				JOptionPane.showConfirmDialog(null, sb.toString(),
//						"Display employee's information", JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Reset GUI components to default values
				resetGUI();
			}
		});
	}
	//Behaviors
	public void receiveInformation(String username) {
		lblProfile.setText("Hello: " + username);
		
	}
	private void resetGUI() {
		this.txtUsername.setText("");
		this.txtAddress.setText("");
		this.rbMale.setSelected(true);
		this.ckReading.setSelected(false);
		this.ckTravelling.setSelected(false);
		this.ckSport.setSelected(false);
		this.cboAgeGroup.setSelectedIndex(1); //From 18 to 50
	}
	private void fillGUI(Employee one) {
		this.txtUsername.setText(one.getUsername());
		this.txtAddress.setText(one.getAddress());
		
		if(one.isGender()) rbMale.setSelected(true);
		else rbFemale.setSelected(true);
		
		for(String each: one.getHobbies()) {
			if(each.replace(" ","").equals("Reading")) ckReading.setSelected(true);
			else if(each.replace(" ","").equals("Travelling")) ckTravelling.setSelected(true);
			else if(each.replace(" ","").equals("Sport")) ckSport.setSelected(true);
		}

		this.cboAgeGroup.setSelectedItem(one.getAgeGroup());
	}


	public void receiveParentForm(Home frame, boolean flag, Employee one, int index) {
		// TODO Auto-generated method stub
		parentForm = frame;
		this.flag = flag;
		if(flag) { //Edit
			this.id = one.getId();
			this.index = index;
			fillGUI(one); //Fill Employee data to Java swing's components
		}
		
	}
}
