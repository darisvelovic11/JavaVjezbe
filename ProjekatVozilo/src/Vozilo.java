
public class Vozilo {
    private String proizvodjac;
    private int godinaProizvodnje;
    private int kubikaza; 
    private String boja;

    protected static final int OSNOVNA_CIJENA = 100;

    public Vozilo(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja) {
        this.proizvodjac = proizvodjac;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kubikaza = kubikaza;
        this.boja = boja;
    }

    public String getProizvodjac() { return proizvodjac; }
    public void setProizvodjac(String proizvodjac) { this.proizvodjac = proizvodjac; }

    public int getGodinaProizvodnje() { return godinaProizvodnje; }
    public void setGodinaProizvodnje(int godinaProizvodnje) { this.godinaProizvodnje = godinaProizvodnje; }

    public int getKubikaza() { return kubikaza; }
    public void setKubikaza(int kubikaza) { this.kubikaza = kubikaza; }

    public String getBoja() { return boja; }
    public void setBoja(String boja) { this.boja = boja; }

    public String prikaziInfo() {
        return String.format("Proizvodjac: %s, Godina: %d, Kubikaza: %dKS, Boja: %s",
                proizvodjac, godinaProizvodnje, kubikaza, boja);
    }

    public int cijenaRegistracije() {
        int cijena = OSNOVNA_CIJENA;

        if (this.godinaProizvodnje < 2010) {
            cijena += 30;
        }

        if (this.kubikaza > 2000) {
        	cijena += 20;
        }

        return cijena;
    }
}

