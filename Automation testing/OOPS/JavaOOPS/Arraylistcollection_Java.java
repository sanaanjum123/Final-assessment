package JavaOOPS;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class ArrayListCollection_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values=new ArrayList();
		values.add("sana");
		values.add(5);
		values.add(43.45);
		Iterator i= values.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
	
		}
	}

}
