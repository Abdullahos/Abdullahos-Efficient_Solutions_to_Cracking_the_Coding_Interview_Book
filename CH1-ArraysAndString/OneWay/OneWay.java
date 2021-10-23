package Efficient_Solutions_to_Cracking_the_Coding_Interview_Book.OneWay;

public class OneWay {
	public boolean oneWayChecker(String s1, String s2) {
		//comparing lengths
		if(Math.abs(s1.length()-s2.length())>2)	return false;
		//get the smaller length to know what the common max length to stop at.
		int length = s1.length()>s2.length()? s2.length() : s1.length();
		//indication if this is the first edit time or not.
		boolean everEdit = false;
		int i = 0;
		int j = 0;
		
		while(i<length) {
			if(s1.charAt(i) != s2.charAt(j)) {
				if(everEdit)	return false;
				everEdit = true;
				//if it's remove not replacement, then we need the second pointer(j) to be at the current position for the next time.
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
