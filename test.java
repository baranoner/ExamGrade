public class Test {
	
	public int SearchIndex(Student student[], int id) {
	
		for(int i=0; i<student.length; i++) {
			if(student[i].getStudentID() == id) {
				  return i;
			}
		}
				return -1;
	}
			
		
		
	
	// search method takes student array and student id and returns the index of the student with given student id
	// if there is no such student it returns -1
	
	public void UpdateGrade(Student student[], int id, ExamGrade examgrade) {
		if(student.length == 0) {
			System.out.println("no such student");
		}
		for(int i=0; i<student.length; i++) {
			if(student[i].getStudentID() == id) {
				student[i].setExamgrade(examgrade);
			}
			else {
				System.out.println("ID is not matched to this student");
			}
		}
	}
	// UpdateGrade method takes student array, student id and examgrade. It updates the students examgrade to the given examgrade with the given id. 
	// if there is no such student it prints "No such student".
	public void Show(Student student[]) {
		for(int i=0; i<student.length; i++) {
			System.out.printf("%-40s\n", student[i]);
					
		}
	}
	// Show method takes student array and prints the all information with using the printf method.
	
	/////// PART 2 OF THE CLASS
	public Student RandomGender(Student stu) {
	int	r = (int) ((Math.random()*((2-1)+1))+1);
	if(r == 1) {
		  stu.setGender("Male");
	}
	else if(r == 2) {
		 stu.setGender("Female");
	}
	return stu;
	}
	//RandomGender method creates a random integer 1 or 2 and sets a gender to the given Student according to the number.
	//
	public Student RandomGpa(Student stu) {
		double	r = ((Math.random()*((4.0-0)+1))+0);
		stu.setGPA(r);
		return stu;
		
	}
	//RandomGpa method creates a double between 4 and 0 and sets a gpa from the double number to the given Student 
	//
	public Student RandomExamGrade(Student stu) {
		int m = (int) ((Math.random()*((100-0)+1))+0);
		int f = (int) ((Math.random()*((100-0)+1))+0);
		ExamGrade eg= new ExamGrade(m, f);
		stu.setExamgrade(eg);
		return stu;
	}
	// RandomExamGrade method creates  two random integer between 0 and 100 and sets e examgrade from these integers to the given student
	
	public Student []Generate(int num) {
		Test test = new Test();
		Student a[] = new Student[num];
		for(int i= 0; i<a.length; i++) {
			a[i]= new Student(null, null, null, 0,null , null);
			test.RandomGender(a[i]);
			test.RandomGpa(a[i]);
			test.RandomExamGrade(a[i]);
		}
		return a;
		
		
	}
	//Generate method creates an array with default values and generate an array with random gender gpa and examgrade values. The other values are stays default. 
	public double MeanGpa(Student stud[]) {
		double m= 0;
		for(int i= 0;i<stud.length; i++ ) {
			m= m+ stud[i].getGpa();
	 
		}
		m= m / stud.length;
		return m;
	}
	// MeanGpa method creates the sum of the gpa's in the given student array and divides it to the arrays lenght.
	public Student MaxMidterm(Student stu[]) {
		Student maxmidtermstudent = stu[0];
		for(int i = 1; i<stu.length; i++) {
			if(stu[i].getExamgrade().getMidtermgrade()>stu[i-1].getExamgrade().getMidtermgrade() )
				maxmidtermstudent = stu[i];
		}
		return maxmidtermstudent;
		
	}
	//MaxMidterm method comparing the given students midterm grades and returns the student with the highest midterm grade.
	//
	public Student LowestMidterm(Student stu[]) {
		Student lowestmidtermstudent = stu[0];
		for(int i = 1; i<stu.length; i++) {
			if(stu[i].getExamgrade().getMidtermgrade()<stu[i-1].getExamgrade().getMidtermgrade() )
				lowestmidtermstudent = stu[i];
		}
		return lowestmidtermstudent;
		
	}
	//LowestMidterm method comparing the given students midterm grades and returns the student with the lowest midterm grade.
	//
	public Student MaxFinal(Student stu[]) {
		Student maxfinalstudent = stu[0];
		for(int i = 1; i<stu.length; i++) {
			if(stu[i].getExamgrade().getFinalgrade()>stu[i-1].getExamgrade().getFinalgrade() )
				maxfinalstudent = stu[i];
		}
		return maxfinalstudent;
	}
	//MaxFinal method comparing the given students final grades and returns the student with the highest final grade.
	//
	public Student LowestFinal(Student stu[]) {
		Student lowestfinalstudent = stu[0];
		for(int i = 1; i<stu.length; i++) {
			if(stu[i].getExamgrade().getFinalgrade()<stu[i-1].getExamgrade().getFinalgrade() )
				lowestfinalstudent = stu[i];
		}
		return lowestfinalstudent;
	}
	//LowestFinal method comparing the given students final grades and returns the student with the lowest final grade.
	//
	public static void main(String[] args) {
		ExamGrade e1= new ExamGrade(60, 50);
		Student s1 = new Student("Ali", "Alkoçlar", "Male", 2.30, e1 , "CMPE");
		ExamGrade e2 = new ExamGrade(40, 70);
		Student s2 = new Student("Baran", "Öner", "Male", 2.5, e2, "CMPE");
		ExamGrade e3= new ExamGrade(60, 80);
		Student s3= new Student("Ekin", "Ören", "Female", 3.0, e3, "IEEE");
		ExamGrade e4 = new ExamGrade(35, 75);
		Student s4= new Student("Yiğit", "Vatansever", "Male", 2.7, e4, "IEEE");
		ExamGrade e5 = new ExamGrade(25, 40);
		Student s5= new Student("Simay", "Adıgüzel", "Female", 1.5, e5, "CMPE");
		
		Student stud[] = {s1,s2,s3,s4,s5};
		 Test test = new Test();
		 //testing part
		 System.out.println(test.SearchIndex(stud, 45));
		System.out.println(test.SearchIndex(stud, stud[1].getStudentID()) ); 
		test.UpdateGrade(stud, 55, e1);
		test.UpdateGrade(stud, stud[1].getStudentID(), e3);
		test.Show(stud);
		//PART 2 OF THE MAİN METHOD
		test.Show(test.Generate(4));
		
		System.out.println(test.MeanGpa(test.Generate(5)));
		
		System.out.println(test.MaxMidterm(test.Generate(3))+" has the highest midterm  ");
		System.out.println(test.MaxFinal(test.Generate(4))+ " has the highest final " );
		System.out.println(test.LowestMidterm(test.Generate(3)) + "has the lowest midterm ");
		System.out.println(test.LowestFinal(test.Generate(5)) + " has the lowest final ");
		
		
	}
 
	

}
