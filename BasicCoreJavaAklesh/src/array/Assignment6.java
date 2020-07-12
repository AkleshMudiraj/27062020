package array;

public class Assignment6 {

	public static void main(String[] args) {
		// Array practice program

		System.out.println("***** Print Fruits Name ******");

		String[] fruits = { "Apple", "Mango", "Orange", "Banana", "Pineapple"}; 
		for (String fruit : fruits)
			
		System.out.print(fruit +","+"\t");
		System.out.print("\n");

		System.out.println("***** Print Prices *****");

		float[] price = { 20.50f, 10.00f, 30.0f, 12.55f, 50.05f };

		for (Float prices : price)
			System.out.print(prices +","+"\t");
		    System.out.println();
		
		int[][] matrix= {{2,3,4,5,6},{4,6,8,10,12},{6,9,12,15,18},
			{8	,12	,16,20,24},
			{10	,15	,20, 25,30},
			{12,18,	24,30,36},
			{14,21,	28,35,42},
			{16,24,	32,40,48},
			{18,27,36,45,54},
			{20,30,	40,50,60}};
		
		System.out.println("***** Print 2 to 6 Table*****");
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
			
		}

		}
 

	}


