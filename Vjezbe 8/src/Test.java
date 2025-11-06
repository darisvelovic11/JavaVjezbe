import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Restoran r = new Restoran("Pod Lozom","Golubovci","123456789");
		
		r.dodajZaposlenog(new Konobar(1,"Daris","Velovic",11,42,5));
		r.dodajZaposlenog(new Kuvar(2,"Suza","Suzanovic",15,40));
		r.dodajZaposlenog(new Kuvar(3,"Marina","Dzordanovic",10,38));
		r.dodajZaposlenog(new Konobar(4,"Kenan","Agovic",12,45,12));
		r.dodajZaposlenog(new Menadzer(5,"Djina","Krgovic",10,40,0));
		
		ArrayList<ObracunPlate> obracuni = r.generisiObracun("Jul",2023);
		double ukupno = r.ukupniTrosak(obracuni);
		
		System.out.printf("\nUkupni trosak plata za mjesec Jul 2023 je: %.2f€\n", ukupno);

	}

}
