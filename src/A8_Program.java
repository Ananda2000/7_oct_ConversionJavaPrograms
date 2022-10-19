import java.awt.datatransfer.FlavorEvent;

// converting string to integers , float , double..
public class A8_Program {

	public static void main (String[] args)
	{
		System.out.println("Below are the string values");
		String intvalue = "10";
		String intvalue1 ="20";
		System.out.println(intvalue+intvalue1);
		int a = Integer.parseInt(intvalue);
		int b = Integer.parseInt(intvalue1);
		System.out.println("Adding 2 number after converting string to integer --");
		System.out.println(a+b);
		System.out.println("=================This is floating values conversion ----------------------");
		String floatvalue ="10.20";
		String floatvalue1="2.04";
		System.out.println("Before conversion floating values adding ----------");
		System.out.println(floatvalue+floatvalue1);
		float c = Float.parseFloat(floatvalue);
		float d = Float.parseFloat(floatvalue1);
		System.out.println("After conversion adding the floading values -------------");
		System.out.println(c+d +" ---this is after conversion");
		
		
	}
}
