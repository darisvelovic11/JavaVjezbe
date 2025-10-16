import java.util.Scanner;

public class Sesti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi duzinu: ");
		 int n = sc.nextInt();
		 
		 int [] niz = new int [n];
		 for(int i = 0 ; i < n; i++) {
			 System.out.print("Unesi broj" +  ( i + 1 ) +  " : ");
			 niz[i] = sc.nextInt();
		 }
		 System.out.print("Unesi max broj: ");
		 int max = sc.nextInt();
		 int manjiOdMax = 0;
		 for(int i = 0 ; i < n; i++) {
			 if(niz[i] < max ) {
				 manjiOdMax++;
			 }
		 }
		 System.out.println(manjiOdMax);

		 
	}

}
