import java.util.Scanner;

public class treci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite rijec: ");
		String rijec = sc.nextLine();
		
		boolean nadjeno = false;
		
		for(int i = 0; i < rijec.length()-1; i++) {
			if(rijec.charAt(i) == rijec.charAt(i+1)) {
				System.out.println("Prvi par ponovljenih slova je: " + rijec.charAt(i) + rijec.charAt(i+1));
				nadjeno = true;
				break;
			}
		
		}
		
			
		}
	}


