import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int[] triples = new int[sc.nextInt()];

        for (int i = 0; i < triples.length; i++) {
            triples[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < triples.length - 2; i++) {
            int j = i + 1;
            if (triples[i] + 1 == triples[j] && triples[j] + 1 == triples[j + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
