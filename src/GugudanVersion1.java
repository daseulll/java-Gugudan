public class GugudanVersion1 {
	public static int[] calculate(int n, int max_num) {
		int[] result = new int[max_num];
		for (int j = 0; j < max_num; j++) {
			result[j] = n * (j + 1);
			
		}
		return result;
	}
	
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
