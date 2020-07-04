package ifElseStatements;

public class IfElseClass3NestedIfStatement {


	public static void main(String[] args) {
		// Nested if Statement
		
		System.out.println("***** Find the Greatest number between three different number***** ");
		
		int no1=10;
	    int no2=20;
		int no3=30;
		
		System.out.println(" First  Number ="+no1);
		System.out.println(" Second Number ="+no2);
		System.out.println(" Third  Number ="+no3);
		
		if (no1>=no2)
		{
			if(no1>=no3)
			{
			System.out.println(no1+" is greatest number");
			}else {
			   
				if(no2>=no3)
			    {
				 System.out.println(no2+" is greatest number");
		        }else{
				      System.out.println(no3+" is greatest number");
			         }  
	        }

     	}
		else if(no2>=no3)
	    {
		 System.out.println(no2+" is greatest number");
        }else{
		      System.out.println(no3+" is greatest number");
	         }
	}
}

