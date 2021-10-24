package is_unique;

public class TestIsUniqueWithoutExtraDataStructure {
	public static void main(String[] args){
		IsUniqueWithoutExtraDataStrucutre u = new IsUniqueWithoutExtraDataStrucutre();
		String[] s = new String[]{"abc","aaa","aab",""};
		for(String w : s){
			System.out.println(w+" "+u.isUnique(w));
		}
	}
}
