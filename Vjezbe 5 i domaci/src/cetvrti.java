import java.util.Scanner;

public class cetvrti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite rijec: ");
		String rijec = sc.nextLine();
		int samoglasnici = 0;
		int suglasnici = 0;
		
		for(int i = 0; i < rijec.length(); i++) {
			char slovo = Character.toLowerCase(rijec.charAt(i));
				if(slovo == 'a' || slovo == 'e' || slovo == 'i' || slovo == 'o' || slovo == 'u') {
					samoglasnici++;
				} else {
					suglasnici++;
				}
			}
		
		System.out.println("Broj samoglasnika: " + samoglasnici);
		System.out.println("Broj suglasnika: " + suglasnici);
		

	}

}
