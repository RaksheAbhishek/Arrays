import java.util.Scanner;

public class main1 {
	
	
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);	
String a=scan.nextLine();
int count=0;
char[] c=a.toCharArray();
for(int i=0;i<a.length();i++)
{
	char b=a.charAt(i);
	for(int j=i+1;j<a.length();j++)
	{
		char d=a.charAt(j);
		if(b!=d)
		{
			System.out.println(j);
		}
	}
}
}
}
