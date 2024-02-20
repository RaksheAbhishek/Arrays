import java.util.Scanner;

public class REverse {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int digit;
	int rev=0;
	while(num!=0)
	{
	digit=num%10;
	rev=10*rev+digit;
	num=num/10;
	}
	System.out.println("reverse number is :"+rev);
}
}
