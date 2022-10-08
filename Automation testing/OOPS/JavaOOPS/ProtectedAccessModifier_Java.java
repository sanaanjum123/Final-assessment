package JavaOOPS;

public class ProtectedAccessModifier_Java {
	
		public static void main(String[] args) {
			ProtectedAccessModifier_Java obj = new ProtectedAccessModifier_Java();
			int sum = obj.sub(189,100);
			System.out.println("difference of 2 numbers is "+ sum);

		}
		protected int sub(int a ,int b) {
			int c = a-b;
			return c;
		}
	
}
