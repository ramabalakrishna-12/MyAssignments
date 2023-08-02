package week3.assignment1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Id="+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Id="+id +"  Name="+name);
	}
	public void getStudentInfo(String email, double phno) {
		System.out.println("Email="+email + "  Phoneno="+phno);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students();
		s.getStudentInfo(0032);
		s.getStudentInfo(0032, "Rama");
		s.getStudentInfo("ramaaican@gmail.com", 320031319);

	}

}
/* Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
*/