import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        sc.close();

        String[] arr = s.split(" ");
        boolean order = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                order = false;
            }
        }
        System.out.println(order);
    }
}