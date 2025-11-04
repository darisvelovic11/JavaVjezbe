import java.util.Scanner;

public class EvidencijaTemperature {
private double [] temp ;
public EvidencijaTemperature( double [] temp) {
	this.temp = temp;
}
public double[] getTemp() {return temp;}
public void setTemp(double[] temp) {this.temp = temp;}

public double prosjecnaTemperatura(double[] niz) {
	double suma = 0;
	for(double t: niz) {
		suma +=t;
	}
	return suma/niz.length;
}
public double maksimalnaTemperatura(double[] niz) {
	double max = niz[0];
	for(int i = 0; i < niz.length; i++) {
		if(niz[i]> max) {
			max = niz[i];
		}
	}
	return max;}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double[] temp = new double[5];
	for(int i = 0; i < temp.length; i++) {
		 System.out.print("Temperatura " + (i + 1) + ": ");
		 temp[i] = sc.nextDouble();
	}
	EvidencijaTemperature e = new EvidencijaTemperature(temp);
	System.out.println("Broj unesenih temperatura: " + e.getTemp().length);
	 System.out.println("Unesene temperature:");
	 for(double t:e.getTemp()) {
		 System.out.print(t + " ");

	 }
	 System.out.println("\nUnesi temp koju zelis da pretrazis: ");
		double trazena = sc.nextDouble();
		boolean postoji = false;
		
		for(double t: e.getTemp()) {
			if(t == trazena) {
				postoji = true;
				break;
		}

}
		if (postoji) {
			System.out.println("Temperatura " + trazena + " postoji u nizu.");
	 } else { System.out.println("Temperatura " + trazena + " se ne nalazi u nizu.");
	 }
	 int brojNovih = 0;
	 for( double t : e.getTemp()) {
		 if(t != trazena) {
			 brojNovih++;
		 }
	 }
	double [] noviNiz = new double[brojNovih];
	 int j = 0;
	 for( double t : e.getTemp()) {
		 if(t != trazena) {
			 noviNiz[j] = t;
			 j++;
	 }
	 }
	 e.setTemp(noviNiz);
	 System.out.println("\nAžurirani niz temperatura:");
	 for (double t : e.getTemp()) {
		 System.out.print(t + " ");
		
		}
	 
	 System.out.println();
	 // Ispis prosječne i maksimalne temperature
	 System.out.println("\nProsječna temperatura: " +
	e.prosjecnaTemperatura(e.getTemp()));
	 System.out.println("Maksimalna temperatura: " +
	e.maksimalnaTemperatura(e.getTemp()));

	 }
}

	



