package zadaci2;

import java.util.Scanner;

public class broker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Unesi iznos kojim broker raspolaže (N): ");
        double N = sc.nextDouble();

        System.out.print("Unesi jučerašnju cijenu akcije (X): ");
        double X = sc.nextDouble();

        // nova cijena nakon skoka od 15%
        double novaCijena = X * 1.15;

        // koliko akcija broker može kupiti (cijeli broj)
        int brojAkcija = (int) (N / novaCijena);

        if (brojAkcija > 0) {
            System.out.println("Broker može kupiti " + brojAkcija + " akcija po cijeni " + novaCijena + " eura.");
        } else {
            System.out.println("Broker nema dovoljno novca da kupi ni jednu akciju. Nova cijena je " + novaCijena + " eura.");
        }

        sc.close();
    }
}
