import java.util.Scanner;
class conn_ex
{
 int a;
 String s;
conn_ex()
 {
   System.out.println("Enter: ");
 }
conn_ex(int x)
 {  
    a=x;
    System.out.println("Enter: "+a);
 }
}
class Test1
{
    public static void main(String []args)
    {
       conn_ex c1=new conn_ex();
       conn_ex c2=new conn_ex(2);
          
        }
}
