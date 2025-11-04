package zadaci2;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class prvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter # of second to countdown from: ");
		int response = sc.nextInt();
		
		
		
		Timer t =new Timer();
		TimerTask task = new TimerTask() {
			
			int count = response;
			@Override
			public void run() {
				System.out.println(count);
				count--;
				if(count<0) {
					System.out.println("HAPPY NEW YEAR");
					t.cancel();
				}
			}
		};
		t.schedule(task, 0, 1000);

	}

}
