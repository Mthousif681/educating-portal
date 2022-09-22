import java.util.*;
class Swap
{
public static void main(String args[])
{
int a=10,b=20;
System.out.println("Values before:\n a="+a+"\n b="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("Values before:\n a="+a+"\n b="+b);
}
}
