package JavaOOPS;
class Animals{
	private int x=90; //Private variable
	private void m1() { //Private Method
		System.out.println("This is private method & belongs to Class Animals ");
	}
	void m2() {//This method acts as a default access modifier
		System.out.println("This is not private method & belongs to Class Animals ");
	}
	 Animals(){ 
		System.out.println("This is private constructor");
	}}

public class PrivateModifier_Java {

	public static void main(String[] args) {
		Animals obj =new Animals();
		//System.out.println(obj.x); 			// OUT OF SCOPE  
		//obj.m1(); 							// OUT OF SCOPE  
		obj.m2(); 								// WITH IN SCOPE 

	}
}

