import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m;

        boolean bOrder = true;
        boolean sOrder = true;
        while (sc.hasNextInt()) {
            m = n;
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n < m) {
                bOrder = false;
                continue;
            }
            if (n > m) {
                sOrder = false;
                continue;
            }
            if (!bOrder && !sOrder) {
                break;
            }
        }
        System.out.println(bOrder || sOrder);
    }
}