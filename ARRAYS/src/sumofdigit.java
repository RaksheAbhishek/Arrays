import java.util.Scanner;
public class sumofdigit {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number to find the sum of digits");
	int a=scan.nextInt();
	int b=scan.nextInt();
	int sum=0;
for(int i=5;i<=b;i++)
{
	sum=sum+i;
}
 System.out.println(sum);   
	}

}
