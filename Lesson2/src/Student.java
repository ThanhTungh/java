
public class Student extends Person{

	final int MAX = 30;
		
	private int numCourses = 0;
	private String[] courses = new String[30];
	private int[] grades = new int[30];
	
	//Constuctors
	public Student(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
		numCourses = 0;
		courses = new String[MAX];
		grades = new int[MAX];
	}
	public void addCourseGrade(String course,int grade) {
		if(numCourses < MAX) {
		courses[numCourses] = course;
		grades[numCourses]= grade;
		numCourses++;
		}else {
			System.err.println("Student should take no more than " + MAX +" courses");
		}
	}
	public void printGrades() {
		System.out.println("Current number of courses taken is: " + numCourses);

		for (int i=0; i< numCourses ; i++) {
			System.out.printf("\t Course: %-30s | Grade: %-5d \n", courses[i], grades[i]);
		}
		
	}
	public double getAverageGrade() {
		int sum = 0;
		for(int i=0; i<numCourses; i++) {
			sum += grades[i];
		}
	}
	
}
