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

        boolean ascending = true;
        for (int i = 1; i < size; i++) {
            if (arr[i - 1] > arr[i]) {
                ascending = false;
            }
        }
        System.out.println(ascending);
    }
}