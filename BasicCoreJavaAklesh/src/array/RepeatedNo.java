package array;

public class RepeatedNo {

	public static void main(String[] args) {
		/* Write a program which prints which each number from array and the times it has been repeated in array
Fox eg
1- Repeated 3 times
4- Repeated 6 times */


		int[] arr = {1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
		
		System.out.println("Repeated number in given array: ");  
        
		int count=0;
		int j;
        for(int i = 0; i < arr.length; i++) 
        {  
            for(j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                {
                	count++;
                }
                    
            
                if(count==1)
                    
                 count = 0;
                
            } 
            System.out.println(arr[j]);
        }  
    }  
}  