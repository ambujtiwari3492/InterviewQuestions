package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		HashMap<Character,Integer> map = new HashMap<>();
		HashMap<Character,Integer> map1 = new HashMap<>();
		char[] ch = s1.toCharArray();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		for(Map.Entry<Character,Integer> mapSet : map.entrySet())
		{
			System.out.println(mapSet.getKey()+" "+mapSet.getValue());
		}
		
		char [] ch2 = s2.toCharArray();
		for(char c:ch2) {
			if(map1.containsKey(c)) {
				map1.put(c,map1.get(c)+1);
			}
			else {
				map1.put(c,1);
			}
		}
		for(Map.Entry<Character,Integer> mapSet : map1.entrySet())
		{
			System.out.println(mapSet.getKey()+" "+mapSet.getValue());
		}
		
		
	}

}
