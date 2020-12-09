package correccion;

public class Ac5 {

	public static void main(String[] args) {
		int num = 4;

		for (int pos = num; pos > 0; pos--) {
			for (int ast = 1; ast <= num; ast++) {
				if (ast >= pos)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
