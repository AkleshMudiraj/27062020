package functions;



public class Function4 {

	public static int s=10;
	public  String name="Aklesh";
	public static String name1 = "Mudiraj";
	
	public static void main(String[] args) {
		// Static function can only called only static variable and static method

     System.out.println(s);
     
     Function4 obj = new Function4();
     
     System.out.println(obj.name);
	}

}
