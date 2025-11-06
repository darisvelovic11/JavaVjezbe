
public class Kuvar extends Zaposleni {
	private final double dodatak = 1500;
	
	public Kuvar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
	}
	@Override
	public double izracunajPlatu() {
		return dodatak + 4 * ukupanBrojSati * plataPoSatu ;
	}
	@Override
	public String getTip() {
		return "Kuvar";
	}
	@Override
	public String getDodatno() {
		return "Fiskni dodatak: " + 1500;
	}

}
