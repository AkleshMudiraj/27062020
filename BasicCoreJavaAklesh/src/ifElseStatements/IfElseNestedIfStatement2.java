package ifElseStatements;

import java.util.Scanner;

public class IfElseNestedIfStatement2 {
	

	
	public void ifElseLoop() {
		
	  System.out.println("***** Find the Greatest number between three different number*****");
		
	
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream. It belongs to java.util packages
		
		System.out.print("Please Enter first Number- ");
		int no1= sc.nextInt();    //It is used to scan the next token of the input as an integer.
		
		System.out.print("Please Enter Second Number- ");
		int no2= sc.nextInt();
		System.out.print("Please Enter Third Number- ");
		int no3= sc.nextInt();
		
		sc.close();
		
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
	

	public static void main(String[] args) {
		// Nested if Statement
        IfElseNestedIfStatement2 obj = new IfElseNestedIfStatement2();
		obj.ifElseLoop();
		
		
	}
}

