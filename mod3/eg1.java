import java.io.*;
import java.util.*;
class eg1psp
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int req,num,z,y;
ArrayList<Integer> list;
try
{
System.out.print("Enter Req. : ");
req=sc.nextInt();
sc.nextLine();
if(req<=0)
{
System.out.println("Invalid Requirement : "+req);
return;
}
list=new ArrayList<>();
for(y=0;y<req;y++)
{
System.out.print("Enter a Number : ");
list.add(sc.nextInt());
sc.nextLine();
}
for(y=0;y<=req-1;y++)
{
num=list.get(y);
z=y-1;
while(z>=0 && list.get(z)>num)
{
list.set(z+1,list.get(z));
z--;
}
list.set(z+1,num);
}
for(y=0;y<req;y++) System.out.println(list.get(y));
}catch(Exception ee)
{
System.out.println("Invalid Input : "+ee.getMessage());
return;
}



}
};