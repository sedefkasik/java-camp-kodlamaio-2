package campDay3;

public class Student extends User {
	
	public Student() {
		
	}
	
    private String courseName;
    
    
    public Student(int id, String fullName, String email, String password, String controlPassword, String courseName) {
    	super();
 		this.id = id;
 		this.fullName = fullName;
 		this.email = email;
 		this.password = password;
 		this.controlPassword = controlPassword;
 		this.courseName = courseName;
     }

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
    
}
