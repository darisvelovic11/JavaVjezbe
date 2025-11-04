import java.util.Scanner;

public class Trkaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*U ovom zadatku staza je prsten između krugova sa centrom (cx
, cy) i poluprečnicima
R1<R2
. Unosi se N tačaka (xi
,yi). Potrebno je prebrojati trkače koji su u prstenu
uključujući granice i u gornjoj poluravni yi≥cy
. Takođe je potrebno izračunati
najudaljenijeg trkačima od centra, po euklidskom rastojanju*/
		Scanner sc = new Scanner(System.in);
		double cx = sc.nextDouble();
		double cy = sc.nextDouble();
		double R1 = sc.nextDouble();
		double R2 = sc.nextDouble();
		int N = sc.nextInt();
		double R1sq = R1 *R1;
		double R2sq = R2 *R2;
		int ringUpper = 0;
		
		double maxDistSq = - 1.0;
		double farX = 0.0 , farY = 0.0;
		for( int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double dx = x - cx;
			double dy = y - cy;
			double d2 = dx * dx + dy * dy;
			
			// U prstenu (uključujući granice) i u gornjoj
			//poluravni (y >= cy)

			if(d2 >= R1sq && d2<= R2sq && y >= cy) {
				ringUpper++;
				
			}
			//Najudaljeniji od centra
			if(d2 > maxDistSq) {
				maxDistSq = d2;
				farX = x;
				farY = y;
				
			}
		}
		
		System.out.println(ringUpper);
		System.out.printf("%.6f %.6f %.6f%n", farX, farY,
		Math.sqrt(maxDistSq));

	}

}
