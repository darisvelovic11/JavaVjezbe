import java.util.ArrayList;

class Auto {
    private String markaAuta;
    private int godisteAuta;
    private float snaga_motora;
    public boolean prodato;
    private float kubikaza;
    private boolean registrovan;
    private static int brojProdatih = 0;
    
    public Auto(String markaAuta, int godisteAuta, float snaga_motora,boolean prodato, float kubikaza, boolean registrovan) {
        this.markaAuta = markaAuta;
        this.godisteAuta = godisteAuta;
        this.snaga_motora = snaga_motora;
        this.kubikaza = kubikaza;
        this.registrovan = godisteAuta < 1985 ? false : registrovan;
        this.prodato = false;
        if (prodato) brojProdatih++;
    }

    public String getMarkaAuta() { return markaAuta; }
    public void setMarkaAuta(String markaAuta) { this.markaAuta = markaAuta; }

    public int getGodisteAuta() { return godisteAuta; }
    public void setGodisteAuta(int godisteAuta) {
        if (godisteAuta >= 2025) {
            System.out.print("Jos nijesmo stigli do te godine");
            return;
        }
        this.godisteAuta = godisteAuta;
        if (godisteAuta < 1985) this.registrovan = false;
    }

    public float getSnaga_motora() { return snaga_motora; }
    public void setSnaga_motora(float snaga_motora) { this.snaga_motora = snaga_motora; }

    public boolean jeProdato() { return prodato; }
    public void setProdato(boolean prodato) {
        if (this.prodato != prodato && prodato) brojProdatih++;
        this.prodato = prodato;
    }

    public float getKubikaza() { return kubikaza; }
    public void setKubikaza(float kubikaza) { this.kubikaza = kubikaza; }

    public boolean jeRegistrovan() { return registrovan; }
    public void setRegistrovan(boolean registrovan) {
        if (this.godisteAuta >= 1985) this.registrovan = registrovan;
    }

    public static int getBrojProdatih() { return brojProdatih; }
    public static void setBrojProdatih(int brojProdatih) { Auto.brojProdatih = brojProdatih; }

    public boolean mozeSeRegistrovat() {
        return godisteAuta >= 1985;
    }

    public static double koeficijentZaGodiste(int godiste) {
        if (godiste < 1985) return 0.0;
        if (godiste <= 2000) return 3.0;
        if (godiste <= 2010) return 2.0;
        return 1.5;
    }

    public double cijenaRegistracije() {
        if (!mozeSeRegistrovat()) return 0.0;
        return koeficijentZaGodiste(godisteAuta) * kubikaza * snaga_motora;
    }

    @Override
    public String toString() {
        return String.format(
            "Auto [marka=%s , godiste=%d, snaga=%.1f, kubikaza=%.1f , registrovan=%s , prodato=%s , cijenaReg=%.2f]",
            markaAuta, godisteAuta, snaga_motora, kubikaza,
            registrovan ? "da" : "ne",
            prodato ? "da" : "ne",
            cijenaRegistracije());
    }
}
class AutoServis {
	public static ArrayList<Auto> neregistrovanikojisemoguregistrovati(ArrayList<Auto> listaAuta) {
		ArrayList<Auto> lista = new ArrayList<>();
		for (Auto a : listaAuta) {
			if (!a.jeRegistrovan() && !a.mozeSeRegistrovat()) {
				lista.add(a);
			}
		}
		return lista;
}
public static double ukupnaRegistracija(ArrayList<Auto> listaAuta) {
	double suma = 0;
	for (Auto a : listaAuta) {
		suma += a.cijenaRegistracije();
	}
	return suma;
}
}


public class TestAuto {

	public static void main(String[] args) {
		ArrayList<Auto> auta = new ArrayList<>();
		Auto a1 = new Auto("VW Golf 3", 1995, 55,true, 1600, false);
		auta.add(a1);
		auta.add(new Auto("BMW 320d", 2020, 140,false, 1995, false));
		for (Auto a : AutoServis.neregistrovanikojisemoguregistrovati(auta)) {
			System.out.println(a);
		}
		System.out.println(auta);
	}
}


