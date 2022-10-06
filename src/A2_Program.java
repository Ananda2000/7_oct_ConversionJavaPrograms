// Convert a String to Character Array in Java
public class A2_Program 
{
	public static void main(String [] args)
	{
		String aa = "This is java";
		char chararray[];
		chararray = aa.toCharArray();
		int len = chararray.length;
		
		System.out.println("The length --"+len);
		System.out.println(chararray);
		
		for (char c : chararray) {
			System.out.println(c);
			
		}
	
	}

}
