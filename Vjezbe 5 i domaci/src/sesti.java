import java.util.Scanner;

public class sesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite prvu rijec: ");
		String rijec1 = sc.nextLine();
		
		System.out.print("Unesite drugu rijec: ");
		String rijec2 = sc.nextLine();
		
		String jesu_isti = rijec1.equalsIgnoreCase(rijec2)?"Isti su.":"Nisu isti.";
		System.out.println(jesu_isti);
		

	}

}
