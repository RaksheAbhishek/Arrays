import java.util.*;
public class SumofValuesofAnARRAYw3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size ");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"");
		}
		int sum=0;
		System.out.println("array sum");
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum+" ");
		System.out.println("===================");
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print("-"+" ");
			}
			System.out.println();
		}
		System.out.println("=============");
		System.out.println("average value of an element");
		float average=0;
		average=sum/arr.length;
		System.out.println("average is: "+average);
		
	}

}
