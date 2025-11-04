
public class Zaposleni {
	private String ime;
	private String prezime;
	private int godineStaza;
	private double plata;
	public Zaposleni(String ime , String prezime , int godine_staza , double plata) {
		if (godine_staza >= 0) this.godineStaza = godine_staza;
		else System.out.print("Ne mozete imati negativni godine staza");
		if (plata >= 0) this.plata = plata;
		else System.out.print("Ne mozete imati negativnu platu");
		this.ime = ime;
		this.prezime = prezime;
		
		
		
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodineStaza() {
		return godineStaza;
		
	}
	public void setGodineStaza(int godine_staza) {
		if (godineStaza >= 0) this.godineStaza = godineStaza;
		else {
			System.out.print("Ne mozete imati negativni godine staza");
		}
	}
	public double getPlata() {
		return plata;
	}
	public  void setPlata(double plata) {
		if (plata >= 0) this.plata = plata;
		else System.out.print("Ne mozete imati negativnu platu");
		
	}
	public void ispisi() {
		System.out.println(ime + " " + prezime + ", godine staža: " +
				godineStaza + ", plata: " + plata);
	}
	public void provjeriIPovecajPlatuAkoTreba() {
		if (plata < 800 && godineStaza > 10) {
		double stara = plata;
		plata = plata * 1.06;
		System.out.println(ime + " " + prezime + ": plata povećana sa " + stara + " na " + plata);

	
		}
	}
	public static void main(String[] args) {
		Zaposleni z1 = new Zaposleni("Ana", "Markovic", 5, 750);
		Zaposleni z2 = new Zaposleni("Marko", "Jovanovic", 12, 790);
		// Ispis početnih vrijednosti
		z1.ispisi();
		z2.ispisi();
		// Test settera
		z1.setPlata(770);
		z2.setGodineStaza(15);
		// Primjena pravila za povećanje
		z1.provjeriIPovecajPlatuAkoTreba();
		z2.provjeriIPovecajPlatuAkoTreba();
		// Ispis poslije promjena
		z1.ispisi();
		z2.ispisi();

}}
