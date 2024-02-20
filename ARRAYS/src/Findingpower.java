import java.util.Scanner;

public class Findingpower {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       System.out.println("enter base and exponent");
       int base=scan.nextInt();
       int exp=scan.nextInt();
       int power=1;
     int res=(int)  Math.pow(base, exp);
     System.out.println(res);
     
     
     //power and exponent
     int res1=(int) Math.pow(base,exp);
    System.out.println(res1);
	}

}
