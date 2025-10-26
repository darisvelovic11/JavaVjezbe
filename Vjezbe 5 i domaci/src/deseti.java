import java.util.Scanner;

public class deseti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String s = sc.nextLine();
		
		StringBuilder rezultat = new StringBuilder();
		for(int i = 0; i<s.length();i++) {
			char c = s.charAt(i);
			int broj = c - '0';
			
			rezultat.append(broj%2 == 0? '0':'1');
		}
		System.out.println(rezultat.toString());

	}

}
