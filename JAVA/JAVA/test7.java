public class test7 {
    public static void main(String[] args) {
        int n = 10;
        int d = 0;

        try {
            int result = n / d;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
 
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues...");
    }
}
