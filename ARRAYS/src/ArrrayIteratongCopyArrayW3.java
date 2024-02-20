import java.util.*;
public class ArrrayIteratongCopyArrayW3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	int arr2[] =new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
		arr2[i]=arr[i];
		
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr2[i]+" ");
	}
	
}
}
