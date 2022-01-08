package week3.day1homework;

public class Students {
	

	
	public void getStudentInfo(int id) {
		System.out.println("Student id " + "= "+ id);

	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id "+ "= " + id +", "+"Student name "+" "+"is " + name);

	}
	
	public void getStudentInfo(String email, long number) {
		System.out.println("Student email "+ "= " + email +", "+"Student number "+"is "+"= " + number);

	}

	public static void main(String[] args) {
		
		Students std = new Students();
		std.getStudentInfo(433);
		std.getStudentInfo(433, "sumanth");
		std.getStudentInfo("sumanth12@gmail.com", 1234567890);

	}

}
