enum Studenti{
	MARKO("Marko Markovic" , 8 , 9 ,9),
	PETAR("Petar Petrovic" , 9 , 9, 9),
	MINA ("Mina Minic" , 8 , 10 , 9),
	DARIS("Daris Velovic",10,10,9),
	NIKOLA("Nikola Jokic",7,7,8);
	
	private String punoIme;
	private int ocjena1;
	private int ocjena2;
	private int ocjena3;
	private Studenti(String punoIme, int ocjena1, int ocjena2, int ocjena3) {
		this.punoIme = punoIme;
		this.ocjena1 = ocjena1;
		this.ocjena2 = ocjena2;
		this.ocjena3 = ocjena3;
	}
	
	public double prosjek() {
		return(ocjena1 + ocjena2 + ocjena3)/3.0;
	}

	public String getpunoIme() {
		return punoIme;
	}
}


public class EnumeracijaStudenti {

	public static void main(String[] args) {
		System.out.println("Studenti i njihov prosjek:");
		for(Studenti s : Studenti.values()) {
			System.out.printf("\n%-15s - prosjek:%.2f " ,s.getpunoIme() , s.prosjek());
		}

	}

}
