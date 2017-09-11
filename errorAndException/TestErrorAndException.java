/*
 * Description: Simple Example to demo Error and Exception
 * @Autor:Ming
 */

package errorAndException;

import java.util.ArrayList;
import java.util.List;

public class TestErrorAndException {
	
	public static void main(String[] args)
    {
		//Handle Exceptions 
		System.out.println("============Testing on Handle Exceptions============");
		ExcpetionDemoClass dm = new ExcpetionDemoClass();
		
		//use try and catch to Handle my custom exception
		try
		{
			dm.throwsMyException();
			dm.throwsSomeCommonExcpetion(8);
		}
		
		catch(MyCustomException e)
		{
			System.out.println(e.getMessage());
		}
		
		//Handle Index out of bounds exception
		try
		{
			dm.throwsSomeCommonExcpetion(8);
		}
		
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("============End of Test============");
		
		
		
		//Demo on Error
		System.out.println("============Testing on Errors============");

		//StackOverflowError occurred in Stack
//		String sample = "hello"; 
//		reverse(sample);
		
		//OutofMemoryError occurred in Heap
//		List<Integer> list = new ArrayList<Integer>();
//		int i = 0;
//		while(true)
//		{
//			list.add(i++);
//		}
		
		
		//OutofMemoryError occurred in Runtime Constant Pool
//		List<String> list2 = new ArrayList<String>();
//		int i = 0;
//		while(true)
//		{
//			list2.add(String.valueOf(i++).intern());
//		}
				
		
		
    }
	
	
	//For demonstrating "StackOverflowError"
	public  static String reverse(String originStr)
    {
		if(originStr == null || originStr.length() <1)
			return originStr;
		
		//Meant to be reverse(originStr.substring(1)) + originStr.charAt(0);
		return reverse(originStr.substring(0)) + originStr.charAt(0);
		
    }

}
