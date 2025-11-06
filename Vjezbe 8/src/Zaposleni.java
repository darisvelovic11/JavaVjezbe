public abstract class Zaposleni {
	protected int id;
	protected String ime;
	protected String prezime;
	protected double plataPoSatu;
	protected double ukupanBrojSati;
	
	public Zaposleni(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
	}
	public int getId() { return id; }
    public String getIme() { return ime; }
    public String getPrezime() { return prezime; }
    public double getUkupanBrojSati() { return ukupanBrojSati; }

    public abstract double izracunajPlatu();
    public abstract String getTip();
    public abstract String getDodatno();
    


}
