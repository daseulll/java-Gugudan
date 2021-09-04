public class Gugudan {
	public static void main(String[] args) {
		int[] result = new int[9];
		
		for (int n = 2; n < 10; n++) {
			for (int i = 0; i < result.length; i++) {
				result[i] = n * (i + 1);
			}
			
			for(int i=0; i < result.length; i++ ) {
				System.out.println(result[i]);
			}
			
		}
	}
}
