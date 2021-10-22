package Efficient_Solutions_to_Cracking_the_Coding_Interview_Book.OneWay;

public class OneWay {
	public boolean oneWayChecker(String s1, String s2) {
		if(Math.abs(s1.length()-s2.length())>2)	return false;
		int length = s1.length()>s2.length()? s2.length() : s1.length();
		int k = 0;
		int i = 0;
		int j = 0;
		while(i<length) {
			if(s1.charAt(i) != s2.charAt(j)) {
				if(++k != 1)	return false;
				if(s2.length() < s1.length()) j--;
			}
			i++;
			j++;
		}
		return true;
	}
}
//time complexity O(n)
//space complexity	O(1)
