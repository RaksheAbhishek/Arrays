import java.util.Scanner;

public class Array3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr1[]=new int[scan.nextInt()];
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i]=scan.nextInt();
	}
	int count=0;
int visited=-1;
int arr2[]=new int[arr1.length];
for(int i=0;i<arr1.length;i++)
{
	for(int j=i+1;j<arr1.length;j++)
	{
		if(arr1[i]==arr1[j])
		{
			count++;
			arr1[j]=visited;
		}
	}
	if(arr1[i]!=visited)
	{
		arr1[i]=count;
	}
}
System.out.println("=============");
for(int i=0;i<arr2.length;i++)
{
	if(arr2[i]!=visited)
	{
		System.out.println(arr1[i]+" "+arr2[i]);
	}
}
	
}
}
