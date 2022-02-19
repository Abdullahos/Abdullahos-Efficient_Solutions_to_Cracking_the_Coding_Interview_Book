package Efficient_Solutions_to_Cracking_the_Coding_Interview_Book.CH1ArraysAndString.StringCompress;

public class StringCompression {
	public String compressString(String s) {
		int i = 0;
		int j = 0;
		int counter;	//count repetition for each series of a letter
		StringBuilder sb = new StringBuilder();	//to get ride of the time and space complexity if we use the String
		while(i<s.length()) {
			j++;
			counter = 1;
			//search with the letter at i till not equal or end of String(which occures first)
			while(j<s.length() && s.charAt(i) == s.charAt(j)) {
				j++;
				counter++;
			}
			//compose the new format with the first letter of each duplication (char at i) and its repetitions(counter)
			sb.append(s.charAt(i)+""+counter);
			//NOT at end
			if(j<s.length())	i = j;
			//at end
			else break;
		}
		//return the original string if its length is smaller than or equal to the result
		if(sb.length()>=s.length())	return s;
		return String.valueOf(sb);
	}
}
