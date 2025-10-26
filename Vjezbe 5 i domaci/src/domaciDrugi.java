import java.util.Scanner;

public class domaciDrugi {
	public static int izracunaj(String izraz) {
		int rezultat = 0;
		char operator = ' ' ;
		int indexOperatora = -1 ;
		
		for(int i = 0; i < izraz.length();i++) {
			char c = izraz.charAt(i);
			if(c == '+' || c =='-' || c =='*' || c=='/') {
				operator = c;
				indexOperatora = i;
				break;
			}
		}
		int operand1 = Integer.parseInt(izraz.substring(0,indexOperatora));
		int operand2 = Integer.parseInt(izraz.substring(indexOperatora+1));
		
		switch(operator) {
			case'+' : rezultat = operand1 + operand2;break;
			case'-' : rezultat = operand1 - operand2;break;
			case'*' : rezultat = operand1 * operand2;break;
			case'/' : rezultat = operand1 / operand2;break;
		



		}
		return rezultat;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite izraz: ");
		String izraz=sc.nextLine();
		
		int rezultat=izracunaj(izraz);
		System.out.print("Rezultat je: " + rezultat);

	}

}
