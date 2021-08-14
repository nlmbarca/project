package tasks;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a number");
		num=scan.nextInt();
		boolean prime = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				prime = true;
				break;
			}
		}
		if (!prime)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}
