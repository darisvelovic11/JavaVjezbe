import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Unesi duzinu: ");
		 int n = sc.nextInt();
		 
		 int [] niz = new int [n];
		 
		 int pozCijeli = 0;
		 for(int i = 0; i < n ; i++) {
			 System.out.printf("Unesi brojeve: ");
			 niz[i] = sc.nextInt();
			 if(niz[i] > 0  ) {
				 pozCijeli ++;
			 }
		 }
		 
		 System.out.printf("Niz ima %d cijelih pozitivnih brojeva " , pozCijeli);
	}

}
