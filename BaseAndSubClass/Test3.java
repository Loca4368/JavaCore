package BaseAndSubClass;

public class Test3 {

	public static void main(String[] args) {
		
		Father.print();
		Son.print();
		
		Father father = new Father();
		father.print();
		
		Father son = new Son();
		son.print();
	}
}
