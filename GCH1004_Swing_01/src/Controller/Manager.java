package Controller;

import java.util.ArrayList;

import Model.AgeGroup;
import Model.Employee;

public class Manager {
	private static ArrayList<Employee> aList;
	
	//Design operations based on the use-case diagram
	public static ArrayList<Employee> getEmployeeData(){
		/*
		 * if(file data is existed){
		 * 		load data from file
		 * }else{
		 * 		initialize a number of employees
		 * 		save them to file
		 * }
		 */
		aList = new ArrayList<>();
		aList.add(new Employee("Do Hong Quan", "Hanoi", true, new String[] {"Reading", "Sport"}, AgeGroup.FROM_18_TO_50));
		aList.add(new Employee("Nguyen Hong Phuong", "Quang Ninh", false, new String[] {"Reading", "Travelling", "Sport"}, AgeGroup.UNDER_18));
		aList.add(new Employee("Truong An", "Hanoi", true, new String[] {"Sport"}, AgeGroup.FROM_18_TO_50));
		aList.add(new Employee("Nguyen Tuan Anh", "Hue", true, new String[] {"Reading", "Sport"}, AgeGroup.ABOVE_50));
		aList.add(new Employee("Tran Kim Lien", "Hai Phong", false, new String[] {"Reading"}, AgeGroup.FROM_18_TO_50));
		aList.add(new Employee("Do Hong Quan", "Da Nang", true, new String[] {}, AgeGroup.UNDER_18));
		aList.add(new Employee("Nguyen Lan Anh", "Hanoi", false, new String[] {"Travelling"}, AgeGroup.FROM_18_TO_50));
		
		return aList;
	}
	
}
