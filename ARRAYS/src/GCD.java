import java.util.Scanner;

public class GCD {
	int demo(int m,int n)
//	{
//		
//		while(n!=0) {
//			int rem=m%n;
//			m=n;
//			n=rem;
//		}
//		return m;
//	}
	
	//recursive way
	{
		if(n==0) {
			return m;
		}
		else
		{
			return demo(n,m%n);
		}
		
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter m and n");
	int m=scan.nextInt();
	int n=scan.nextInt();
	
//	GCD g=new GCD();
//int res=g.demo(m, n);
//System.out.println("gcd of m and n is :"+res);
//	
	
	
	//recursive way
	
	GCD gc=new GCD();
	int res=gc.demo(m, n);
		System.out.println("gcd of 2 numbers is " +res);
	
}
}
