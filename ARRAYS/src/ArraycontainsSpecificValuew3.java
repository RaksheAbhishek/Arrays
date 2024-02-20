import java.util.*;

public class ArraycontainsSpecificValuew3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("array size");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("==========");
	int temp=0;
	int arr1[]=new int[scan.nextInt()];
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i]=scan.nextInt();
	}
	System.out.println("========");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.println(arr[i]+" ");
				}
			}
		}
		
}
}