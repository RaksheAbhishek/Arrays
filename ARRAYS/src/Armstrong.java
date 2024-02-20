import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for armstrong");
		int num = scan.nextInt();
		int count = 0;
		int power = 0;
		while (num != 0) {
			int digit = num % 10;
			count++;
			num = num / 10;
		}
		count = power;
		int sum = 0;
		if (num != 0) {
			int digit = num % 10;
			int value = (int) Math.pow(power, digit);
			sum = sum + value;
			num = num / 10;
		}
		System.out.println();
		if (num == sum) {
			System.out.println("entered number is armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}

}
