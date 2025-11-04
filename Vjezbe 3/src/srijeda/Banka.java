package srijeda;
class BankovniRacun {
	private String imeVlasnika;
	private double stanje;
	
	public BankovniRacun(String imeVlasnika , double stanje) {
		this.imeVlasnika = imeVlasnika;
		if(stanje>=0) {
			this.stanje = stanje;
		}
		else {
			this.stanje = 0;
		}
		
	}

	public String getImeVlasnika() {
		return imeVlasnika;
	}

	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}

	public double getStanje() {
		return stanje;
	}

	public void setStanje(double stanje) {
		if(stanje>=0) {
			this.stanje = stanje;
		}
		else {
			this.stanje = 0;
		}
		
	}
	public void uplati(double iznos) {
		stanje+=iznos;
	}
	public void isplati(double iznos) {
		if(stanje - iznos >=0) {
			stanje-=iznos;
		}
		else {
			stanje = 0;
		}
	}
	public void ispisi() {
		System.out.printf("Stanje na racunu je %.2f" , stanje);
	
	}


}
class Transakcija {
	private double iznos;
	private String tip;
	private String opis;
	
	public Transakcija (double iznos, String tip ,  String opis) {
		if(iznos>= 0 )
			this.iznos = iznos;
		else
			this.iznos = 0;
		
		this.tip = tip;
		this.opis = opis;
		
	}

	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		if(iznos>= 0 )
			this.iznos = iznos;
		else
			this.iznos = 0;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}
	public  boolean jeUplata() {
		return tip.equalsIgnoreCase("Uplata");
	}
	
	

}


public class Banka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankovniRacun b = new BankovniRacun("Djina" , 3000.00);
		Transakcija t1 = new Transakcija(1500, "Uplata" , "Plata");
		Transakcija t2 = new Transakcija(500, "Isplata" , "Pretplata");
		if(t1.jeUplata()) {
			b.uplati(t1.getIznos());
		}
		else {
			b.isplati(t1.getIznos());
		}
		if(t2.jeUplata()) {
			b.uplati(t2.getIznos());
		}
		else {
			b.isplati(t2.getIznos());
		}
		System.out.printf("Djinino konačno stanje računa: %.2f eura %n", b.getStanje());

}	
}
