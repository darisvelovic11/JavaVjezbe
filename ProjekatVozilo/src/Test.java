
public class Test {
    public static void main(String[] args) {
        Automobil a1 = new Automobil("BMW", 2007, 1800, "plava", 4, "benzin");
        Automobil a2 = new Automobil("Renault", 2018, 2200, "siva", 5, "dizel");
        Kamion k1 = new Kamion("Scania", 2005, 5000, "crvena", 12.5, true);
        Kombi kombi1 = new Kombi("Mercedes", 2012, 2500, "bijela", 9);

        Vozilo[] vozila = {a1, a2, k1, kombi1};

        for (Vozilo v : vozila) {
            System.out.println("-----");
            System.out.println(v.prikaziInfo());
            System.out.println("Ukupna cijena registracije: " + v.cijenaRegistracije() + " EUR");
        }
    }
}
