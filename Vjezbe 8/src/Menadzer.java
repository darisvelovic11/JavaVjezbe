
public class Menadzer extends Zaposleni{
	private double bonus;
	
	public Menadzer(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double bonus) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
		this.bonus = bonus;
	}
	@Override
	public double izracunajPlatu() {
		return 1300 + 4*ukupanBrojSati + bonus;
	}
	@Override
	public String getTip() {
		return "Menadzer";
	}
	@Override
	public String getDodatno() {
		return "Bonus: " + bonus;
	}

}
