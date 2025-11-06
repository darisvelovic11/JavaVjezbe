import java.util.ArrayList;

public class Restoran {
	private String naziv;
	private String adresa;
	private String PIB;
	private ArrayList<Zaposleni> zaposleni;
	
	public Restoran(String naziv, String adresa, String PIB) {
		this.naziv = naziv;
		this.adresa = adresa;
		this.PIB = PIB;
		this.zaposleni = new ArrayList<>();
	}
	public void dodajZaposlenog(Zaposleni z) {
		zaposleni.add(z);
	}
	public Zaposleni pretraziZaposlenog(int id) {
		for(Zaposleni z : zaposleni) {
			if(z.getId() == id) {
				return z;
			}
		}
		return null;
	}
	public ArrayList<ObracunPlate> generisiObracun(String mjesec, int godina){
		ArrayList<ObracunPlate> obracuni = new ArrayList<>();
		System.out.println("MJESECNI OBRACUN PLATA ZA " + mjesec + " " + godina);
		System.out.printf("%-5s %-15s %-15s %-10s %-10s %-30s %-10s\n",
				"ID",
				"Ime",
				"Prezime",
				"Tip",
				"Sati",
				"Napomena",
				"Iznos");
		for(Zaposleni z : zaposleni) {
				double iznos = z.izracunajPlatu();
				String napomena = z.getDodatno();
				ObracunPlate o = new ObracunPlate(mjesec, godina, z , napomena);
				o.prikazi();
				obracuni.add(o);
		}
		return obracuni;
	}
	public double ukupniTrosak (ArrayList<ObracunPlate> obracuni) {
		double suma = 0;
		for(ObracunPlate o : obracuni) {
			suma += o.getIznos();
		}
		return suma;
	}

}
