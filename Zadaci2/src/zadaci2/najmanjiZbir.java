package zadaci2;

import java.util.Scanner;

public class najmanjiZbir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int p3 = sc.nextInt();
		
		int s1 = p1 + p2;
		int s2 = p1 + p3;
		int s3 = p3 + p2;
		
		int minSum = s1;
		String par = "P1 i P2";
		
		if (s2<minSum) {
			par = "P1 i P3";
			minSum = s2;
		}
		if(s3<minSum) {
			par = "P3 i P2";
			minSum = s3;
		}
		System.out.printf("Najjeftinijii par je %s , sa sumom od %d ", par, minSum);

}
}
