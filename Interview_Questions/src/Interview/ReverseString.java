package Interview;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String [] args) {
	
	Scanner scanner = new Scanner(System.in);
	String  str = scanner.next();
	StringBuilder sb = new StringBuilder(str);
	StringBuilder reverse = sb.reverse();
	String reverseStr = reverse.toString();
	System.out.println(reverseStr);
	}
}
