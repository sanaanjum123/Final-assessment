package JavaOOPS;

	interface abc12{
		void m1();
	}

	interface abc2{
		void m2();
		}

	public class MultipleInheritance_Java  implements abc12,abc2{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MultipleInheritance_Java obj=new MultipleInheritance_Java();
			obj.m1();
			obj.m2();
		}
		public void m1()
		{
			System.out.println("Hello world");
		}
		public void m2()
		{
			System.out.println("Welcome to  programming");
		}

}
