import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]= {1,2,3,4,5};
	
//	String str="";
//for(int i:arr)
//{
//	str=str+i;
//}
//int x=Integer.parseInt(str);
//int x1=x+1;
//System.out.println(x1);


int arr2[]=new int[arr.length];
for(int i=0;i<arr2.length;i++)
{
	if(i==arr.length-1)
	{
		arr2[i]=arr[i]+1;
	}
	else
	{
		arr2[i]=arr[i];
	}
}
System.out.println("input:"+Arrays.toString(arr));
System.out.println("output:"+Arrays.toString(arr2));

}
}
