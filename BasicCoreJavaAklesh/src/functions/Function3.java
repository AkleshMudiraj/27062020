package functions;

public class Function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = add(10,20);
		int c= add(30,40);
		
		System.out.println(d);
		System.out.println(c);
		
		boolean b= eligiable(32);
		boolean e= eligiable(17);

		
		
	}

	public static int add(int a, int b) 
	{
		
		 return a+b;
	}
	
	public static boolean eligiable(int age) 
	{
		
		 if(age>=18)
		 {
		  System.out.println("Anand, you are eligible");
		  return true;
		 }
		 else
		 {
			 System.out.println("Anand, you are not eligible");
			 return false;
		 }
		 
	}
}
