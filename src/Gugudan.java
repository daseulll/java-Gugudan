public class Gugudan {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
			
		}
		return result;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		for (int i = 2; i < 10; i ++) {
			int[] result = calculate(i);
			print(result);
		}
	}
}
