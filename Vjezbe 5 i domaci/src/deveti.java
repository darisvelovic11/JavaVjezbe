import java.util.Scanner;

public class deveti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite string sastavljen od 0 ili 1: ");
		String s= sc.nextLine();
		System.out.print("Unesite poziciju : ");
		int pozicija = sc.nextInt();
		
		int rezultat = 0;
		if(s.charAt(pozicija) == '0') {
			if(pozicija == 0) {
				if(s.charAt(pozicija+1)=='0') {
					rezultat = 1;
				}
			}
			else if (pozicija == s.length()-1) {
				if(s.charAt(pozicija-1)=='0') {
					rezultat = 1;
				}
			}
			else {
				if(s.charAt(pozicija-1) == '0' && s.charAt(pozicija+1)=='0') {
					rezultat = 1;
				}
			}
		
		}
		System.out.println("Rezultat je: " + rezultat);
	}

}
