package charpter1;
import java.util.HashMap;
import java.util.Map;


public class Question1_3 {
	public boolean isPermutation(String a, String b) {
		if(a.length() != b.length()) return false;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length();i++) {
			int c = a.charAt(i) - 'a';
			if(map.containsKey(c)) {
			int val = map.get(c);
			map.put(c, val+1);
			} else {
				map.put(c, 1);
			}
		}
		
		for(int i=0;i<b.length();i++) {
			int c = b.charAt(i) - 'a';
			if(!map.containsKey(c))
			return false;
			else {
				int val = map.get(c);
				if(val < 1) return false;
				val -= 1;
				map.put(c, val);
			}
		}
		return true;
	}
}
