
public class NizOd10 {

	public static void main(String[] args) {
		// ► Napisati program koji kreira niz od 10 cijelih brojeva, popunjava ga brojevima od 1 do 10 a zatim ispisuje elemente niza u obrnutom redosledu.


		int[] niz = new int[10];
		for ( int i = 0 ; i < niz.length; i++) {
			niz[i] = i + 1;
			System.out.println(niz[i]);
		}
		//Ispis originalnog niza
		System.out.println("Originalni niz je: ");
		for(int broj:niz) {
			System.out.print(broj + " ");
		}
		System.out.println("\n \nNiz u obrnutom redosljedu: ");
		
		for ( int i= niz.length - 1; i >= 0 ;i--) {
			System.out.print(niz[i] + " ");

		}

	}

}
