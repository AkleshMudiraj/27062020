package oops.inheritance;

public class Test2 {

	public static void main(String[] args) {
      C a = new C();
      D b = new D();

      a.parentMeth();
    //  a.childMeth();  // child class method cannot access by parent class object

     b.childMeth();
     a.parentMeth();

}

}

class C{

public void parentMeth(){

	System.out.println("parent");
}
}

class D extends C{
public void childMeth(){
System.out.println("child");
}

}
