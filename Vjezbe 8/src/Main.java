import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<EProizvodi> proizvodi = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n-----------------------------------------------");
            System.out.println("1. Unos uredjaja");
            System.out.println("2. Pregled svih uredjaja sa maloprodajnom cijenom");
            System.out.println("3. Pregled uredjaja odredjenog tipa");
            System.out.println("4. Izlaz");
            System.out.print("Izaberite opciju: ");
            int izbor = sc.nextInt();
            System.out.println("\n-----------------------------------------------");

            sc.nextLine(); 

            switch (izbor) {
                case 1:
                    System.out.print("Unesi opis tipa uredjaja: ");
                    String opis = sc.nextLine();

                    System.out.print("Unesi sifru uredjaja (RA/TE/TV): ");
                    String sifra = sc.nextLine();

                    System.out.print("Unesi uvoznu cijenu: ");
                    double uvoznaCijena = sc.nextDouble();
                    sc.nextLine(); 

                    if (sifra.startsWith("RA")) {
                        System.out.print("Unesi procesor: ");
                        String procesor = sc.nextLine();
                        System.out.print("Unesi memoriju (GB): ");
                        int memorija = sc.nextInt();
                        sc.nextLine();
                        proizvodi.add(new Racunari(opis, sifra, uvoznaCijena, procesor, memorija));
                    } else if (sifra.startsWith("TE")) {
                        System.out.print("Unesi operativni sistem: ");
                        String os = sc.nextLine();
                        System.out.print("Unesi velicinu ekrana (inča): ");
                        double velicinaEkrana = sc.nextDouble();
                        sc.nextLine();
                        proizvodi.add(new Telefoni(opis, sifra, uvoznaCijena, os, velicinaEkrana));
                    } else if (sifra.startsWith("TV")) {
                        System.out.print("Unesi velicinu ekrana (inča): ");
                        double velicinaEkrana = sc.nextDouble();
                        sc.nextLine();
                        proizvodi.add(new TV(opis, sifra, uvoznaCijena, velicinaEkrana));
                    } else {
                        System.out.println("Nepoznata sifra uredjaja.");
                    }
                    break;

                case 2:
                    System.out.println("\n SVI UREĐAJI");
                    for (EProizvodi p : proizvodi) {
                        System.out.println(p + ", maloprodajna cijena: " + p.maloprodajnaCijena());
                    }
                    break;

                case 3:
                    System.out.print("Unesite tip uredjaja (RA/TE/TV): ");
                    String tip = sc.nextLine();
                    System.out.println("\nUređaji tipa " + tip );
                    for (EProizvodi p : proizvodi) {
                        if (p.getSifra().startsWith(tip)) {
                            System.out.println(p);
                        }
                    }
                   break;

                case 4:
                    System.out.println("Izlaz iz programa");
                    sc.close();
                    return;

                default:
                    System.out.println("Pogrešan izbor!");
            }
        }
    }
}
