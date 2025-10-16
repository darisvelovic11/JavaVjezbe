import java.util.Scanner;

public class Treci {

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
		 System.out.print("Unesi parametar x: ");
		 int x = sc.nextInt();
		 
		 if(x < 0) {
			 x = Math.abs(x);
		 }
		 for(int i = 0; i < n ; i++) {
			 if(niz[i] % 2 == 0)
			 niz[i]+=x;
		 }
		 System.out.print("Novi niz je:  " );
		 for(int z : niz) {
			 System.out.print(z + " ");
		 }
		 
		 
	}

}
	
