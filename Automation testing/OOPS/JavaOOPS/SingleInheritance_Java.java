package JavaOOPS;
class xyz{  
  void v1()
  {
	  System.out.println("Hello world");
	  }  
}  
class def extends xyz{  
  void v2()
  {
	  System.out.println("Welcome to programming");
	  }  
}  
public class SingleInheritance_Java {
 
public static void main(String args[]){  
             def d=new def();  
             d.v1();  
             d.v2();  

	
	}

}
