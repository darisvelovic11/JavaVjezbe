import java.util.Scanner;

public class Dvanaesti {
	public static boolean jeNarcistican(int broj) {
		int original = broj;
		broj = Math.abs(broj);
		
		int duzina = String.valueOf(broj).length();
		
		int suma = 0;
		int temp = broj;
		
		while(temp > 0) {
			int cifra = temp%10;
			suma += Math.pow(cifra, duzina);
			temp/=10;
		}
		return suma == original;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);                          
        System.out.print("Unesite broj elemenata niza: ");
        int n = sc.nextInt();                                 
        int[] niz = new int[n];    
        
        System.out.println("Unesite " + n + " cijelih brojeva:");
        for(int i = 0; i< n ; i++) {
        	niz[i] = sc.nextInt();
        }
        int brojac = 0;
        
        for(int i = 0; i < n ; i++) {
        	if(jeNarcistican(niz[i])) {
        		brojac++;
                System.out.println(niz[i] + " je narcističan broj.");

        	}
	}
   
        System.out.println("Ukupan broj narcističnih brojeva u nizu je: " + brojac);

}

}
