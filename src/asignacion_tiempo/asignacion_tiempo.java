package asignacion_tiempo;

import java.util.Scanner;

public class asignacion_tiempo {

	static Boolean solution(int t, int[] input_arr) {
		Boolean targetOk = false;
		for (int i = 0; i < input_arr.length; i++) {
			int sum = input_arr[i];
			for (int j = 0; j < input_arr.length; j++) {
				if (sum == t) {
					targetOk = true;
					break;
				} else {
					if (i != j) {
						sum = sum + input_arr[j];	
					}	
				}
			}
		}
		return targetOk;
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
		
		Boolean result = solution(t, input_arr);
		
		System.out.println(result ? "True" : "False");
	}

}
