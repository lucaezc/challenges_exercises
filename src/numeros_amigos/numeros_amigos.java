package numeros_amigos;
import java.util.*;

public class numeros_amigos {

	static Boolean solution(int a, int b) {
		if ((sumaDivisores(a) == b) && (sumaDivisores(b) == a)) {
			return true;
		}else {
			return false;
		}
	}
	
	static int sumaDivisores(int num) {
		int suma = 0;
		for (int i=1; i<num; i++) {
            if (num % i == 0) {
                suma = suma + i;
            }
		}

		return suma;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a = scanner.nextInt();
		
		int b = scanner.nextInt();
		
		scanner.close();
		
		Boolean result = solution(a,b);
		
		System.out.println(result ? "True" : "False");
	}
}