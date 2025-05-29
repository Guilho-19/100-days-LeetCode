package day001;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
	public static int romanToInt(String s) {
		Map<Character, Integer> romanValues = new HashMap<>();
		
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);
		
		int result = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int current = romanValues.get(s.charAt(i));
			if (i < s.length() - 1 && current < romanValues.get(s.charAt(i + 1))) {
				result -= current;
			} else {
				result += current;
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		String s = "MCMXCIV";
		int result = romanToInt(s);
		
		System.out.println(result);
	}
}
