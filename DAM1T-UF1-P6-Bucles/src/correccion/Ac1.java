package correccion;

import java.util.Scanner;

public class Ac1 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		char c;
		String cadena = "";
		
		do {			
			System.out.print("LETRA: ");
		
			String input = data.nextLine();
			c = input.charAt(0);
			cadena += c;
			
		} while (c != 'S' && c != 's');
		System.out.println(cadena);
	}

}
