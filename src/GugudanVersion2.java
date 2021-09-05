import java.util.Arrays;
import java.util.Scanner;

public class GugudanVersion2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		scanner.close();
		
		String[] values = inputValue.split(", ");
		System.out.println(Arrays.toString(values));
		
		int n = Integer.parseInt(values[0]); 
		int m = Integer.parseInt(values[1]); 
		
		for (int i = 2; i < n + 1; i ++) {			
			int[] result = GugudanVersion1.calculate(i, m);
			GugudanVersion1.print(result);
		}
	}
}
