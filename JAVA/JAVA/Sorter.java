import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {
       
        String[] strings = {
            "banana",
            "apple",
            "cherry",
            "grape",
            "mango",
            "orange"
        };

        // Print the array before sorting
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(strings));

        // Sort the array of strings
        Arrays.sort(strings);

        // Print the array after sorting
        System.out.println("\nAfter sorting:");
        System.out.println(Arrays.toString(strings));
    }
}
