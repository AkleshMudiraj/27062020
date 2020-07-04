package array;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name1 = { "abc", "xyz", "pqr" };
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for(String a :name1)
		System.out.println(a);
		
		System.out.println(b.length);
		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i]);
			// System.out.println(a[i]);
			// System.out.println(name1[i]);

		}
	}

}
