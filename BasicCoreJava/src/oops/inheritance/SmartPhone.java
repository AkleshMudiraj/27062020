package oops.inheritance;

public class SmartPhone extends Mobile
{

	public  void videocalling() {
		

		System.out.println("Video Calling from Smart Phone");
		
	}
   
	public  void calling() {
		
        System.out.println("Calling from Smartphone");
	}

	// Method Overloading
	public  void calling(int a) {
		
         System.out.println("Calling from Smartphone");
	}
}
