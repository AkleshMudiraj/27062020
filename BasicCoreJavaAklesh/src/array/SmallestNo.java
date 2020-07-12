package array;

public class SmallestNo {

	public static void main(String[] args) {
		// Find the least number in a array
		
		
		int[] arr = {11,21,32,43,54,65,76,87,98,10};
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			
			if(arr[i]<min)
			{
				min =arr[i];
			}
			
		}
		System.out.println(min);
	}

}

