import java.util.Scanner;

public class DuzinaNiza {

	public static void main(String[] args) {
		// Napisati program koji korisniku omogućava unos dužine niza, a zatim i elemente niza.
		//Svaki element predstavlja broj bodova ostvarenih na ispitu. Nakon unosa potrebno je
		//odštampati prosječnu broj bodova i najmanji element u nizu (vrijednost i indeks)

		Scanner sc = new Scanner(System.in);
		 
		//Unos duzine niza
		System.out.print("Unesi broj studenata (dužinu niza): ");
		 int n = sc.nextInt();
		 
		 int [] bodovi = new int[n];
		 
		 for(int i = 0; i < bodovi.length; i++) {
			 System.out.print("Unesi broj bodova (elemente niza) " + (i + 1) + " : ");

			 bodovi[i] = sc.nextInt();
		 }
		 double suma = 0;
		 for(int b: bodovi) {
			 suma+=b;
		 }
		 double prosjek = suma/n;
		 
		 int najmanji = bodovi[0];
		 int minIndeks = 0;
		 for(int i = 0 ; i<n ; i++) {
			 if (bodovi[i] < najmanji) {
				  najmanji = bodovi[i];
				 minIndeks = i;
			 }
		 }
		 System.out.println("\nProsječan broj bodova: " + prosjek);
		 System.out.println("Najmanji broj bodova: " +najmanji);
		 System.out.println("Indeks najmanjeg elementa: " +minIndeks);
		 
		 
	}
	
}	
		 
		 
		
		