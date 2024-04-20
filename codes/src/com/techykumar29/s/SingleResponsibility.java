package com.techykumar29.s;

public class SingleResponsibility {

}
class Student{
	
	private String name;
	private String age;
	private String school;
	
	public Student(String name, String age, String school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}
	
}

class CollegeAdmission{
	
	private Student student;

	public CollegeAdmission(Student student) {
		super();
		this.student = student;
	}
	
	public void admission() {
		System.out.println("Admission process completed.");
	}
	
}


class CollegeAssignStream{
	
	private Student student;

	public CollegeAssignStream(Student student) {
		super();
		this.student = student;
	}
	
	public void assignStream() {
		System.out.println("Stream assigned."+student);
	}
}

class CollegeNotifyStudent{
	
	private Student student;

	public CollegeNotifyStudent(Student student) {
		super();
		this.student = student;
	}
	
	public void sendNotification() {
		System.out.println("Notification Sent!" + student);
	}
}