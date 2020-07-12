package array;

public class GreatestNo {

	public static void main(String[] args) {
		// Find the greatest number in a array
		
		int[] arr = {11,21,32,43,54,65,76,87,98,10};
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			
			if(arr[i]>max)
			{
				max =arr[i];
			}
			
		}
		System.out.println(max);
	}

}
