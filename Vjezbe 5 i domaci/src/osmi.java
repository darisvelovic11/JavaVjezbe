import java.util.Scanner;

public class osmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite recenicu: ");
		String recenica = sc.nextLine();
		String[]rijeci = recenica.trim().split("\\s+");
		
		StringBuilder rezultat = new StringBuilder();
		for(String rijec : rijeci) {
			StringBuilder sb = new StringBuilder(rijec);
			sb.reverse();
			rezultat.append(sb.toString()).append(" ");
			
		}
		System.out.println("Recenica sa obrnutim rijecima: " + rezultat.toString().trim());
		
	}
	

}
