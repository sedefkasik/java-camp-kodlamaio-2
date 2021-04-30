package campDay3;

public class Instructor extends User {
	
	public Instructor(){ 
		
	}
	
	private String trainingName;
	
	
	public Instructor(int id, String fullName, String email, String password, String controlPassword,String trainingName) {
    	super();
 		this.id = id;
 		this.fullName = fullName;
 		this.email = email;
 		this.password = password;
 		this.controlPassword = controlPassword;
 		this.trainingName = trainingName;
     }

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

}
