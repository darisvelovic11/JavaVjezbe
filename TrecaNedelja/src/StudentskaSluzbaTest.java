class StudentskaSluzba {
	private String ime;
	private String prezime;
	private String indeks;
	private int ocjena1;
	private int ocjena2;
	private int ocjena3;
	
	public static int brojStudenata = 0;
	
	public StudentskaSluzba(String ime ,String prezime,String indeks, int ocjena1, int ocjena2, int ocjena3 ) {
		this.ime = ime;
		this.prezime = prezime;
		this.indeks = indeks;
		this.ocjena1 = ocjena1;
		this.ocjena2 = ocjena2;
		this.ocjena3 = ocjena3;
		
		brojStudenata++;
	}
	public double izracunajProsjek() {
		return(ocjena1 + ocjena2 + ocjena3) / 3.0;
	}
	public boolean imaStipendiju() {
		return izracunajProsjek()>9.0;
	}
	public void ispisiPodatke() {
		 System.out.println(ime + " " + prezime + ", Stipendija: " + (imaStipendiju()?"Da":"Ne"));
	}
	

}

public class StudentskaSluzbaTest{
	public static void main(String[] args) {
			StudentskaSluzba s1 = new StudentskaSluzba("Marko" , "Markovic", "24001", 10,9,10);
			StudentskaSluzba s2 = new StudentskaSluzba("Pero" , "Perovic", "24002", 8,9,10);
			StudentskaSluzba s3 = new StudentskaSluzba("Ivan" , "Ivanovic", "24003", 9,9,10);


			
			s1.ispisiPodatke();
			s2.ispisiPodatke();
			s3.ispisiPodatke();
	        System.out.println("Ukupno studenata: " + StudentskaSluzba.brojStudenata);

			

			
		}
	}



