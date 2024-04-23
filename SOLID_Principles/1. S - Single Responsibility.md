### Definition
A class should have only one reason to change.

### Problem Statement
Let's say we have a college where students need to be enrolled. College assign stream/branch looking at the ranking of the student in the entrance exam. Also, sends notification about progress of the admission process. Design a software solution to provide the asked features with low maintainability cost and high readability.

### Naive Approach

POJO class for Student

```java
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
```

College class which performs all the actions asked in the problem statement.

```java
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
```

**What's the problem in this code ?**
There are three possible reasons to make change in College class.
1. Amendment in existing or including new process of admission.
2. Strategical change in selection of stream.
3. Logical change while sendEmail like SMTP server details or body of the message.
Once a class is marked tested and released to production, then any single change involve the testing effort for testing all the functionalities of this class. 

### Better Approach
Single Responsibility of the SOLID principle  handles this scenario. Segregate the responsibility in a separate classes.

CollegeAdmission - Responsible for enrolling students.
```java
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
```

CollegeAssignStream - Responsible for evaluating students based on entrance exam and assign them stream on the evaluation result.

```java
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
```

CollegeNotifyStudent - Responsible for notifying user regarding the status of the enrolment process.

```java
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
```

### Summary
Single Responsibility Design Principle segregates the responsibility to different classes and avoid overhead of testing the unchanged functionalities. Aforementioned possibility of change in strategy or process of enrolment will not impact all the classes. A specific class need to be modified for a specific reason.

