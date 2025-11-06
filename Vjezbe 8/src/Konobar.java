
public class Konobar extends Zaposleni {
	private double prekovremeniSati;
	
	public Konobar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double prekovremeniSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
		this.prekovremeniSati = prekovremeniSati;
	}
	@Override
	public double izracunajPlatu() {
		double sedmicnaPlata = ukupanBrojSati * plataPoSatu + prekovremeniSati * plataPoSatu * 1.2;
		return 4*sedmicnaPlata;
	}

	@Override
	public String getTip() {
		return "Konobar";
	}
	@Override
	public String getDodatno() {
		return "Prekovremeni sati: " + prekovremeniSati;
	}
}
