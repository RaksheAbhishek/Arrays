import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int n[]=new int[a];
	for(int i=0;i<=n.length-1;i++)
	{
		n[i]=scan.nextInt();
		
	}
	int min=n[1];
for(int i=0;i<=n.length-1;i++)
{

		if(n[i]<min) {
			min=n[i];
		}
}
		System.out.println(min);
	int temp=0;
for(int i=0;i<=n.length-1;i++)
{
	for(int j=i+1;j<n.length-1;j++) {
		if(n[i]<n[j]) {
			temp=n[i];
			n[i]=n[j];
			n[j]=temp;
		}
	}
}
for(int i=0;i<=n.length-1;i++) {
	System.out.println(n[i]);
}
System.out.println();
	}

}
