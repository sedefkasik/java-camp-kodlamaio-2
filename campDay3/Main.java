package campDay3;


public class Main {

	public static void main(String[] args) {

        User user1 = new User(0,"Admin","admin@gmail.com","sifre","sifre");
		Student student1 = new Student(1,"Sedef Kaşık","sdfkasik@gmail.com","sifre","sifre","C#");
		Instructor instructor1 = new Instructor(1,"Engin Demiroğ","edemirog@gmail.com","sifre","sifre","JAVA");
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();

		userManager.add(user1);
		studentManager.add(student1);
		instructorManager.add(instructor1);
		
		userManager.sendMail(user1);
		studentManager.sendMail(student1);
		instructorManager.sendMail(instructor1);
		
		
		studentManager.addExam(student1);
		instructorManager.addCourse(instructor1);
		
		userManager.add(new Student(2,"Selen","bla","sifre","sifre","F#"));
		
		
	    
		
		
		
		
		
	}

}
