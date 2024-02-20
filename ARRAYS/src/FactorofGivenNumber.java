import java.util.Scanner;

public class FactorofGivenNumber {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter a number to print the factor of it");
      int num=scan.nextInt();
      for(int i=1;i<=num;i++)
      {
    	  if(num%i!=0) {
    	  System.out.print(i+" ");
      }
      }
	}

}
