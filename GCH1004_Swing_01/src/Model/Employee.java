package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
	//Instance properties
	private int id;
	private String username;
	private String address;
	private boolean gender; //1-MALE; 0-FEMALE
	private ArrayList<String> hobbies;
	private String ageGroup;
	
	//Class property
	private static int COUNT = 0;
	
	public Employee(String username, String address, boolean gender, String[] hobbies, String ageGroup) {
		this.id = COUNT + 1;
		COUNT++;
		this.username = username;
		this.address = address;
		this.gender = gender;
		this.hobbies = new ArrayList<String>(Arrays.asList(hobbies));
		this.ageGroup = ageGroup;
		
	}
	public Employee(String username, String address, boolean gender, ArrayList<String> hobbies, String ageGroup) {
		this.id = COUNT + 1;
		COUNT++;
		this.username = username;
		this.address = address;
		this.gender = gender;
		this.hobbies = hobbies;
		this.ageGroup = ageGroup;
		
	}

	public Employee(int id, String username, String address, boolean gender, String[] hobbies, String ageGroup) {
		this.id = id;
		this.username = username;
		this.address = address;
		this.gender = gender;
		this.hobbies = new ArrayList<String>(Arrays.asList(hobbies));
		this.ageGroup = ageGroup;
		
	}
	public Employee(int id, String username, String address, boolean gender,  ArrayList<String> hobbies, String ageGroup) {
		this.id = id;
		this.username = username;
		this.address = address;
		this.gender = gender;
		this.hobbies = hobbies;
		this.ageGroup = ageGroup;
		
	}
	
	//----------------------------
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public ArrayList<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public int getId() {
		return id;
	}

}
