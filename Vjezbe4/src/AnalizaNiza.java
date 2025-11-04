import java.util.Scanner;

public class AnalizaNiza {
	public static double nadjiParniPozitivniProsjek(int[] niz) {
		double suma = 0;
		double broj = 0;
		
		for(int x:niz) {
			if(x > 0 && x%2 == 0) {
				suma+=x;
				broj++;
			}
		}
		if(broj==0) {
			 System.out.println("Nema pozitivnih parnih brojeva ");

		}
		
		return (double) suma/broj;
		
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	 System.out.print("Unesi dužinu niza: ");
	 int n = sc.nextInt();
	 int[] niz = new int [n];
	 
	 for(int i = 0; i < n; i++ ) {
	 	System.out.print("Unesi element  [" + (i) + "] : ");
	 	niz[i] = sc.nextInt();
}
double prosjek = nadjiParniPozitivniProsjek(niz);
	if (prosjek!= 0) {
		System.out.println("\nProsječna vrijednost pozitivnih parnih brojeva: " + prosjek);
	}
	

	
}
	
	
}



