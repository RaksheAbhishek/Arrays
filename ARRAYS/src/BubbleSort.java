import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the array size");
	int n=scan.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
	int help;
	for(int i=0;i<=n-2;i++)
	{
		for(int j=0;j<=n-2-i;j++)
		{
		if(arr[j]>arr[j+1])
		{
			help =arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=help;
		}
		}
	}
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]+" ");
	}
}
}
