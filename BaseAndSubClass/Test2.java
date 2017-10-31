package BaseAndSubClass;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Animal a = new Dog();	
//		a = new Animal();
		
		Dog d = new Dog();
		d.print();
		
		Animal a = (Animal) d;
		a.print();
		
		Animal a2 = d;
		a2.print();
		
		a = new Animal();
		a.print();

	}

}
