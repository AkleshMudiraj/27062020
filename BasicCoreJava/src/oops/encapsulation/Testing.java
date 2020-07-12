package oops.encapsulation;

public class Testing {

	
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0)
		this.age = age;
	}
	
}
