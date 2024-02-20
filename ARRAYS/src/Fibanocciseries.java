import java.util.Scanner;

public class Fibanocciseries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num1 = 0;
		System.out.println();
		int num2 = 1;
		if (n == 1) {
			System.out.println(num1);
		} else if (n == 2) {
			System.out.println(num1 + " " + num2);
			
		} else {
			
			System.out.println(num1 + " " + num2 + "  ");
			for (int i = 3; i <= n; i++) {
 
				int fib = num1 + num2;
				System.out.println(fib + " ");
				num1 = num2;
				num2 = fib;
			}
		}

	}

}
