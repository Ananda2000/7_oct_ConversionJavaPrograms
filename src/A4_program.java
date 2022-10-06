import java.util.ArrayList;
import java.util.Iterator;

public class A4_program {

	public static void main(String [] args)
	{
		ArrayList<Integer> aa = new ArrayList<Integer>();
		aa.add(23);
		aa.add(44);
		aa.add(48);
		
		int len = aa.size();
		System.out.println("The arraylist size is --"+len);
		
		// THIS IS USING ITERATOR 
		Iterator<Integer> itr = aa.iterator();
		
			while (itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
		// THIS IS USING FOR LOOP..
		/*for(int i=0;i<len;i++)
		{
			System.out.println(aa.get(i));
		}*/
	}
}
