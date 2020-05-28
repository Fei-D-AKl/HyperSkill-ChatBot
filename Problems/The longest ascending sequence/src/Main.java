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
        int count = 1;
        int tmp = 1;
        if (size > 1) {
            for (int i = 1; i < size; i++) {
                if (arr[i - 1] < arr[i]) {
                    tmp++;
                    if (tmp > count) {
                        count = tmp;
                    }
                } else {
                    tmp = 1;
                }
            }
        }

        System.out.println(count);

    }
}