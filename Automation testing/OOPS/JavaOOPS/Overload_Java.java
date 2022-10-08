package JavaOOPS;
public class Overload_Java {
	public int sum(int x, int y) { 
    	return (x + y); 
    	}
  
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
  
    
    public double sum(double x, double y)
    {
        return (x + y);
    }
  
   
    public static void main(String args[])
    {
    	Overload_Java s = new Overload_Java();
        System.out.println(s.sum(2, 88));
        System.out.println(s.sum(78, 32, 34));
        System.out.println(s.sum(10.6, 43.5));
    }
}