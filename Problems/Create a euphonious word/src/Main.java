import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        sc.close();
        char[] arr = s.toCharArray();
        String vowels = "aeiouy";
        int count = 0;
        int c = 0;
        int v = 0;

        for (char i : arr) {
            if (vowels.indexOf(i) >= 0) {
                c = 0;
                v++;
                if (v == 3) {
                    count++;
                    v = 1;
                }
            } else {
                v = 0;
                c++;
                if (c == 3) {
                    count++;
                    c = 1;
                }
            }
        }
        System.out.println(count);
    }
}