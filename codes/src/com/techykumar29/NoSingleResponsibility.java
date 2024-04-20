package com.techykumar29;

import com.techykumar29.Student;

public class NoSingleResponsibility {

}
class Student {

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

class College {

	private Student student;

	public College(Student student) {
		super();
		this.student = student;
	}

	public void admission() {
		System.out.println("Admission process completed.");
	}

	public void assignStream() {
		System.out.println("Stream assigned.");
	}

	public void sendEmail() {
		System.out.println("Email sent!" + student.toString());
	}
}