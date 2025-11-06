
public class Telefoni extends EProizvodi {
	private String operativniSistem;
	private double velicinaEkrana;
	public Telefoni(String opis, String sifra, double uvoznaCijena, String operativniSistem, double velicinaEkrana) {
		super(opis, sifra, uvoznaCijena);
		this.operativniSistem = operativniSistem;
		this.velicinaEkrana = velicinaEkrana;
	}
	public String getOperativniSistem() {return operativniSistem;}
	public void setOperativniSistem(String operativniSistem) {this.operativniSistem = operativniSistem;}
	public double getVelicinaEkrana() {return velicinaEkrana;}
	public void setVelicinaEkrana(double velicinaEkrana) {this.velicinaEkrana = velicinaEkrana;}
	
	@Override
	public double maloprodajnaCijena() {
		double cijena = super.maloprodajnaCijena();
		if(velicinaEkrana>6) cijena*=1.03;
		return cijena;
	
	}
	@Override
	public String toString() {
		return "Telefon : " + super.toString() + ", OS=" + operativniSistem + ", velicinaEkrana=" + velicinaEkrana ;}
	

}
