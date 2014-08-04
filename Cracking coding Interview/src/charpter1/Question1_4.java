package charpter1;

public class Question1_4 {
	public void replaceSpaces(char[] str, int length) {
		
		int spaceCount = 0;
		int newLength;
		for(int i=0;i<length;i++) {
			if(str[i] == ' ') {
				spaceCount++;
			}
		}
		newLength = 2*spaceCount + length;
		int index = newLength - 1;
		for(int i=length-1;i>=0;i--) {
			if(str[length-1] == ' ') {
				str[index] = '0';
				str[index-1] = '2';
				str[index-2] = '%';
				index -= 3;
			} else {
				str[index] = str[i];
				index -= 1;
			}
		}
		
	}
}
