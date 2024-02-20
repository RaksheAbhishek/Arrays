import java.util.Scanner;
public class frequency {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
//		int a[]=new int[n];
//		for(int i=0;i<a.length;i++)
//		{
//			a[i]=scan.nextInt();
//		}
//		System.out.println("+++++++++++++++");
//		int frequency[]=new int[a.length];
//		int visited=0;
//		for(int i=0;i<a.length;i++)
//		{
//			int count=1;
//			
//			for(int j=i+1;j<a.length;j++) {
//			if(a[i]==a[j])
//			{
//				count++;
//				frequency[j]=visited;
//			}
//			}
//			if(frequency[i]!=visited) {
//				frequency[i]=count;
//			}
//		}
//System.out.println("+++++++++++++++");
//for(int i=0;i<frequency.length;i++)
//{
//	if(a[i]!=visited)
//	{
//		System.out.println(a[i]+"   "+frequency[i]);
//	}
//}
//			}
//		}
//	
//

		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		int [] fr = new int [arr.length];  
		int visited = -1;  
		for(int i = 0; i < arr.length; i++){  
			int count = 1;  
			for(int j = i+1; j < arr.length; j++){  
				if(arr[i] == arr[j]){  
					count++;  
					fr[j] = visited;  
				}  
			}  
			if(fr[i] != visited)  
				fr[i] = count;  
		}  

		System.out.println("------------------------");  
		System.out.println(" Element | Frequency");  
		System.out.println("------------------------");  
		for(int i = 0; i < fr.length; i++){  
			if(fr[i] != visited)  
				System.out.println("    " + arr[i] + "    |    " + fr[i]);  
		}  
		System.out.println("----------------------------------------");  
	}
} 
