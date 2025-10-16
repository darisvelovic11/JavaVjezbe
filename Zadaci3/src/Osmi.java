import java.util.Scanner;

public class Osmi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj zaposlenih: ");
		 int n = sc.nextInt();
		 
		 int [] niz = new int [n];
		 for(int i = 0 ; i < n; i++) {
			 System.out.print("Unesi plate zaposlenog " +  ( i + 1 ) +  " : ");
			 niz[i] = sc.nextInt();
			
		 }
		
		 int najveci = Integer.MIN_VALUE;
		 int drugi = Integer.MIN_VALUE;
		 
		 for(int i = 0 ; i < n ; i++) {
			 if(niz[i] > najveci) {
				 drugi = najveci;
				 najveci = niz[i];
				}
			 else if( niz[i] > drugi && niz[i] < najveci) {
				 drugi = niz[i];
			 }
		 }
		 System.out.println("Druuga najveca plata je : " + drugi);
	}

}
