package doma;

import java.util.Scanner;

public class PrviZad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double pocetnaCijena = 1;
		double jedanKm = 0.5;
		double predjeniBr;
		double cijena;
		
		System.out.print("Unesi predjeni broj kilometara: ");
		predjeniBr = sc.nextDouble();
		
		cijena = pocetnaCijena + (jedanKm *predjeniBr);
		System.out.printf("Cijena iznosi %.2f eura", cijena);
		


	}

}
