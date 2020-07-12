package array;

public class ArrayReverseNo {

	public static void main(String[] args) {
		// Make an integer array. Write a for loop to print the integer array in reverse.
		
		int[] arr = {11,21,32,43,54,65,76,87,98,100};
		
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+"\t");
		} 

	}

}
