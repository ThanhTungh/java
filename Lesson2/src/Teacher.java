public class Teacher extends Person{

	public Teacher(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	private int numCourses = 0;
	private String[] courses = new String[5];
	public boolean addCourse(String course) {
		for(int i=0; i<numCourses; i++) {
			
		}
	}
	public boolean removeCourse(String course) {
		int idx;
		if(numCourses >0 && (idx = isExist(course)) != -1) {
			//Removing
			for(int j=idx;j<numCourses-1; j++) {
				courses[j] = courses[j+1];
				
			}
			numCourses--;
			return true;
			
		}
		return false;
	}
	

}
