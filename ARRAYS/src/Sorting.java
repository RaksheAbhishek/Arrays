import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//int n=scan.nextInt();
		//int arr[]=new int[scan.nextInt()];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=scan.nextInt();
//		}
		
		int temp;
		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[j]<arr[i])
//				{
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]+" ");
//		}
//		System.out.println();
//		}
		
//	int sum=0;
//	int product=1;
//	int avg=0;
//	for(int i=0;i<arr.length;i++)
//	{
//		sum=(sum+arr[i]);
//		avg=sum/arr.length;
//	}
//	System.out.println(avg);
		
		
//		
//		int sum=0;
//		
//int digit;
//int rev=0;
//while(n!=0)
//{
//	digit=n%10;
//	//rev=rev*0+digit;
//	sum=sum+digit;
//	n=n/10;
//}
//System.out.println("sum of numbers is :"+sum);
	
		String s=scan.next();
		char a[]=s.toCharArray();
		char d = 0;   
		char e=0;
		for(int i=0;i<a.length;i++)
		{
//			char b=s.charAt(i);
//			System.out.print(b+" ");
			for(int j=a.length-1;j>=0;j--)
			{
				
				 d=s.charAt(i);
				 e=s.charAt(j);
				
			}
			
		}
		if(d==e)
		
		{
		System.out.println("it is a pallindrome");	
		}
		else
		{
			System.out.println("not a pallindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}