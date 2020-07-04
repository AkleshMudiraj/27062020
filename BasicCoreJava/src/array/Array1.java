package array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] name1 = { "abc", "xyz", "pqr" };

		String[] name = new String[10];

		name[0] = "Aklesh";
		name[1] = "Anand";
		name[2] = "Puja";
		name[3] = "Dhara";
		name[4] = "Neha";
		name[5] = "Bilva";
		name[6] = "Prachee";
		name[7] = "Ajinkiya";
		name[8] = "Anand";
		name[9] = "Manoj";

		System.out.println(name.length);
		for (int i = 0; i < name.length; i++) {

			System.out.println(name[i]);
			// System.out.println(a[i]);
			// System.out.println(name1[i]);

		}
	}

}
