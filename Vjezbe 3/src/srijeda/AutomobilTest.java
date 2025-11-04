package srijeda;
class Automobil {
	private String marka;
	private String model;
	private int godiste;
	private int brzina;
	
	public Automobil(String marka, String model, int godiste , int brzina  ) {
		this.marka = marka;
		this.model = model;
		if(godiste > 0) {
		this.godiste = godiste;}
		else {
			System.out.println("Niste unijeli validnu godinu");
			
		}
		if(brzina >= 0 && brzina <=200) {
			this.brzina = brzina;
		}
		else {
			System.out.println("Brzina ne smije preci 200");
			this.brzina = 0;
		}
		
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public int getBrzina() {
		return brzina;
	}

	public void setBrzina(int brzina) { 
		if(brzina >= 0 && brzina <=200) 
			this.brzina = brzina;
	}
	public void ubrzaj(int ubrzanje) {
		if(brzina + ubrzanje <= 200) {
			brzina+=ubrzanje;
		}else {
			brzina = 0;
		}
		}
		public void uspori(int usporenje) {
			if(brzina -  usporenje > 0) {
				brzina-=usporenje;
			}else {
				brzina = 0;
			}
	
		
	}
		public void ispisi() {
			System.out.printf("Automobil %s %s ( %d )ide brzinom od %d km/h.",marka,model,godiste,brzina);
		}

}


public class AutomobilTest {

	public static void main(String[] args) {
		Automobil a = new Automobil("Audi" , "TT" , 2023 , 150);
		a.ubrzaj(40);
		a.uspori(20);
		a.ispisi();
	}

}
