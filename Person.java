public class Person {
	private String firstname;
	private String lastname;
	private String gender;
	// Person is a class which have 3 fields firstname, lastname and gender.
	//these 3 fields are string . firstname is the first name of the person. lastname is the last name of the person. gender is the gender of the person.
	public Person(String firstname, String lastname, String gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
	}
	//
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	//
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	//
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//
	
	public String toString() {
		return " first name is  " + firstname + ", last name is  " + lastname + ", gender is  " + gender ;
	}
	
	

}
