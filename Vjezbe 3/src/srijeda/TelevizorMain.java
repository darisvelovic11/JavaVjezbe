package srijeda;
class Televizor {
	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;

	
		//PRVI ZADATAK NA ISPIT PROSLE GODINE
		public Televizor(int brojKanala,String nazivKanala , int jacinaTona) {
			
			this.nazivKanala = nazivKanala;
			
			if(brojKanala>=1) this.brojKanala = brojKanala;
			else this.brojKanala = 1;
			if(jacinaTona >= 0 && jacinaTona<= 10) {
				this.jacinaTona = jacinaTona;}
			
			
			
			else {
				this.jacinaTona = 5;}
			}
			
			//GETTERI
			public int getBrojKanala() {return brojKanala;}
			public String getNazivKanala() {return nazivKanala;}
			public int getJacinaTona() { return jacinaTona; }
			
			//SETTERI
			public void setBrojKanala(int brojKanala) {
				if (brojKanala >= 1)
					this.brojKanala = brojKanala;
				else
					this.brojKanala = 1;
					
			}
			
			//METOD ZA POJACIVANJE TONA
			public void pojacajTon() {
				if(jacinaTona <10) {
					jacinaTona++;
			}
				else {
					System.out.println("Jacina tona je na 10");
				}
			}
			public void ispisi(){
				System.out.println("Kanal " +brojKanala +  " : " + nazivKanala + " , ton " + jacinaTona);
			}
			
			
				

			
			
		}

public class TelevizorMain {

	public static void main(String[] args) {
		Televizor tv = new Televizor(5," ID Extra ", 6);
		
		tv.pojacajTon();
		tv.ispisi();
		
	}

}
