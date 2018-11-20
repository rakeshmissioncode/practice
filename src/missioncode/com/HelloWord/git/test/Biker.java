package missioncode.com.HelloWord.git.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import javax.management.RuntimeErrorException;

public class Biker  implements Runnable{
	
	private CyclicBarrier checkpoint;

	public Biker(CyclicBarrier checkPoint) {
		this.checkpoint=checkPoint ;
	}

	
	@Override
	public void run() {
		
		
		System.out.println(Thread.currentThread().getName()+" left the Manali");
		try {
			
			
			
			checkpoint.await();
			Integer.parseInt("XYZ");
			
			System.out.println(Thread.currentThread().getName() + " has left checkpoint");
			checkpoint.await();
			System.out.println(Thread.currentThread().getName() + " has left checkpoint");
			
			checkpoint.await();
			System.out.println(Thread.currentThread().getName() + " has reachecd leh");
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
