package mapAndSet;

public class Student implements Comparable <Student>{
	
	private String name;
	private int age;
	
	public Student(String aName, int age)
	{
		this.name = aName;
		this.age = age;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}


	public int compareTo(Student s) {
		
		return this.age - s.age;
	}

}
