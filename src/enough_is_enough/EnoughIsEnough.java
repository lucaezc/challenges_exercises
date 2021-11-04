package enough_is_enough;

import java.util.ArrayList;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		//Code here ;)
		ArrayList<Integer> indexesToRemove = new ArrayList<Integer>();
		for (int num: elements) {
			if (occurrences(elements, num) > maxOccurrences) {
				indexesToRemove.addAll(indexesToRemove(elements, num, maxOccurrences));
			}
		}
		
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
		for (int i = 0; i < elements.length; i++) {
			if(!indexesToRemove.contains(i)) {
				newArrayList.add(elements[i]);
			}
		} 
		
	    return convertArrayList(newArrayList);
	}
	
	public static int occurrences(int[] elements, int element) {
		int occurrences = 0;
		for (int num:elements) {
			if (num == element) occurrences++;
		}
		return occurrences;
	}
	
	public static ArrayList<Integer> indexesToRemove(int[] elements, int element, int maxOccurrences) {
		int occurrences = 0;
		ArrayList<Integer> indexesToRemove = new ArrayList<Integer>();
		
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == element) {
				occurrences++;
				if (occurrences > maxOccurrences) {
					indexesToRemove.add(i);
				}
			}
		}
		return indexesToRemove;
	}
	
	public static int[] convertArrayList(ArrayList<Integer> al) {
	    int[] ret = new int[al.size()];
	    for (int i = 0; i < ret.length; i++) {
	        ret[i] = al.get(i).intValue();
	    }
	    return ret;
	}

}