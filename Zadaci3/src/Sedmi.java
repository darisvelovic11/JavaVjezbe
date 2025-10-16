import java.util.Scanner;

public class Sedmi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj artikla: ");
		 int n = sc.nextInt();
		 
		 double [] niz = new double [n];
		 for(int i = 0 ; i < n; i++) {
			 System.out.print("Unesi cijene proizvoda" +  ( i + 1 ) +  " : ");
			 niz[i] = sc.nextDouble();
		 }
		 System.out.print("Unesi snizenje po proizvodu : ");
		 double snizenje = sc.nextDouble();
		 
		 double sumaNiza = 0;
		 double sumaNovogNiza = 0;
		 
		 for(int i  = 0 ; i < n ; i++ ) {
			 sumaNiza += niz[i];
			 sumaNovogNiza += niz[i] - snizenje;
		 }
		 double zarada = sumaNiza - sumaNovogNiza;
		 System.out.print("Zarada ce biti manja za :  " + zarada);

 
	}

}
