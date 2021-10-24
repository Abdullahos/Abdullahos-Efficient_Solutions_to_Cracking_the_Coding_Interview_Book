package Efficient_Solutions_to_Cracking_the_Coding_Interview_Book.CheckPermutation;

public class TestCheckPermutation {
	public static void main(String[] args) {
		CheckPermutation checkPermutation = new CheckPermutation();
		System.out.println(checkPermutation.checkPermutation("abc", "adc"));
		System.out.println(checkPermutation.checkPermutation("abc", "add"));
		System.out.println(checkPermutation.checkPermutation("abc", "cba"));
		System.out.println(checkPermutation.checkPermutation("", ""));
	
	}
}
