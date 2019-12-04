
public class Student 
{
	private String firstName;
	private String lastName;
	private int age;
	
	//constructor
	
	public Student(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	//getters y setters
	// primero son gets y luego sets
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// Override el método toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	 
	
}
