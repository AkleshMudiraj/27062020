package functions;

public class AccessModifierPackageLevel extends AccessModifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifier obj = new AccessModifier();
		obj.publicFuction();
		obj.protectedFuction();
		obj.defaultFuction();
		
		AccessModifierPackageLevel obj1 = new AccessModifierPackageLevel();
		obj1.protectedFuction();
		
	    
	}

}
