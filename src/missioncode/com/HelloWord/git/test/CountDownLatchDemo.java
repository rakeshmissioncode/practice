package missioncode.com.HelloWord.git.test;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[] args) {
		CountDownLatch countDownLatch= new CountDownLatch(2);
		
		
		Thread count1= new Thread(new FileReciverServer1(countDownLatch));
		Thread count2= new Thread(new FileReciverServer2(countDownLatch));

		count1.start();
		count2.start();
		
		System.out.println(" Receive File Form both Server !!! ---Start");
		try {
			countDownLatch.await();
			
			System.out.println(" Receive File Form both Server !!! ---Done");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
