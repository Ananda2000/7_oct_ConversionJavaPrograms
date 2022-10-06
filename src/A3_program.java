//Java Program to Convert String to String Array---
public class A3_program 
{
	public static void main(String [] args)
	{
		String s1 = "this is java";
		String []s2 = s1.split(" ");
		
		for (String string123 : s2) {
			System.out.println(string123);
		}
	}

}
