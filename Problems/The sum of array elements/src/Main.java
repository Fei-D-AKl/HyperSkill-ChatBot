import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += sc.nextInt();
        }
        sc.close();

        System.out.println(sum);
    }
}