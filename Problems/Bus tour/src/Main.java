import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        int x = b + 1;
        for (int i = 0; i < b; i++) {
            int bH = sc.nextInt();
            if (bH <= h) {
                x = i + 1;
                break;
            }
        }
        sc.close();

        if (x > b) {
            System.out.println("Will not crash");
        } else {
            System.out.printf("Will crash on bridge %d", x);
        }
    }
}