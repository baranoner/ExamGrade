public class ExamGrade {
	private int midtermgrade;
	private int finalgrade;
	// ExamGrade is a class which has 2 fields. midtermgrade and finalgrade
	// these 2 fields are integer. midtermgrade is the grade of the midterm. finalgrade is the grade of the final.
	public ExamGrade(int midtermgrade, int finalgrade) {
		
		this.midtermgrade = midtermgrade;
		this.finalgrade = finalgrade;
	}
	public int getMidtermgrade() {
		return midtermgrade;
	}
	public void setMidtermgrade(int midtermgrade) {
		this.midtermgrade = midtermgrade;
	}
	//
	public int getFinalgrade() {
		return finalgrade;
	}
	public void setFinalgrade(int finalgrade) {
		this.finalgrade = finalgrade;
	}
	//
	
	public String toString() {
		return "midterm grade is  " + midtermgrade + ", final grade is  " + finalgrade;
	}
	

}
