package highest_scoring_word;

public class Kata {

	public static String high(String s) {
		String[] words = s.split(" ");
		String highestWord = "";
		int maxScore = 0;
		for (String w: words) {
			if (wordScore(w) > maxScore) {
				maxScore = wordScore(w);
				highestWord = w;
			}
		}
		return highestWord;
	}
	
	public static int wordScore(String s) {
		int sum = 0;
		for (char c : s.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				sum = sum + c + 1 - 'a';
			}
		}
		return sum;
	}
}
