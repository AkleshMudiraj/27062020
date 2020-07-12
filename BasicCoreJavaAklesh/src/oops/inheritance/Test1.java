package oops.inheritance;

public class Test1 {

		public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println(a.x);
	//	System.out.println(a.y); //child y variable cannot be access due to parent class object
		System.out.println(b.x);
		System.out.println(b.y);

		}

		}

		class A{

		String x="Parent";
		}

		class B extends A{
		String y="Child";

		}

