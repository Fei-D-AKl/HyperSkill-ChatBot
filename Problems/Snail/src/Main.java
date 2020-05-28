import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        System.out.println((h - b) / (a - b) + ((h - b) % (a - b) == 0 ? 0 : 1));
    }
}
