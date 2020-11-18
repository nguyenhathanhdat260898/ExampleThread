package Homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread2 extends Thread {
	List<Character> list2 = new ArrayList<>();
	Random random = new Random();

	@Override
	public void run() {
		int min = (int) 'a';
		int max = (int) 'z';
		int limit = max - min;
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			int rad = random.nextInt(limit) + min;
			char c = (char) rad;
			list2.add(c);
			System.out.println("t2 : " + c);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
