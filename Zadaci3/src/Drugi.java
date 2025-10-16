import java.util.Scanner;

public class Drugi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Unesi duzinu: ");
		 int n = sc.nextInt();
		 
		 int [] niz = new int [n];
		 
		 for(int i = 0; i < n ; i++) {
			 System.out.print("Unesi brojeve: ");
			 niz[i] = sc.nextInt();
		 }
		 System.out.println("Negativni parni su : ");

		 for(int i = 0; i < n ; i++) {
			 	if(niz[i] < 0 && niz[i] % 2 == 0) {
			 		 System.out.print(niz[i] + " ");
				 
			 }
		 }
				 
			
	}

}
		 
