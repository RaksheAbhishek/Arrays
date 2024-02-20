import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
int arr[]= {1,2,5,22,11,21,32};
int key=scan.nextInt();
for(int i=0;i<arr.length;i++)
{
	if(key==arr[i])
	{
		System.out.println("element found at index:"+i);
		break;
	}
	
}
	}

}
