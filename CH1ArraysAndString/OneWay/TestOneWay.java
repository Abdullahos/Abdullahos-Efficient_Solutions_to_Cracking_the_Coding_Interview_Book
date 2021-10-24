package Efficient_Solutions_to_Cracking_the_Coding_Interview_Book.OneWay;

public class TestOneWay {
	public static void main(String[] args) {
		OneWay o = new OneWay();
		System.out.println(o.oneWayChecker("pale", "ple"));	//true
		System.out.println(o.oneWayChecker("pales","pale"));//true
		System.out.println(o.oneWayChecker("pale","bale"));	//true
		System.out.println(o.oneWayChecker("pale","bake"));	//false
		System.out.println(o.oneWayChecker("pale","pale"));	//true
	}
}
