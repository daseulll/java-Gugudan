import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
	System.out.println("구구단 중 출력할 단은? : ");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	scanner.close();
	
	System.out.println("입력한 값: " + number);  
	
	if (number < 2 || number > 9) {
		System.out.println("출력할 단은 2 - 9 사이여야 합니다. 입력한 값 : " + number);
	}
	else {
		for (int i = 1; i < 10; i++) {
			System.out.println( number * i );
		}
	}	
	}
}
