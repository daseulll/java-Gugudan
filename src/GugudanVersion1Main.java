import java.util.Scanner;

public class GugudanVersion1Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max_num = scanner.nextInt();
		scanner.close();
		
		for (int i = 2; i <= max_num; i ++) {
			int[] result = GugudanVersion1.calculate(i, max_num);	
			GugudanVersion1.print(result);
		}
	}
}
