
public class ObracunPlate {
	private String mjesec;
	private int godina;
	private Zaposleni zaposleni;
	private double iznos;
	private String napomena;
	
	public ObracunPlate(String mjesec, int godina, Zaposleni zaposleni, String napomena) {
		this.mjesec = mjesec;
		this.godina = godina;
		this.zaposleni = zaposleni;
		this.iznos = zaposleni.izracunajPlatu();
		this.napomena = napomena;
	}
	public void prikazi() {
		System.out.printf("%-5d %-15s %-15s %-10s %-10.2f %-30s %-10.2f€\n",
                zaposleni.getId(),
                zaposleni.getIme(),
                zaposleni.getPrezime(),
                zaposleni.getTip(),
                zaposleni.getUkupanBrojSati(),
                napomena,
                iznos);
	}
	public double getIznos() {
		return iznos;
	}

}
