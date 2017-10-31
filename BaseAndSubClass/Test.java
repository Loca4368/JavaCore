package BaseAndSubClass;

public class Test {
	
	public static void main(String[] args)
	{
		Base a = new Sub();
		
		System.out.println(((Sub)a).getField());
	}

}
