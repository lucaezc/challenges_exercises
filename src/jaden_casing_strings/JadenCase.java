package jaden_casing_strings;

public class JadenCase {

	public String toJadenCase(String phrase) {
	// TODO put your code below this comment
	    String result = "";
	    if (phrase == null || phrase.equals("")){
	    	result = null;
	    } else {
	    	String[] words = phrase.split("\\s");
	    	for (String word: words){
	    		String firstLetter = word.substring(0,1);
	    		String rest = word.substring(1);
	    		result += firstLetter.toUpperCase() + rest + " "; 
	    	}
	    	result = result.trim();
	    }
		return result;
	}

}