import java.util.Scanner;

class Scanner {
    public static void main(String arg[]) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter: ");
            String str = s.nextLine();
            System.out.println("hallo: " + str);
            System.out.println("Enter num: ");
            int a = s.nextInt();
            System.out.println("num: " + a);
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}											
