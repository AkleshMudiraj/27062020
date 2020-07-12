package collections;

import java.lang.reflect.Array;

import oops.inheritance.Mobile;
import oops.inheritance.SmartPhone;
import oops.inheritance.Telephone;

public class Students {

	public static void main(String[] args) {
		
		Object a=10;
		Object s="Aklesh";
		Object t=true;
		
         Object[] obj =  new Object[3];
         
        obj[0] =10;
 		obj[1] ="Aklesh";
 		obj[2] =true;
 		
		
		String[] std = new String[18];
		
		Object ob = new SmartPhone();
		
		new Telephone();
		new Mobile();
		
	}

}
