import java.util.ArrayList;
import java.util.Scanner;

public class Deveti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite duzinu niza a: ");
		int duzA = sc.nextInt();
		
		int[] a = new int[duzA];
		for(int i=0; i<a.length; i++) {
			System.out.print("Unesite " + (i+1) + ". element niza a: ");
			a[i] = sc.nextInt();
		}
		System.out.print("Unesite duzinu niza b: ");
		int duzB = sc.nextInt();
		int[] b = new int[duzB];
		for(int j=0; j<b.length; j++) {
			System.out.print("Unesite " + (j+1) + ". element niza b: ");
			b[j] = sc.nextInt();
		}
		ArrayList<Integer> zajednicki = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i] == b[j] && !zajednicki.contains(a[i])) {
					zajednicki.add(a[i]);
				}
			}
		}
		System.out.println("Zajednicki elementi nizova a i b su: " + zajednicki);
		
		
		
	}

}
