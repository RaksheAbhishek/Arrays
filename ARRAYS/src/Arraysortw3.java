import java.util.*;
public class Arraysortw3 {
	public static void main(String[] args) {
                  Scanner scan=new Scanner(System.in);
                  System.out.println("enter array size");
                  int a=scan.nextInt();
                  int arr[]=new int[a];
                  for(int i=0;i<arr.length;i++)
                  {
                	  arr[i]=scan.nextInt();
                  }
                  for(int i=0;i<arr.length;i++)
                  {
                	  System.out.print(arr[i]+" ");
                  }
                  int temp=0;
                  for(int i=0;i<arr.length;i++)
                  {
                	  for(int j=i+1;j<arr.length;j++)
                	  {
                		  if(arr[i]<arr[j])
                		  {
                			  temp=arr[i];
                			  arr[i]=arr[j];
                			  arr[j]=temp;
                		  }
                	  }
                  }
                  //after sorting
                  System.out.println("after sorting");
                  for(int i=0;i<arr.length;i++)
                  {
                	  System.out.print(arr[i]+ " ");
                  }
	}
}
