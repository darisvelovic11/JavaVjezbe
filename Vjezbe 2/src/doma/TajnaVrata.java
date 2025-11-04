package doma;

import java.util.Scanner;

public class TajnaVrata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int trocifrenBr;
		System.out.println("Unesi trocifren broj: ");
		trocifrenBr = sc.nextInt();
		
		int a = trocifrenBr/100;
		int b = (trocifrenBr/10)%10;
		int c = trocifrenBr%10;
		
		
		
		int proizvod = a*b*c;
		int zbir = a+b+c;
		int kod = proizvod - zbir;
		System.out.printf("Sifra za tajna vrata je %d", kod);

	}

}
