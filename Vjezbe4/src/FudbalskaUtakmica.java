import java.util.Scanner;

public class FudbalskaUtakmica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int[] posjete = new int[10];
		
		System.out.println("Unesi posjete : ");
		for(int  i = 0; i < posjete.length; i++) {
            System.out.print("Dan " + (i + 1) + ": ");
            posjete[i] = sc.nextInt();}
		
		int max = posjete[0];
		for(int  i = 1; i < posjete.length; i++) {
			if (posjete[i] > max) {
                max = posjete[i];
            }
        }

        
        System.out.println("Najviše poseta u jednom danu bilo je: " + max);

        sc.close();
		
		
	
		

		
		
		
		
		}
			
		
		
	}


