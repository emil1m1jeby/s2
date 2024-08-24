package a;
import java.util.Scanner;
public class c1 {
   String b;
    int r, c;
    int a[][];

    public void matt() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num row: ");
        r = s.nextInt();
        System.out.print("Enter num column: ");
        c = s.nextInt();
        a = new int[r][c]; // Initialize the array with appropriate dimensions
        System.out.println("Enter num matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }
 
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
