import java.util.Scanner;

public class MinValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size for the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter an element " + (i + 1));
            array[i] = scanner.nextInt();
        }

        int minValue = array[0];
        for (int j = 1; j < array.length; j++) {
            if(array[j] < minValue) {
                minValue = array[j];
            }
        }
        System.out.printf("MinValue = " +minValue);

    }
}
