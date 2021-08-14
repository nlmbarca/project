package tasks;

public class Task6 {

	public static void main(String[] args) {
		int a = 0, b = 1, sum;

		for (int i = 0; i < 10; i++) {
			System.out.println(a + b);
			sum= a + b;
			a = b;
			b = sum;

		}
	}
}