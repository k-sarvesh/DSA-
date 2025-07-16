import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " element of the array:");
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the number that you want to search: ");
        int target = in.nextInt();

        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Target is found at index " + index);
        } else {
            System.out.println("Target not found in the array.");
        }

        in.close();
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
