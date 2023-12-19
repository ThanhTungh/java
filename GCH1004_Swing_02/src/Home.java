
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTable tblEmployee;
	private JLabel lblNewLabel_1;
	private JTextField txtSearch;
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDelete;
	
	private DefaultTableModel empModel;
	private static Home frame;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JRadioButton rbMale;
	private JRadioButton rbFemale;
	private JTextArea txtAddress;
	private JTextField txtUsername;
	private JCheckBox ckTravelling;
	private JCheckBox ckSport;
	private JCheckBox ckReading;
	private JComboBox cboAgeGroup;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Home() {
		frame = this;
		//Get data from Manager
		ArrayList<Employee> aList = Manager.getEmployeeData();
		
		//-----------------------------
		setTitle("Welcome to FPT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 817);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//-------------------------------
		String[] header = {"ID", "Empolyee Name", "Address", "Gender", "Hobbies" , "Age Group"};
		empModel = new DefaultTableModel(header, 0);
		// Adding new data to empModel
		for(Employee each: aList) {
			String gender = each.isGender() ? "Male" : "Female";
			Object[] row = {each.getId(), each.getUsername(), each.getAddress(),
					gender, each.getHobbies().toString(), each.getAgeGroup()};
			empModel.addRow(row);
		}
		
		//-------------------------------
		tblEmployee = new JTable(empModel);
		tblEmployee.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tblEmployee.setBounds(21, 164, 597, 270);
		contentPane.add(tblEmployee);
		
		lblNewLabel_1 = new JLabel("Number of Employees: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 43, 210, 25);
		contentPane.add(lblNewLabel_1);
		
		btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAdd.setBounds(652, 83, 105, 34);
		contentPane.add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEdit.setBounds(652, 150, 105, 34);
		contentPane.add(btnEdit);
		
		btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.RED);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDelete.setBounds(652, 350, 105, 34);
		contentPane.add(btnDelete);
		
		txtSearch = new JTextField();
		txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSearch.setBounds(407, 43, 222, 25);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Search:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(337, 43, 66, 25);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane(tblEmployee);
		scrollPane.setBounds(10, 89, 619, 295);
		contentPane.add(scrollPane);
		
		lblNewLabel_6 = new JLabel("Sex: ");
		lblNewLabel_6.setBounds(382, 459, 103, 20);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		rbMale = new JRadioButton("Male");
		rbMale.setBounds(435, 459, 103, 21);
		contentPane.add(rbMale);
		rbMale.setSelected(true);
		rbMale.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		rbFemale = new JRadioButton("Female");
		rbFemale.setBounds(541, 459, 103, 21);
		contentPane.add(rbFemale);
		rbFemale.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		ckTravelling = new JCheckBox("Travelling");
		ckTravelling.setBounds(491, 522, 118, 21);
		contentPane.add(ckTravelling);
		ckTravelling.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		ckSport = new JCheckBox("Sport");
		ckSport.setBounds(491, 577, 118, 21);
		contentPane.add(ckSport);
		ckSport.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		ckReading = new JCheckBox("Reading");
		ckReading.setBounds(491, 629, 83, 21);
		contentPane.add(ckReading);
		ckReading.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_7 = new JLabel("Hobbies: ");
		lblNewLabel_7.setBounds(382, 522, 103, 20);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		cboAgeGroup = new JComboBox();
		cboAgeGroup.setBounds(121, 690, 488, 34);
		contentPane.add(cboAgeGroup);
		cboAgeGroup.setModel(new DefaultComboBoxModel(new String[] {"Under 18", "From 18 to 50", "Above 50"}));
		cboAgeGroup.setSelectedIndex(1);
		cboAgeGroup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_8 = new JLabel("Age Group: ");
		lblNewLabel_8.setBounds(10, 697, 103, 20);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtUsername = new JTextField();
		txtUsername.setBounds(121, 452, 198, 34);
		contentPane.add(txtUsername);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUsername.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Username: ");
		lblNewLabel_4.setBounds(10, 459, 103, 20);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setBounds(10, 522, 103, 20);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtAddress = new JTextArea();
		txtAddress.setBounds(121, 519, 198, 117);
		contentPane.add(txtAddress);
		txtAddress.setRows(5);
		txtAddress.setFont(new Font("Monospaced", Font.PLAIN, 16));
		
		
		//============= EVENT ============
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtUsername.getText();
				String address = txtAddress.getText();
				String gender = rbMale.isSelected() ? "Male" : "Female";
				ArrayList<String> str = new ArrayList<>(3);
				if(ckTravelling.isSelected()) str.add("Travelling");
				if(ckSport.isSelected()) str.add("Sport");
				if(ckReading.isSelected()) str.add("Reading");
				String selectedAgeGroup = cboAgeGroup.getSelectedItem().toString();
				Employee one = new Employee(name, address, rbMale.isSelected(),str, selectedAgeGroup);
				
				updateTable(one);
			}
		});
		tblEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tblEmployee.getSelectedRow();
				int id =Integer.parseInt(empModel.getValueAt(selectedRow, 0).toString());
				String name = empModel.getValueAt(selectedRow, 1).toString();
				String address = empModel.getValueAt(selectedRow, 2).toString();
				String gender = empModel.getValueAt(selectedRow, 3).toString();
				String hobbies = empModel.getValueAt(selectedRow, 4).toString();
				String ageGroup = empModel.getValueAt(selectedRow, 5).toString();
				
				String sub = hobbies.substring(1, hobbies.length()-1);
				String word[] = sub.split(",");
				Employee one = new Employee(id, name, address, gender=="Male", word, ageGroup);
				
				fillGUI(one);
			}
		});
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Get employee selected from JTable
				int selectedRow = tblEmployee.getSelectedRow();
				int id =Integer.parseInt(empModel.getValueAt(selectedRow, 0).toString());
				String name = txtUsername.getText();
				String address = txtAddress.getText();
				String gender = rbMale.isSelected() ? "Male" : "Female";
				ArrayList<String> str = new ArrayList<>(3);
				if(ckTravelling.isSelected()) str.add("Travelling");
				if(ckSport.isSelected()) str.add("Sport");
				if(ckReading.isSelected()) str.add("Reading");
				String selectedAgeGroup = cboAgeGroup.getSelectedItem().toString();
				
				Employee one = new Employee(id, name, address, gender=="Male", str, selectedAgeGroup);
				
				editRowInTable(one, selectedRow);
				
			}
		});
		//-------------------------------
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure to delete this row?"
						, "Confirmation",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(choice == JOptionPane.YES_OPTION) {
					int selectedRow = tblEmployee.getSelectedRow();
					empModel.removeRow(selectedRow);
				}
			}
		});

	}

	// Behaviors

	public void updateTable(Employee one) {
		Object[] row = {one.getId(), one.getUsername(), one.getAddress(),
				one.isGender(), one.getHobbies().toString(), one.getAgeGroup()};
		empModel.addRow(row);
		
	}

	public void editRowInTable(Employee one, int index) {
		empModel.setValueAt(one.getId(), index, 0);
		empModel.setValueAt(one.getUsername(), index, 1);
		empModel.setValueAt(one.getAddress(), index, 2);
		empModel.setValueAt(one.isGender() ? "Male":"Female", index, 3);
		empModel.setValueAt(one.getHobbies().toString(), index, 4);
		empModel.setValueAt(one.getAgeGroup(), index, 5);
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

}
