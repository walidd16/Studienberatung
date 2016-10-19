import java.util.Scanner;

public class Studienberatung {
	

public static void main(String[] args) {
	System.out.print("Hast du Abitur?");
	Scanner scan = new Scanner(System.in);
	String eingabe = scan.next();
	
		if (eingabe.equalsIgnoreCase("n")){
			System.out.println("Hast du Fachabitur?");
			String eingabe = scan.next();
		}
	

	
	}
}