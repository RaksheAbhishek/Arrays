import java.util.Scanner;

public class GCD1 {
	static int gcd(int n,int m)
	{
		if(m==0)
		{
			return n;
		}
		else
		{
			return gcd(n,n%m);
		}
	}
	static int fact(int m)
	{
		if (m==0)
		{
			return 1;
		}
		else
		{
			return m*fact(m-1);
		}
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int m=scan.nextInt();
	int res=GCD1.gcd(n, m);
	System.out.println(res);
	int res1=GCD1.fact(m);
	System.out.println(res1  );
}
}
