import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
small=arr[i];
		}
		}
		System.out.println(small);
	
	System.out.println("enter array2");
	int arr2[]=new int[scan.nextInt()];
	for(int i=0;i<arr2.length;i++)
	{
		arr2[i]=scan.nextInt();
	}
	int large=arr2[0];
	for(int j=0;j<arr2.length;j++)
	{
		if(arr2[j]>large)
		{
		large=arr2[j];
		}
	}
	System.out.println("large number is :"+large);
	}
	
	

}
