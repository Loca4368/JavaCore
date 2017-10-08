package dataConversion;

public class StringAndInteger {

	public static void main(String[] args) {
		
		System.out.println("============Test Starting=========");
		
		//Convert int to String
        //Method 1:  connect (+) with ""
        int i = 0;
        String st = i + "";
        
        System.out.println("Convert 0 into String:"+ st);
      
        //Method two: call String valueOf() method
        int j = 1;
        String st2 = String.valueOf(j);
        
        System.out.println("Convert 1 into String:"+ st2);
	
       //Convert String into int. 
       //1: use parseXXX in Wrapper class; 2. use valueOf()
  
        String content = "123456";
        int result1 = Integer.parseInt(content);//automatic unboxing
        
        int result2 = Integer.valueOf(content);//automatic unboxing
        
        System.out.println("Use int wrapper class :"+result1);
        System.out.println("Use valueOf :"+result2);
		
        
        //Convert String into Integer
		String n1 = "1";
		Integer N1 = Integer.parseInt(n1);
		
		String n2 = "2";
		Integer N2 = Integer.parseInt(n2);
		
		String n3 = n1 + n2;
		Integer N3 = N1 + N2;
		
		System.out.println(" n3 Value is " + n3);//The result is String
		System.out.println(" N3 Value is " + N3);//The result is int
		
		System.out.println("============End of Test=========");

	}

}
