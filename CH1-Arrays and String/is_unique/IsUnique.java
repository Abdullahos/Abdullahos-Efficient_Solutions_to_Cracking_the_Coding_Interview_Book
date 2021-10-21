package is_unique;
/**
we first should ask the interviewer if all the characters 're ascii not unicode
this solution if using additional dataStructures 're allowed(String is a datastrucure)
*/
public class IsUnique{
public boolean isUnique(String s){
	if(s.length()>128)	return false;
	boolean[] isVisited = new boolean[128];
	for(int i = 0 ; i<s.length(); i++){
		int w = s.charAt(i);
		if(isVisited[w])	return false;
		isVisited[w] = true;
	}
	return true;
}
}
//space complexity is O(1)
//time complexity is O(n)	or O(c)	as c is constant as 
//the max String length is 128 so the max iterations number is 128