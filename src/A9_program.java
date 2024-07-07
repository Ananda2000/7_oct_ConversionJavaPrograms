import java.util.ArrayList;

import supportingClasses.Student;

//" object creation and iterate through object."
public class A9_program 
{
	public static void main (String[] args)
	{
		Student s1= new Student();
		
		s1.setAge(25);
		s1.setName("Ananda");
		s1.setRollno("989AK");
		
		Student s2 = new Student();
		s2.setAge(30);
		s2.setName("soma N.T");
		s2.setRollno("8965YUJ");
		
		ArrayList<Student> aa = new ArrayList<Student>();
		
		/*System.out.println(s1.getAge());
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());
		
		System.out.println(s2.getAge());
		System.out.println(s2.getName());
		System.out.println(s2.getRollno());
*/
		aa.add(s1);
		aa.add(s2);
	// ITERATING USING FOR EACH LOOP	
	/*	int i=0;
		for (Student student : aa) {
			
			System.out.print(aa.get(i).getAge()+"--");
			System.out.print(aa.get(i).getName()+"--");
			System.out.println(aa.get(i).getRollno());
			i++;
		}
	*/
		
// THE BELOW ONE IS USED TO 
		for(int i=0;i<aa.size();i++)
		{
		System.out.println(aa.get(i).getAge());
		if(aa.get(i).getAge()==25)
		{
			System.out.println("The value present");
			System.out.println("Age --"+aa.get(i).getAge());
			System.out.println("Name --"+aa.get(i).getName());
			System.out.println("Roll no --"+aa.get(i).getRollno());
		}
		}
		
		
	}

}
