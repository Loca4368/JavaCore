package mapAndSet;

public class Teacher {
	
	private String name;
	private int age;
	
	public Teacher(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	

	public int getAge() {
		return age;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teacher [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

}
