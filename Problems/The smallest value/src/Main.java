import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        sc.close();

        long i = 1;
        long smallest = 1;
        while (smallest <= m) {
            i++;
            smallest *= i;
        }
        System.out.println(i);
    }
}