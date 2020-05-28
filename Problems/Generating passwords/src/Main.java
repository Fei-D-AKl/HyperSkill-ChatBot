import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int upper = sc.nextInt();
        int lower = sc.nextInt();
        int digit = sc.nextInt();
        int size = sc.nextInt();
        sc.close();

        char[] uC = {'A', 'B', 'C'};
        char[] lC = {'u', 'n', 'm'};
        char[] d = {'1', '2', '3'};
        String s = "";

        for (int i = 0; i < size; i++) {
            if (i < upper) {
                s += uC[i % uC.length];
            } else if (i < upper + lower) {
                s += lC[i % lC.length];
            } else if (i < upper + lower + digit) {
                s += d[i % d.length];
            } else {
                s += uC[i % uC.length];
            }
        }
        System.out.println(s);
    }
}