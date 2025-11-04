import java.util.Scanner;

public class SortiraniNiz {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi duzinu niza: ");
		int n = sc.nextInt();
		int [] niz = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Unesi element  [ " + i +   " ] : ");
			niz[i] = sc.nextInt();
			
		}
		for ( int i = 0; i < n - 1; i++) {
			for ( int j = 0; j  < n - i  - 1; j++) {
				if(niz[j] > niz[j+1]) {
					int temp = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = temp;
				}
			}
		}
		System.out.println("Sortirani niz (rastuce) : ");
		for(int broj: niz) {
			System.out.print(broj + " ");
			
		}
		System.out.println();
		
		System.out.print("Unesi broj koji zelis da pretrazis: ");
		int trazeni = sc.nextInt();
		boolean postoji = false;
		for(int broj : niz) {
			if(trazeni == broj) {
				postoji = true;
				break;
			}	
		}
		if(postoji) {
			System.out.println("Broj " + trazeni + " postoji u nizu.");
		} else {
			System.out.println("Broj " + trazeni + " se ne nalazi u nizu.");

		}
		
		
		

	}

}
