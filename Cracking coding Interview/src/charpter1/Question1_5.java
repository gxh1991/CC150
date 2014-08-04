package charpter1;

public class Question1_5 {
	public String compressBad(String str) {
		if(str == null) return str;
		if (str.length() == 1) return str;
//******return size of new String*********************************
		int size = 0;
		int count = 1;
		char last = str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if(last == str.charAt(i)) {
				count++;
			} else {
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length(); 
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
//*******************************************************************		
		if(size > str.length()) return str;
		char[] s = new char[size];
		int index = 0;
		last = str.charAt(0);
		count = 1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i) == last) {
				count++;
			} else {
				index = setChar(s,last,index,count);
				last = str.charAt(i);
				count = 1;
				
			}
		}
		setChar(s,last,index,count);
		return new String(s);
	}
	int setChar(char[] array,char last, int index, int count) {
		array[index] = last;
		index++;
		char[] cnt = String.valueOf(count).toCharArray();
		for(char c:cnt) {
			array[index] = c;
			index++;
		}
		return index;
	}
	
}
