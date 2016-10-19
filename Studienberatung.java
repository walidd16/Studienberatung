import java.util.Scanner;

public class Studienberatung {
	

public static void main(String[] args) {
	System.out.println("Hast du Abitur?");
	Scanner scan = new Scanner(System.in);
	String eingabe = scan.next();
	
		if (eingabe.equalsIgnoreCase("n")){
			System.out.println("Hast du Fachabitur?");
			String eingabe2 = scan.next();
			
			if (eingabe2.equalsIgnoreCase("j")){
				System.out.println("Hast du eine Berufsausbildung?");
				String eingabe3 = scan.next();
			}
		}

		else if (eingabe.equalsIgnoreCase("j")){
			System.out.println("Bist du wissbegierig?");
			String eingabe2 = scan.next();

		}
		

	}
}