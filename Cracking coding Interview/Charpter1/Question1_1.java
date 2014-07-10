
public class Question1_1 {
	public boolean isUniqueChars(String s) {
		int checker = 0;
		for(int i=0;i < s.length(); i++) {
			int val = s.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}
	
	public boolean isUniqueChars2(String s) {
		if(s.length() > 256) {
			return false;
		}
		
		boolean[] char_set = new boolean[256];
		for(int i=0;i<s.length();i++) {
			if(char_set[s.charAt(i)-'a'] == true)  
				return false;
			char_set[s.charAt(i)-'a'] = true;
		}
		return true;
	}
}
