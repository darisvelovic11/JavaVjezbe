import java.util.Random;
import java.util.Scanner;

public class SuprotnaVrijednost {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in) ;
		Random r = new Random();
		
		 System.out.print("Unesi dužinu niza: ");
		 int n = sc.nextInt();
		 
		 int[] niz = new int[n];
		 for(int i = 0 ; i < n ; i++) {
			 niz[i] = r.nextInt(10) + 1;

		 }
		 for(int x : niz) {
			 System.out.print(x + " ");
		 }
		 
		 System.out.println();
		 
		 double [] noviNiz = new double[n];
		 for(int i = 0 ; i < n ; i++) {
			 if( niz[i] % 2 == 0) {
				 noviNiz[i] = -1 * niz[i];
			 }
			 else {
				 noviNiz[i] = 1/niz[i];

			 }
		 }
		 
		 System.out.println("\nIzmijenjeni niz:");
		 for (double x : noviNiz) {
		 System.out.printf("%.3f " , x);

		
	}
	}
}


