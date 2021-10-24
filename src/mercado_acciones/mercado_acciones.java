package mercado_acciones;
import java.util.*;

public class mercado_acciones {

	static int solution(int[] input_arr) {
		return input_arr[diaMaximoValor(diaCostoMinimo(input_arr), input_arr)] - input_arr[diaCostoMinimo(input_arr)];
	}
	
	static int diaCostoMinimo(int[] costos) {
		int costoMin = costos[0];
		int diaCostoMin = 0;

		for (int i = 0; i < costos.length; i++) {        
			if(costos[i] < costoMin){
				costoMin = costos[i];
				diaCostoMin = i;
		    } 
		}
		
		return diaCostoMin;
	}
	
	static int diaMaximoValor(int posMin, int[] costos) {
		int costoMax = costos[posMin];
		int diaMaxValor = 0;

		for (int i = posMin; i < costos.length; i++) {        
			if(costos[i] > costoMax){
				costoMax = costos[i];
				diaMaxValor = i;
		    } 
		}
		
		return diaMaxValor;
	}
		
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.nextLine();
		int[] input_arr = new int[n];
		
		String[] arrStr = scanner.nextLine().split(" ");
		scanner.close();
		
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(arrStr[i]);
			input_arr[i] = x;
		}
		
		int result = solution(input_arr);
		
		System.out.println(result);
	}
}