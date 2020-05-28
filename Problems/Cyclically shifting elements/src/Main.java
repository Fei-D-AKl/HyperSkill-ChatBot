import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] shift = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        shift[0] = arr[size - 1];
        System.arraycopy(arr, 0, shift, 1, size - 1);
        for (int n : shift) {
            System.out.print(n + " ");
        }
    }
}