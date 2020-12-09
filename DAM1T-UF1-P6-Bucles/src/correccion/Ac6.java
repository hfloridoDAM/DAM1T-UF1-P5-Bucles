package correccion;

public class Ac6 {

	public static void main(String[] args) {
		int asterisco = 1;

		int num = 4;

		for (int espacio = num - 1; espacio >= 0; espacio--, asterisco = asterisco + 2) {

			for (int numEspacios = 1; numEspacios <= espacio; numEspacios++) {
				System.out.print(" ");
			}

			for (int numAsteriscos = 1; numAsteriscos <= asterisco; numAsteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
