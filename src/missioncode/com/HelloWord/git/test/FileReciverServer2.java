package missioncode.com.HelloWord.git.test;

import java.util.concurrent.CountDownLatch;

public class FileReciverServer2 implements Runnable {

	CountDownLatch latch;
	

	public FileReciverServer2(CountDownLatch latch) {
		super();
		this.latch =latch;
	}

	@Override
	public void run() {
		
		try {
			
			Thread.sleep(1000);
			System.out.println("Server- 2");
			Integer.parseInt("XYZ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();

	}

	
}
