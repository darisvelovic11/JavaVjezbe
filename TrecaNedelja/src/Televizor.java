
public class Televizor {
	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;
	public Televizor(int brojKanala, String nazivKanala, int jacinaTona) {
		if (brojKanala >= 1) this.brojKanala = brojKanala;
		else this.brojKanala = 1;
		if(jacinaTona >= 0 && jacinaTona <= 10)this.jacinaTona = jacinaTona;
		else this.jacinaTona = 5;
		
		}
		
	


	public int getBrojKanala() {
		return brojKanala;
	}




	public void setBrojKanala(int brojKanala) {
		if (brojKanala>=1)this.brojKanala = brojKanala;
		else System.out.println("Broj kanala mora biti ≥ 1.");
	}




	public String getNazivKanala() {
		return nazivKanala;
	}




	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}




	public int getJacinaTona() {
		return jacinaTona;
	}




	public void setJacinaTona(int jacinaTona) {
		if(jacinaTona >= 0 && jacinaTona <= 10)this.jacinaTona = jacinaTona;
		else System.out.println("Jačina tona mora biti između 0 i 10.");

	}
	public void pojacajTon() {
		if (jacinaTona < 10) {
			jacinaTona++;
			} else {
			System.out.println("Ton je već na maksimumu (10).");
	}
	}
	public void ispisi(){
		System.out.println("Kanal " + brojKanala + ": " + nazivKanala +
				", ton: " + jacinaTona);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Televizor tv = new Televizor(1, "RTCG", 5);
			tv.ispisi();
			tv.pojacajTon();
			tv.ispisi();
			tv.setBrojKanala(2);
			tv.setNazivKanala("National Geographic");
			tv.setJacinaTona(11); // pogrešan unos
			tv.ispisi();
			}
			
		

	}


