import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = " " + sc.nextLine() + " ";
        String[] arr = s.split(sc.nextLine());
        sc.close();

        System.out.println(arr.length - 1);
    }
}