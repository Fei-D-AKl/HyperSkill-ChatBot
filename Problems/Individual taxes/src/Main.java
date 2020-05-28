import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] c = new double[n];
        double[] p = new double[n];

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        sc.close();

        double mostTax = c[0] * p[0] / 100;
        int numberOfCompany = 1;
        for (int i = 0; i < n; i++) {
            double tmp = c[i] * p[i] / 100;
            if (tmp > mostTax) {
                mostTax = tmp;
                numberOfCompany = i + 1;
            }
        }
        System.out.println(numberOfCompany);
    }
}