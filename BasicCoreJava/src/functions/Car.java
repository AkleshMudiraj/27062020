package functions;

public class Car {
	
	String colour;
	int capacity;
	
	public void features()
	{
		System.out.println("Car features are: colour="+colour+" and capicity="+capacity);
	}

	public Car(String colour, int capacity) 
	{
		this.capacity=capacity;
		this.colour=colour;
		
	}
	
	public Car()
	{
		
	}
}
