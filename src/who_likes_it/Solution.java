package who_likes_it;

class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
    	String returningPhrase = "";
    	switch (names.length) {
    	case 0:
    		returningPhrase = "no one likes this";
    		break;
    	case 1:
    		returningPhrase = names[0] + " likes this";
    		break;
    	case 2:
    		returningPhrase = names[0] + " and " + names[1] + " like this";
    		break;
    	case 3:
    		returningPhrase = names[0] + ", " + names[1] + " and " + names[2] + " like this";
    		break;
    	default:
    		returningPhrase = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
    		break;
    	}
        return returningPhrase;
    }
}
