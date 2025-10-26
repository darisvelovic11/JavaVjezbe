import java.util.Scanner;

public class peti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite prvu rijec: ");
		String rijec1 = sc.nextLine();
		
		System.out.print("Unesite drugu rijec: ");
		String rijec2 = sc.nextLine();
		
		if(rijec1.toLowerCase().contains(rijec2.toLowerCase())) {
			System.out.println("Druga rijec je substring prve rijeci.");
		} else {
			System.out.println("Druga rijec NIJE substring prve rijeci.");
		}
		
		
	}

}
