import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ArraywithoutLENGTH {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	   ArrayList al=new ArrayList();
	 int arr[]= {11,32,4,21,321,3231};
	int count=0;

//	for(int i:arr)
//	{
//		System.out.println("size of the array is: "+ count++);
//	
//	}
	
	while(true)
	{
		try {
		System.out.println(arr[count]);
		count++;
		}
		catch(Exception e)
		{
			break;
		}
	}
	System.out.println("length is:"+count);
	
	

}

}
