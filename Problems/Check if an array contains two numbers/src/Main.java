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
        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.close();

        int j = 1;
        boolean occur = false;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == n && arr[j + i] == m) {
                occur = true;
                break;
            } else if (arr[j + i] == n && arr[i] == m) {
                occur = true;
                break;
            }
        }
        System.out.println(occur);
    }
}