package wrapperClassForPremitiveType;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		*Take int and its wrapper class,Integer, as an example to demo  
		*auto-boxing and auto-unboxing 
		*/
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		//It should return false
		System.out.println("Is i1 equals to i2? "+(i1==i2));
		
		
		Integer i3 = 3;//Auto-boxing: convert int 3 into Integer object; 
		
		int i4 = 3;
		
		//It should return true
		System.out.println("Is i3 equals to i4? "+(i3==i4));//Auto-unboxing: convert Integer object into int
		
		
		
		/*In Integer class, IntegerCache,the static nested class, is used to identity semantics of autoboxing 
		* for values between -128 and 127 (inclusive). 
		* If there is an existing Integer object with its value between -128 and 127,
		* instead of creating new Integer object, the reference would be referred to the existing Integer object;
		* and for int value out of the range or no Integer object with the specific value, new Integer object will be created. 
		*/
		
		Integer f1 =150, f2 =150, f3 =100, f4 =100;
		
		//It should return false
		System.out.println("Is f1 equals to f2? "+(f1==f2));
		
		//It should return true
		System.out.println("Is f3 equals to f4? "+(f3==f4));
		
	}

}
