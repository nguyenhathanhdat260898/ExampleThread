package Homework4;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Hien thi ket qua t1: ");
		for (int i = 0; i < t1.list1.size(); i++) {
			System.out.print(" " + t1.list1.get(i));
		}
		System.out.println();
		System.out.println("Hien thi ket qua t2: ");
		for (int i = 0; i < t2.list2.size(); i++) {
			System.out.print(" " + t2.list2.get(i));
		}
	}
}
