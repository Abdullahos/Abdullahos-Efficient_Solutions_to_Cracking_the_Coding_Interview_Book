package is_unique;

public class TestInsUnique {
	public static void main(String[] args){
		IsUnique u = new IsUnique();
		String[] s = new String[]{"abc","aaa","aab",""};
		for(String w : s){
			System.out.println(w+" "+u.isUnique(w));
		}
	}
}
