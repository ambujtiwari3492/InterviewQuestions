package Interview;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		StringBuffer sb= new StringBuffer(s);
		StringBuffer reverse = sb.reverse();
		String reverseStr = reverse.toString();
		if(reverseStr.equals(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		

	}

}
