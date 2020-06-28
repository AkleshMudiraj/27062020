package ifElseStatements;

public class IfElseLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=25;
		boolean voterID=true;
		
		if(age >=18 && voterID)
		{
			System.out.println("You are eligible");
		}else {
			System.out.println("you are not eligible");
			}
			
		boolean panCard=true;
		boolean aadharCard=false;
		
		if(panCard || aadharCard)
		{
			System.out.println("You are eligible");
			
		}else {
			System.out.println("You are not eligible");
		}
		
	}

}
