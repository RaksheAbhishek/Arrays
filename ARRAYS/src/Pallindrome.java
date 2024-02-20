import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("enter anumber to find the pallindrome");
        int num=scan.nextInt();
        int rev=0;
        int digit=0;
        while(num!=0) {
        	
        
        digit=num%10;
        rev=rev*10+digit;
        num=num/10;
        }
        
      
        System.out.println("reverse number is  "+ rev);
      
        if(rev==num)
        {
        	System.out.println("given number is pallindrome");
        }
        else
        {
        	System.out.println("not a pallindrome");
        }
        
	}

}
