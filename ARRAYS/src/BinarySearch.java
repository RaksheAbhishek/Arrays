import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of the array");
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
	    System.out.println("enter key to search");
        int key=scan.nextInt();
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
        	int mid=(low+high)/2;
        	if(key==arr[mid]) {
        		System.out.println("key found at the index "+mid);
        		System.exit(0);
        	}
        	else if(key>arr[mid])
        		
        	{
        		low=mid+1;
        		high=high;
        	}
        	else {
        		high=mid-1;
        		low=low;
        	}
        }
        System.out.println("key not found");
}
}
