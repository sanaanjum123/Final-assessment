package JavaOOPS;
import java.util.LinkedList;

public class LinkedListCollection_Java {
	public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("sana");
        ll.add("rushali");
        System.out.println(ll);
        System.out.println();
        ll.addLast("pavni");
        ll.addFirst("sania");
        ll.add(2, "sam");
        System.out.println(ll);
        System.out.println();
       
        ll.remove("rushali");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
    }
}

