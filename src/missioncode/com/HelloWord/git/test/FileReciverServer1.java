package missioncode.com.HelloWord.git.test;

import java.util.concurrent.CountDownLatch;

public class FileReciverServer1 implements Runnable {
	
	CountDownLatch latch;
	

	public FileReciverServer1(CountDownLatch latch) {
		super();
		this.latch =latch;
	}


	@Override
	public void run() {
		System.out.println("Server- 1");
		latch.countDown();
		

	}

}
