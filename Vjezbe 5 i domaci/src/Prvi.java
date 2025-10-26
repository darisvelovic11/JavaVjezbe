import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite recenicu: ");
		String recenica = sc.nextLine();
		recenica = recenica.trim();
		
		String[] rijeci = recenica.split("\\s+");
		System.out.println("Broj rijeci u recenici je: " + rijeci.length);
				

	}

}
