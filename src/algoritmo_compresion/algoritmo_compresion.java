package algoritmo_compresion;
import java.util.*;

public class algoritmo_compresion {

	static String solution(String s) {
		int rep, i = 0;
		String resultado = "";
		
		while (i < s.length()) {
		    char c = s.charAt(i);        
		    rep = ocurrencias(c, s.substring(i, s.length()));
		    if (rep == 1) {
		    	resultado = resultado + c;
		    } else {
			    resultado = resultado + String.valueOf(rep) + c;
		    }
		    i = i + rep;
		}
		return resultado;
	}
	
	static int ocurrencias(char c, String resto) {
		int ocurr = 0;
		for (int i = 0; i < resto.length(); i++) {
			if (resto.charAt(i) == c) {
				ocurr++;
			}
		}
		return ocurr; 
	}
		
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s = scanner.nextLine();
		
		scanner.close();
		
		String result = solution(s);
		
		System.out.println(result);
	}
}