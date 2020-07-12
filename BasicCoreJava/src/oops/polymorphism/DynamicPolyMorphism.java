package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.SmartPhone;
import oops.inheritance.Telephone;

public class DynamicPolyMorphism {

	public static void main(String[] args) {
		
	/*	SmartPhone obj = new SmartPhone();
		obj.texting();
		
		Mobile obj2 = new SmartPhone();
		obj.texting();
		
		Telephone obj3 = new SmartPhone();
		obj.calling(); */
		
		Telephone obj4 = null;  // Ex. webdriver
		
		String browserName ="Firefox";
		
		
		if(browserName.equals("Chrome")) 
		{
			obj4= new Mobile(); 
		}else if(browserName.equals("Firefox"))
		{
			obj4 = new SmartPhone();
		}
		
		obj4.calling(); // scripting
		
	}
	
}
