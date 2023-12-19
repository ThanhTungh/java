package View;
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

import Controller.Manager;
import Model.Employee;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {
	private JPanel contentPane;
	private JLabel lblProfile;
	private JButton btnLogout;
	private JLabel lblNewLabel;
	private JTable tblEmployee;
	private JLabel lblNewLabel_1;
	private JTextField txtSearch;
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDelete;
	
	private DefaultTableModel empModel;
	private static Home frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame = new Home();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Home() {
		frame = this;
		//Get data from Manager
		ArrayList<Employee> aList = Manager.getEmployeeData();
		
		//-----------------------------
		setTitle("Welcome to FPT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 10, 775, 51);
		contentPane.add(panel);
		panel.setLayout(null);

		lblProfile = new JLabel("Hello ...");
		lblProfile.setBounds(529, 14, 56, 20);
		panel.add(lblProfile);
		lblProfile.setForeground(Color.RED);
		lblProfile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProfile.setBackground(Color.WHITE);

		btnLogout = new JButton("Logout");
		btnLogout.setBounds(639, 10, 97, 29);
		panel.add(btnLogout);
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
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
		lblNewLabel_1.setBounds(21, 103, 210, 25);
		contentPane.add(lblNewLabel_1);
		
		btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAdd.setBounds(652, 164, 105, 34);
		contentPane.add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEdit.setBounds(652, 233, 105, 34);
		contentPane.add(btnEdit);
		
		btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.RED);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDelete.setBounds(652, 397, 105, 34);
		contentPane.add(btnDelete);
		
		txtSearch = new JTextField();
		txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSearch.setBounds(408, 103, 210, 25);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Search:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(332, 103, 66, 25);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane(tblEmployee);
		scrollPane.setBounds(10, 151, 619, 295);
		contentPane.add(scrollPane);
		
		
		//============= EVENT ============
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm_Add fadd = new frm_Add();
				fadd.receiveParentForm(frame, false, null, -1); //Add new employee
				fadd.setVisible(true);
			}
		});
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Get employee selected from JTable
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
				
				frm_Add fadd = new frm_Add();
				fadd.receiveParentForm(frame, true, one, selectedRow); //Edit the selected employee
				fadd.setVisible(true);
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
	public void receiveInformation(String username) {
		lblProfile.setText("Hello: " + username);
	}

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
}
