package functions;

public class CallVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Variables.name);
		
		Variables ref = new Variables();
		System.out.println(ref.name);
		
		ref.name="Ajinkiya";
		
		
		
		Variables ref2 = new Variables();
		ref2.name2="Aklesh";
		
       System.out.println(ref.name);	
       System.out.println(ref.name2);

       System.out.println(ref2.name2);
       System.out.println(ref2.name);

}
}