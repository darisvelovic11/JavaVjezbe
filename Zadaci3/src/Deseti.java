import java.util.Scanner;

public class Deseti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj elemenata niza: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Unesite elemente niza (cijeli brojevi, bez nule):");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int brojac = 0;
		for (int i = 0; i < n; i++) {
			int suprotan = -a[i];
			
		
		
				for(int j=0; j<n; j++) {
					if(suprotan== a[j] ) {
						brojac++;
						break;
				}
				
			}
		}
			
		brojac/=2;
			
	System.out.println("Broj parova suprotnih elemenata u nizu je: " + brojac);
		}
		
	}

		

	
