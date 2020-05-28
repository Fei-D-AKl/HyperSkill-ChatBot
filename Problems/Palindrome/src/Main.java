import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        sc.close();
        char[] arr = s.toCharArray();
        boolean palindrome = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}