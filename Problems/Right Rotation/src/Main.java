import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] s = input.split(" ");
        int rotation = sc.nextInt() % s.length;

        sc.close();

        String[] arr = new String[s.length];

        System.arraycopy(s, s.length - rotation, arr, 0, rotation);
        System.arraycopy(s, 0, arr, rotation, arr.length - rotation);

        for (String a : arr) {
            System.out.print(a + " ");
        }
    }
}