/*W.A.J.P to create a class Student with attributes roll no, name, age and course. 
Initialize values through parameterized constructor. If age of student is not in 
between 15 and 21 then generate user defined exception 
"AgeNotWithinRangeException". If name contains numbers or special symbols 
raise exception "NameNotValidException". Define the two exception classes.
*/
package corejb;

class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
	}
}

class NameException extends Exception {
	public NameException(String message) {
		super(message);
	}
}

class Student {
	private int rollNo;
	private String Name;
	private int age;
	private String course;

	public Student(int rollNo, String Name, int age, String course) throws AgeException, NameException {
		if (age < 15 || age > 21) {
			throw new AgeException("Age Should be Between 15 and 21.");
		} else {
			this.age = age;
		}
		if (Name.matches(".*\\d.") || !Name.matches("[a-zA-Z]+")) {
			throw new NameException("Name Should not contain number or Special character.");
		} else {
			this.Name = Name;
		}
		this.rollNo = rollNo;
		this.course = course;
	}

	public void display() {
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + Name);
		System.out.println("Age: " + age);
		System.out.println("Course: " + course);
	}
}

public class MAgeException {

	public static void main(String[] args) {
		try {
			Student validStudent = new Student(1, "John", 20, "Computer Science");
			validStudent.display();

			Student invalidAge = new Student(2, "Rock", 14, "maths");
			invalidAge.display();

			Student invalidName = new Student(3, "Kane123", 20, "Physics");
			invalidName.display();

		} catch (AgeException | NameException e) {
			System.out.println("Error" + e.getMessage());
		}
	}
}
