package is_unique;

public class IsUniqueWithoutExtraDataStrucutre {
	public boolean isUnique(String s) {
		for(int i = 0 ; i< s.length()-1; i++) {
			for(int j = i+1; j <s.length(); j++) {
				if(s.charAt(i)==s.charAt(j))	return false;
			}
		}
		return true;
	}
}
//space complexity is O(1)
//time complexity is O(n^2)