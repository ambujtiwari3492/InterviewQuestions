package Interview;

public class Factorial {

	public static void main(String[] args) {
		int number = 4;
		int factorial = 1;
		for(int i=number;i>0;i--) {
			factorial*=i;
		}
		System.out.println(factorial);

	}

}
