
public class cal 
{
	public static void main(String[] args)
	{
		Calculate ankit =new Calculate();
		int r =ankit.add(10, 20);
		System.out.println("ankit addition of a and b is  "+r);
		
		int c= ankit.subtract(20,10);
		System.out.println("ankit subtraction of a and b is  "+c);
		
		
		Calculate neha =new Calculate();
		
		int z=neha.add(10, 20);
		System.out.println("addition of a and b is  "+z);
		
		int h =neha.subtract(20,10);
		System.out.println("subtraction of a and b is  "+h);
		
		
	}
}
