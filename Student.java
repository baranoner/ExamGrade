public class Student extends Person {
	private int studentID;
	private double gpa;
	private ExamGrade examgrade;
	private String department;
	// Student is a class extends to the Person class. It has 4 fields, studentID, GPA, examgrade, department.
	// StudentID is the ID of the student and it is integer. GPA is the GPA of the student and it is integer. examgrade is the midterm and final grade of the student and it is ExamGrade.
	// department is the department of the student and it is string.
	public Student(String firstname, String lastname, String gender, double gpa, ExamGrade examgrade,
			String department) {
		super(firstname, lastname, gender);
		this.gpa = gpa;
		this.examgrade = examgrade;
		this.department = department;
		this.studentID = (int) ((Math.random()*((100-0)+1))+0);
	}
	//
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	//
	public double getGpa() {
		return gpa;
	}
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	//
	public ExamGrade getExamgrade() {
		return examgrade;
	}
	public void setExamgrade(ExamGrade examgrade) {
		this.examgrade = examgrade;
	}
	//
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	//
	public String toString() {
		return  "first name is  "  + getFirstname() + "last name is  "  + getLastname() + "gender is  " +   getGender()   +   "studentID is  "   +   studentID + ", gpa is  "   + gpa   +   ", examgrade is  "   +   examgrade +   ", department is  "
				 + department;
	}
	

}
