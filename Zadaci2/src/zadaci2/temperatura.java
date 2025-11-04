package zadaci2;

import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Unesi temperaturu vode: ");
		Scanner sc = new Scanner(System.in) ;
		int t = sc.nextInt();

        if (t <= 0) {
            System.out.println("cvrsto");
        } else if (t >= 100) {
            System.out.println("gasovito");
        } else {
            System.out.println("tecno");
        }

	}

}
