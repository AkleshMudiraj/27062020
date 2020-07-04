package ifElseStatements;

public class IfElseNestedIfStatement {
	
	private int no1=10;
	private int no2=20;
	private int no3=30;
	
	public int getNo1() {
		return no1;
	}

	public void setNo1(int no1) {
		this.no1 = no1;
	}

	public int getNo2() {
		return no2;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}

	public int getNo3() {
		return no3;
	}

	public void setNo3(int no3) {
		this.no3 = no3;
	}

	public static void main(String[] args) {
		// Nested if Statement
		
        IfElseNestedIfStatement obj = new IfElseNestedIfStatement();
		
		if (obj.getNo1()>=obj.getNo2())
		{
			if(obj.getNo1()>=obj.getNo3())
			{
			System.out.println(obj.getNo1()+" is greatest number");
			}else {
			   
				if(obj.getNo2()>=obj.getNo3())
			    {
				 System.out.println(obj.getNo2()+" is greatest number");
		        }else{
				      System.out.println(obj.getNo3()+" is greatest number");
			         }  
	        }

     	}
		else if(obj.getNo2()>=obj.getNo3())
	    {
		 System.out.println(obj.getNo2()+" is greatest number");
        }else{
		      System.out.println(obj.getNo3()+" is greatest number");
	         }
	}
}

