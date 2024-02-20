import java.nio.ShortBuffer;

public class StringINBuildsMethods {
public static void main(String[] args) {
	String s="Abhishek";
	String s1="abhishek";
	if(s==s1)
	{
		System.out.println("string s are equal");
	}
	else
	{
		System.out.println("not equal");
	}
	
	System.out.println(s.compareTo(s1));
	System.out.println(s1.equalsIgnoreCase(s));
	System.out.println(s.startsWith("A"));
	System.out.println(s1.lastIndexOf("k"));
	System.out.println("length is "+s1.length());
	String s2=s1.replace("a", "A");
	System.out.println(s2);
	String s3=s2.replaceAll("Abhishek","Patil");
	System.out.println(s3);
	System.out.println(s3.replaceFirst("P","A" ));
	String x="Hello world how are you?";
	String x1[]=x.split("o");
	for(int i=0;i<x1.length;i++)
	{
		System.out.println(x1[i]+" ");
	}
	for(String x2:x1)
	{
		System.out.println(x2);
	}
	String a="12345";
	int a1=Integer.valueOf(a);
	System.out.println(a1);
	int a2=Integer.parseInt(a);
	System.out.println(a2);
	String b="Shantu";
char b1=b.charAt(5);
System.out.println(b1);
for(int i=0;i<b.length();i++)
{
	char b2=b.charAt(i);
	System.out.println(b2);
	
}
	

	
	StringBuffer ss=new StringBuffer("Raja Ram");
	System.out.println(ss);
	ss.append(" mohan roy");
	System.out.println(ss);
	StringBuilder sb=new StringBuilder("Abhishek");
	System.out.println(sb);
	sb.append(" Patil");
	System.out.println(sb);
	System.out.println(sb.capacity());
	System.out.println(sb.capacity());
sb.ensureCapacity(45);	
System.out.println(sb.capacity());
sb.append(" he works as backend developer");
System.out.println(sb);
System.out.println(sb.capacity() );










	
	
	
	
	
	
}
}
