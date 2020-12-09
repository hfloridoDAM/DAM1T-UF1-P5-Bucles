package correccion;

import java.util.Scanner;

public class Ac7 {

	public static void main(String[] args) {
		
		boolean pswOk;
		boolean hasNumbers;
		boolean hasCharacters;
		boolean noNumNoChar;
		
		do {
			pswOk = true;
			hasNumbers = false;
			hasCharacters = false;
			noNumNoChar = false;
		
			Scanner data = new Scanner(System.in);
			
			System.out.print("Entra una contrasenya: ");
			
			String psw = data.nextLine();
			
			if (psw.length() > 4) {
				System.out.println("Contrasenya incorrecta: Mes caracters");
				pswOk = false;
			}
			
			if (psw.length() < 4) {
				System.out.println("Contrasenya incorrecta: Menys de 4 cara cters");
				pswOk = false;
			}
			
			for (int iter = 0; iter < psw.length(); iter++) {
				int ascii = (int) psw.charAt(iter);
				if (ascii >= 97 && ascii <= 122 || ascii >= 65 && ascii <= 90) 
					hasCharacters = true;
				else if (ascii > 48 && ascii < 57)
					hasNumbers = true;
				else 
					noNumNoChar = true;
			}
			
			if (!hasCharacters || !hasNumbers) {
				System.out.println("Contrasenya incorrecta: No combina lletres y numeros");
				pswOk = false;
			}
			
			if (noNumNoChar) {
				System.out.println("Contrasenya incorrecta: Caracters no permesos");
				pswOk = false;
			}
			
		} while (!pswOk);

	}

}
