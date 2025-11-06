
public class Racunari extends EProizvodi {
	private String procesor;
	private int memorija;
	public Racunari(String opis, String sifra, double uvoznaCijena, String procesor, int memorija) {
		super(opis, sifra, uvoznaCijena);
		this.procesor = procesor;
		this.memorija = memorija;
	}
	public String getProcesor() {return procesor;}
	public void setProcesor(String procesor) {this.procesor = procesor;}
	public int getMemorija() {return memorija;}
	public void setMemorija(int memorija) {this.memorija = memorija;}
	
	@Override
	public double maloprodajnaCijena() {
		double cijena = super.maloprodajnaCijena();
		cijena *=1.05;
		return cijena;
	
	}
	@Override
	public String toString() {
		return "Racunar : " + super.toString() + ", procesor=" + procesor + ", memorija=" + memorija ;}
	

}
