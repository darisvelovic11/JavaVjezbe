import java.util.Scanner;

public class Cetvrti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Unesi broj kuca: ");
		 int n = sc.nextInt();
		 
		 int [] niz = new int [n];
		 
		 for(int i = 0; i < n ; i++) {
			 System.out.println("Kuca broj [ " +(i + 1) + " ] : ");
			 niz[i] = sc.nextInt();
		 }
		 int zbir = 0;
		 for(int i = 0; i < n ; i++) {
			 zbir += niz[i];
			 if (niz[i] == 0) {
				 break;
			 }
		 }
		 System.out.println(zbir);
		 

		 
	}

}
