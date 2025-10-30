
public class Kamion extends Vozilo {
    private double kapacitetTereta; 
    private boolean prikolica;

    public Kamion(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja,
                  double kapacitetTereta, boolean prikolica) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja);
        this.kapacitetTereta = kapacitetTereta;
        this.prikolica = prikolica;
    }

    public double getKapacitetTereta() { return kapacitetTereta; }
    public void setKapacitetTereta(double kapacitetTereta) { this.kapacitetTereta = kapacitetTereta; }

    public boolean isPrikolica() { return prikolica; }
    public void setPrikolica(boolean prikolica) { this.prikolica = prikolica; }

    @Override
    public String prikaziInfo() {
        return super.prikaziInfo() + String.format(", Kapacitet tereta: %.2f t, Prikolica: %s",
                kapacitetTereta, prikolica ? "da" : "ne");
    }

}
