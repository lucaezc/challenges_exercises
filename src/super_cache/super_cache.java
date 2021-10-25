package super_cache;

import java.util.Scanner;

public class super_cache {

	private static class Slot_cache{
		private Integer value;
		private Integer time;
		
		public Integer getValue() {
			return value;
		}
		public void setValue(Integer value) {
			this.value = value;
		}
		public Integer getTime() {
			return time;
		}
		public void setTime(Integer time) {
			this.time = time;
		}
		
		public Slot_cache(Integer value, Integer time){
			this.value = value;
			this.time = time;
		}
	}
	
	static int solution(int t, int[] input_arr) {
		Slot_cache[] cache = new Slot_cache[t];
		int max_time_without_changes = 0;
		int time_without_changes = 0;
		initializeCache(cache);
			
		for (int i = 0; i < input_arr.length; i++) {
			if (!inCache(cache, input_arr[i])) {
				if (time_without_changes > max_time_without_changes) {
					max_time_without_changes = time_without_changes;
				}
				time_without_changes = 0;
				cache[indexToReplace(cache)].setValue(input_arr[i]);
				cache[indexToReplace(cache)].setTime(i);
			} else {
				time_without_changes ++;
			}
		}
		
		return max_time_without_changes;
	}
	
	private static Boolean inCache(Slot_cache[] cache, int n) {
		Boolean found = false;
		
		for (int i = 0; i < cache.length; i++) {
			if (cache[i].getValue().equals(n)) {
				found = true;
				break;
			}
		}
		return found;
	}
	
	private static void initializeCache(Slot_cache[] cache) {
		for (int i = 0; i < cache.length; i++) {
			cache[i] = new Slot_cache(0, 0);
		}
	}
	
	private static Integer indexToReplace(Slot_cache[] cache) {
		Integer index = 0;
		Integer min_time = 999999;
		for (int i = 0; i < cache.length; i++) {
			if (cache[i].getTime() < min_time) {
				min_time = cache[i].getTime();
				index = i;
			}
		}
		return index;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scanner.nextInt();
		scanner.nextLine();
		
		int n = scanner.nextInt();
		scanner.nextLine();
		int[] input_arr = new int[n];
		
		String[] arrStr = scanner.nextLine().split(" ");
		scanner.close();
		
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(arrStr[i]);
			input_arr[i] = x;
		}
		
		int result = solution(t, input_arr);
		
		System.out.println(result);
	}

}
