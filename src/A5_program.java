
public class A5_program
{
	int rollno;
	String name;
	String city;
	
	 A5_program(int rollno, String name, String city)
	{
		 this.rollno = rollno;
		 this.name = name;
		 this.city = city;
		
	}
	 public String toString()
	 {
		 return rollno+" "+name+" "+city;
	 }
	 
	 public static void main (String [] args)
	 {
		 A5_program aa = new A5_program(101,"Raj","lucknow");
		 A5_program a1 = new A5_program(102,"Vijay","ghaziabad");
		 
		 System.out.println("this is anand");
		 System.out.println(aa.rollno);
		
		 System.out.println(aa.name);
		 System.out.println(aa.city);
		 
	 }
	
	

}
