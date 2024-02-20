import java.util.List;
import java.util.Scanner;

public class H1 {

//	Scanner scan=new Scanner(System.in);
//
//	int n=scan.nextInt();
//
//	int arr[]=new int[n];
//
//	public static int max(int arr[])
//	{
//
//		int x=arr.length;
//		int count=0;
//		int a=0;
//
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==i&&arr[i]==-i&&arr[i]==0)
//			{
//				count++;
//			a=arr[i]/arr.length;
//			}
//		}
//		return a;
//	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int count=0;
		
		int a=0;
		int arr[]=new int[scan.nextInt()];
//		for(int i=0;i<arr.length-1;i++)
//		{
//			if(arr[i]==+i&&arr[i]==-i&&arr[i]==0)
//			{
//				count++;
//				
//				a[]=arr[i]/arr.length;
//			}
//		}
//		System.out.println(a);
//		int
		int x=0;
		int y=0;
		int z=0;
		int countpositive=0;
		int countnegative=0;
		int countzero=1;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				countpositive++;
				x=countpositive%arr.length;
			
			}
			else if(arr[i]<0)
			{
			countnegative++;
			y=countnegative%arr.length;
			}
			else {
				countzero++;
				z=countzero%arr.length;
			}
		}
		System.out.println(x);
		System.out.println(y);
	System.out.println(z);
	
	 
	}
	
	
}
