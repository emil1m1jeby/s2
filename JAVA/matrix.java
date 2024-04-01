import java.util.Scanner;

class matrix {
    String b;
    int r, c;
    int a[][];

    void matt() {
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
    }

    void dis() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        Scaner scanner = new Scaner();
        scanner.matt();
        scanner.dis();
    }
}									
