import java.util.Scanner;

class scaner{
    String b;
    int a;
    void show() { 
       Scanner san = new Scanner(System.in);
        System.out.print("Enter num: ");
         a = san.nextInt();
         System.out.println("hallo: " + b);
         }
     void dis()
     {
       System.out.println("num: " + a);
     }
    public static void main(String arg[]) {
        try {
            Scanner s = new Scanner(System.in);
            scaner s1=new scaner(); 
            System.out.print("Enter: ");
            s1.b = s.nextLine();
            System.out.println("hallo: " + s1.b);
            s1.show(); 
            s1.dis();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
    
}											
