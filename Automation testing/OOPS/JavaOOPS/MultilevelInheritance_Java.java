package JavaOOPS;
class Animal{  
  void eat()
  {
	  System.out.println("eating");
	  }  
}  
class Dog extends Animal{  
  void bark()
  {
	  System.out.println("barking");
	  }  
}  
class puppy extends Dog{  
  void weep()
  {
	  System.out.println("weeping");
	  }  
}  
public class MultilevelInheritance_Java {  
public static void main(String args[]){  
      puppy d=new puppy();  
      d.weep();  
      d.bark();  
      d.eat();  
}
}  

