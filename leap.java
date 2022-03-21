class leap
{
public static void main(String args[])
{
int a=1997;
if((a%400==0)&(a%100==0)&(a%4==0))
System.out.println("leap year");
else
{
System.out.println("not leap year");
}
}
}