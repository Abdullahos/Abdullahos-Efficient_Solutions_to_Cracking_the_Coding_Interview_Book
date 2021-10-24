package Efficient_Solutions_to_Cracking_the_Coding_Interview_Book.CheckPermutation;

public class CheckPermutation {
	public boolean checkPermutation(String s1, String s2) {
		char[] c = s1.toCharArray();
		int[] f = new int[128];
		for(char ch : c) {
			f[ch]++;
		}
		
		c = s2.toCharArray();
		for(char ch : c) {
			f[ch]--;
			if(f[ch]<0)	return false;
		}
		return true;
	}
}
//time complexity is O(n), assuming that n is the length of the bigger string(if permutation then the length is equal)
//space complexity is O(1)
