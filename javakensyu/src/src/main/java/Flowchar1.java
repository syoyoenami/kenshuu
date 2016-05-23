package src.main.java;

public class Flowchar1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizzbazz" + i);
			}
			else if (i % 3 == 0) {
				System.out.println("Fizz" + i);
			}
			else if (i % 5 == 0) {
				System.out.println("bazz" + i);
			}
			else
				System.out.println(i);

		}
	}
}