package week3.day1homework;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name");

	}
	
	public void studentDept() {
		System.out.println("Student dept");

	}
	
	public void studentId() {
		System.out.println("Student id");

	}
	public static void main(String[] args) {
		
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentDept();
		std.studentId();
		std.studentName();
	}

}
