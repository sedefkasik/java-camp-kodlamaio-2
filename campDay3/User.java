package campDay3;

public class User {
     
	
	public User() {
		
	}
	
     public User(int id, String fullName, String email, String password, String controlPassword) {
    	super();
 		this.id = id;
 		this.fullName = fullName;
 		this.email = email;
 		this.password = password;
 		this.controlPassword = controlPassword;
     }
     
      int id;
      String fullName;
      String email;
      String password;
      String controlPassword;
 	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getControlPassword() {
		return controlPassword;
	}

	public void setControlPassword(String controlPassword) {
		this.controlPassword = controlPassword;
	}
     
}


