package Interview;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class PrimeNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	boolean flag = true;
	for(int i =2;i<number;i++) {
		if(number%i==0) {
			flag = false;
			break;
		}
	}
	if(flag) {
		System.out.println("Prime");
	}
	else {
		System.out.println("Not a Prime");
	}
	}
}
