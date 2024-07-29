package Interview;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfFibo = scanner.nextInt();
		int first = 0;
		int second = 1;
		int number=0;
		System.out.println(first);
		System.out.println(second);
		for(int i=3;i<=numberOfFibo;i++) {
			number = first+ second;
			System.out.println(number);
			first = second;
			second = number;
		}
		
	}
	

}
