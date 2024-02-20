import java.util.Scanner;

public class ArraySumCombination {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("enter the target element ");
		int target = scan.nextInt();
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				
				if ((arr[i]+arr[j]) == target) {
  System.out.println(i+" "+j);
				}

			}
		}

	}

}
