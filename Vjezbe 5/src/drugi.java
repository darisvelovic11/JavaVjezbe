import java.util.Scanner;

public class drugi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite rijec: ");
		String rijec = sc.nextLine().trim();
		
		rijec = rijec.replaceAll("\\s+", "" );
		
		
		String obrnuto = new StringBuilder(rijec).reverse().toString();
		
		if(rijec.equalsIgnoreCase(obrnuto)) {
			System.out.println("Rijec je palindrom.");
		} else {
			System.out.println("Rijec nije palindrom.");
		}
	}

}
