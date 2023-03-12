import java.util.*;
class eg1psp
{
public static void main(String gg[])
{
try
{
int x,y;
Scanner sc=new Scanner(System.in);
System.out.print("Enter A : ");
x=sc.nextInt();
System.out.print("Enter B : ");
y=sc.nextInt();
System.out.println("Sum : "+x+y);
sc.close();
}catch(Exception e)
{
System.out.println(e.getMessage());
}
}
};