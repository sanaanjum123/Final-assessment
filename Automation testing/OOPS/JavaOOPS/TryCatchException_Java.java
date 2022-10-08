package JavaOOPS;
public class TryCatchException_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 int a=3;
    	 int b=0;
    	System.out.println(a/b);
     }
     catch(ArithmeticException e) {
    	 System.out.println("multiply by zero exception");
     }
	}

}
