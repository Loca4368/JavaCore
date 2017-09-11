package errorAndException;

public class ExcpetionDemoClass {
	

	//Throws custom excpetion
	public void throwsMyException() throws MyCustomException 
	{
		throw new MyCustomException("Throw an MyCustomException");
	}
	
	//Throws some common exceptions
	public int throwsSomeCommonExcpetion(int index) throws IndexOutOfBoundsException 
	{
		
		//Will throw an IdexOutOfBounds Exception
		int[] array = {1,2,3,4,5,6};
		
		if(index>array.length)
		{
			throw new IndexOutOfBoundsException("Index out of Bounds. Valid Index Range 1-6");
		}
		else
		{
			return (array[index-1]);
		}
	}
	
}
