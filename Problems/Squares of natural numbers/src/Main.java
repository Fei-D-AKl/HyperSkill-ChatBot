import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;

        while (i * i <= n) {
            System.out.println(i * i);
            i++;
        }
    }
}