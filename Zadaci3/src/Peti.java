import java.util.Scanner;

public class Peti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Unesi duzinu: ");
		 int n = sc.nextInt();
		 
		 int [] niz = new int [n];
		 
		 for(int i = 0; i < n ; i++) {
			 System.out.print("Unesi brojeve: ");
			 niz[i] = sc.nextInt();
		 }
		 int suma = 0;
		 for(int i = 0; i < n ; i++) {
			 if(niz[i] < 0 && niz[i] % 2 == 0) {
				 suma+=Math.abs(niz[i]);
			 }
		 }
		 System.out.println(suma); 

		 
	}

}
