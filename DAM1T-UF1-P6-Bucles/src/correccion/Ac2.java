package correccion;

import java.util.Scanner;

public class Ac2 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		boolean repeated = false;
		char savedChar = '-';
		char current;
		
		do {
			
			System.out.print("LETRA: ");
			current = data.nextLine().charAt(0);
			
			if (current == savedChar) 
				repeated = true;
			savedChar = current;
			 
		} while ((int) current >= 65 && (int) current <= 90);
		
		System.out.println(repeated);
	}

}
