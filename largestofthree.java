import java.io.*;
import java.util.*;
class largestofthree
{
public static void main(String[] args)
{
try
{
int a,b,c;
DataInputStream in=new DataInputStream(System.in);
System.out.print("Enter a");
a=Integer.parseInt(in.readLine());
System.out.print("Enter b");
b=Integer.parseInt(in.readLine());
System.out.print("Enter c");
c=Integer.parseInt(in.readLine());

if((a>b)&&(a>c))
{
System.out.println("The largest number is:"+a);
}
else if((b>a)&&(b>c))
{System.out.println("The largest number is:"+b);
}
else
{
System.out.println("The largest number is:"+c);
}
if((a<0)&&(b<0)&&(c,0))
{
System.out.println("Invalid data");
}
}
catch(Exception e)
{
}
}
}


