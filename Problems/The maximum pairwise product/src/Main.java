import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int j = 1;
        int max = arr[0];
        for (int i = 0; i < size - 1; i++) {
            int tmp = arr[i] * arr[j + i];
            if (tmp > max) {
                max = tmp;
            }
        }

        System.out.println(max);
    }
}