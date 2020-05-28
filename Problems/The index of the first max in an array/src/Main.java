import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int index = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        sc.close();

        System.out.println(index);
    }
}
