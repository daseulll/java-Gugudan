import java.util.Scanner;

public class GugudanVersion1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		int[] result = new int[num];
		for (int i = 2; i <= num; i ++) {
			for (int j = 0; j < num; j++) {
				result[j] = i * (j + 1);
				
			}
			
			for (int k =0; k < result.length; k++) {
				System.out.println(result[k]);
			}
		}
	}
}
