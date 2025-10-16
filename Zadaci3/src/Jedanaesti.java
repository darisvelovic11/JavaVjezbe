import java.util.Scanner;

public class Jedanaesti {
	public static int zbirCifara(int broj) {
		broj = Math.abs(broj);
		int  zbir = 0;
		while(broj > 0) {
			zbir+= broj%10;
			broj/=10;
		}
		return zbir;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata liste: "); 
        int n = sc.nextInt();
        
        int [] niz = new int [n];
        
        System.out.println("Unesite " + n + " cijelih brojeva (mogu biti i negativni):");
        for(int i = 0 ; i<n ; i++) {
        	niz[i] = sc.nextInt();
        }
        int brojSaNajveciZbir = niz[0];
        int maxZbir = zbirCifara(niz[0]);
        
        for(int i = 1 ; i<n ; i++) {
        	int trenutni = niz[i];
        	int trenutniZbir = zbirCifara(trenutni);
        	
        	if(trenutniZbir > maxZbir ) {
        		brojSaNajveciZbir = trenutni;
        		
        	}
        
        }
        System.out.println("Broj koji daje najveći zbir cifara je: " + brojSaNajveciZbir);
        System.out.println("Taj zbir cifara iznosi: " + maxZbir);
	}

}
