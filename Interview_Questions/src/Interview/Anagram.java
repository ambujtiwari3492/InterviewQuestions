package Interview;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String first = "Silen";
		String second = "listen";
		String s1 = first.replaceAll("//s", "");
		String s2= second.replaceAll("//s","");
		boolean flag = true;
		if(s1.length()!=s2.length())
			flag  = false;
		char [] ch1 = s1.toLowerCase().toCharArray();
		char [] ch2 = s2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(!Arrays.equals(ch1, ch2)) {
			flag = false;
		}
		if(flag) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not a Anagram");
		}

	}

}
