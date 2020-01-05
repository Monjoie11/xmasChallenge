package challenges;

public class Methods {
	
	public String challenge1226(String target, char buhbye) {
		String bubI = Character.toString(buhbye);
		return target.replace(bubI, "");
	}
	
	
	public boolean challenge1223(String ana, String gram) {
		if(ana.length() != gram.length()) {
			return false;
		}
		char[] temp1 = ana.toCharArray();
		char[] temp2 = gram.toCharArray();
		for(int i = 0, j = temp1.length-1; i < temp1.length-1; i++, j--) {
			if(temp1[i] != temp2[j]) {
				return false;
			}
		}
		return true;
	}
	
	
	public int challenge1230(String word, char target) {
		int count = 0;
		char[] temp = word.toCharArray();
		for(char c: temp) {
			if(target == c) {
				count++;
			}
		}
		
		return count;
	}
	
	public String challenge12(String flip) {
		if(flip.length() == 0) {
			return flip;
		}
		return challenge12(flip.substring(1))+flip.charAt(0);
	}

}
