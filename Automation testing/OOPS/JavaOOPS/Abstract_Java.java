package JavaOOPS;

abstract class item1{
    abstract void m1();
    void m2() {
        System.out.println("Given items are: ");
    }
}
public class Abstract_Java extends item1 {
    

    public static void main(String[] args) {
    	Abstract_Java obj = new Abstract_Java();
        
        obj.m2();
        obj.m1();

    }
    void m1() {
        System.out.println("book,pen,pencil");
    }

}

