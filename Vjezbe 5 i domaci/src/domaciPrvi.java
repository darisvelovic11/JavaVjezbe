import java.util.Scanner;

public class domaciPrvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite string brojeva: ");
		String s = scanner.nextLine();
		
		StringBuilder sb = new StringBuilder(s);
		int suma = 0;
		for(int i = 0; i< sb.length();i++) {
			if(sb.charAt(i) =='-') {
				if(i + 1 < sb.length() && Character.isDigit(sb.charAt(i+1))) {
					if(i+2>=sb.length() || sb.charAt(i+2)=='+'|| !Character.isDigit(s.charAt(i+2))){
						suma++;
					}
				}
			}
		}
	System.out.println("Ukupan broj negativnih jednocifrenih brojeva je: " + suma);
	}
	
	

}
