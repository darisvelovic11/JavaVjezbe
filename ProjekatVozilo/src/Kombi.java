
public class Kombi extends Vozilo {
    private int brojPutnika;

    public Kombi(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int brojPutnika) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja);
        this.brojPutnika = brojPutnika;
    }

    public int getBrojPutnika() { return brojPutnika; }
    public void setBrojPutnika(int brojPutnika) { this.brojPutnika = brojPutnika; }

    @Override
    public String prikaziInfo() {
        return super.prikaziInfo() + String.format(", Broj putnika: %d", brojPutnika);
    }

    @Override
    public int cijenaRegistracije() {
        int cijena = super.cijenaRegistracije();

        if (this.brojPutnika > 8) {
        	cijena += 30;
        }

        return cijena;
    }
}

