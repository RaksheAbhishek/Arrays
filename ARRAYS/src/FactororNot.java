import java.util.Scanner;
public class FactororNot {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	if(10%num==0)
	{
		System.out.println("enter number is factor of 10");
	}
	else {
		System.out.println("entered number is not a factor of 10");
	}
}
}
