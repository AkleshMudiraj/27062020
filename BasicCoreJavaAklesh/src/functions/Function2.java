package functions;

public class Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d = add(10,20);
		int c= add(30,40);
		
		System.out.println(d);
		System.out.println(c);
		
		message("Aklesh");
		
		eligibility("Anand",32);
		eligibility("Prachee",17);
		
	}

	// whenervwe we have two function with same name but differnet parameter
	// is called method overloading
	
	public static int add(int a, int b) 
	{
		
		 return a+b;
	}
	
	public static int add(int a, int b, int c) 
	{
		
		 return a+b+c;
	}
	
	public static void message(String name)
	{
		System.out.println("Welcome"+name);
	}
	
	
	public static void eligibility(String name, int age)
	{
		
		if(age>18) 
		{
			System.out.println("Anand, you are eligible");
		}
		else
		{
			System.out.println("Prachee, you are not eligible");
		}
	}
	
}
