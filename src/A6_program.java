// 6--A6_program -- "Convert object to string"--
public class A6_program 
{
	public static void main (String [] args)
	{
		String s1="nitin";
		StringBuilder sb = new StringBuilder(s1);
		sb.reverse();
		String rev = sb.toString();
		System.out.println();
		if(s1.equals(rev))
		{
			System.out.println(s1+"--String is palindrome");
		}
		else
		{
			System.out.println(s1+"-- Is not a palindrome");
		}
		
	
	}

}
