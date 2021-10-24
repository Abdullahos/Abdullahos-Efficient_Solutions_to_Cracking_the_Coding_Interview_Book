package Efficient_Solutions_to_Cracking_the_Coding_Interview_Book.CH1ArraysAndString.StringCompress;

public class TestStringCompress {
	public static void main(String[] args) {
		StringCompression sc = new StringCompression();
		String[] test = new String[]{"aaabbaacccccc","abc","aabbcc"};
		for(int i = 0; i<test.length; i++) {
			System.out.println(test[i]+" "+sc.compressString(test[i]));
		}
	}
}
