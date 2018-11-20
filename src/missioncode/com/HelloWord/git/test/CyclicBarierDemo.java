package missioncode.com.HelloWord.git.test;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarierDemo {

	public static void main(String[] args) {
		
		
		final CyclicBarrier checkPoint= new CyclicBarrier(4, new Runnable() {
			
			@Override
			public void run() {
				System.out.println(" All Biker arrive check Point.");
				
			}
		});
		
		Thread biker1= new Thread(new Biker(checkPoint), "Thread-1 Biker");
		Thread biker2= new Thread(new Biker(checkPoint), "Thread-2 Biker");
		Thread biker3= new Thread(new Biker(checkPoint), "Thread-3 Biker");
		Thread biker4= new Thread(new Biker(checkPoint), "Thread-4 Biker");
		biker1.start();
		biker2.start();
		biker3.start();
		biker4.start();
		
		
	}

}
