package zadaci2;

import java.util.Scanner;

public class MinMaxTrocifreni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		 double minimum = Math.min(a, Math.min(b, c));
	     double maksimum = Math.max(a, Math.max(b, c));

	        System.out.println("Minimum je: " + minimum);
	        System.out.println("Maksimum je: " + maksimum);

	        sc.close();
		
		
	}

}
