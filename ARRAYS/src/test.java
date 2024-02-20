import java.util.Scanner;

public class test {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	switch (a) {
	case 1:
		System.out.println("you have pressed 1");
		break;
	case 2:
		System.out.println("you have pressed 2");
		break;

	default:
		System.out.println("you have pressed other number");
		break;
	}
}
}
