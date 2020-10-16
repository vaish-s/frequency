//Author  : Vaishnavi Sheoran.
//Date      : 14/10/2020.
//Purpose: Frequency check of a particular digit in a number.

import java.io.*;
class fre
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c,d=0,i;
System.out.println("Input a number");
a=Integer.parseInt(br.readLine());
for(i=0;i<=9;i++)
{
b=a;
while(b!=0)
{
c=b%10;
b=b/10;
if(c==i)
{
d++;
}
}
System.out.println("Frequency of "+i+" is "+d);
d=0;
}}}