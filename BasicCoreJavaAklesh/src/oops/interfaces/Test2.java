package oops.interfaces;

public class Test2 {

	public static void main(String[] a){
		
		A a1 = new B();
		a1.meth1();
		a1.meth2();
		a1.meth3();
		
	//	a1.meth4();  // meth4 method is access with the object for interface A
		}

		}

		interface A{
		public void meth1();
		public void meth2();
		public void meth3();
		}



		class B implements A{

		@Override
		public void meth1() {
		System.out.println("meth1");

		}

		@Override
		public void meth2() {
		System.out.println("meth2");

		}

		@Override
		public void meth3() {
		System.out.println("meth3");

		}

		public void meth4() {
		System.out.println("meth4");

		}

		}


