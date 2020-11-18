package Homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread1 extends Thread {
	List<Integer> list1 = new ArrayList<>();
	Random random = new Random();
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int rad = random.nextInt(100);
			list1.add(rad);
			System.out.println("T1: " + rad);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
