
public class Automobil extends Vozilo {
    private int brojVrata;
    private String tipMotora;

    public Automobil(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja,
                     int brojVrata, String tipMotora) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja);
        this.brojVrata = brojVrata;
        this.tipMotora = tipMotora;
    }

    public int getBrojVrata() { return brojVrata; }
    public void setBrojVrata(int brojVrata) { this.brojVrata = brojVrata; }

    public String getTipMotora() { return tipMotora; }
    public void setTipMotora(String tipMotora) { this.tipMotora = tipMotora; }

    @Override
    public String prikaziInfo() {
        return super.prikaziInfo() + String.format(", Broj vrata: %d, Tip motora: %s",
                brojVrata, tipMotora);
    }

    @Override
    public int cijenaRegistracije() {
        int cijena = super.cijenaRegistracije();

        if (tipMotora != null && (tipMotora.equalsIgnoreCase("dizel") || tipMotora.equalsIgnoreCase("diesel"))) {
        	cijena += 50;
        }

        return cijena;
    }
}
