package array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] name1 = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}
		,{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},
		{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
	
		
		for(int i=0;i<name1.length;i++)
		{
			for(int j=0;j<name1[i].length;j++)
			{
				System.out.print(name1[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		
	}

}
