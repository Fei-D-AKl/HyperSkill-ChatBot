import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // put your code here
        String cityName = sc.nextLine();
        
        sc.close();
        
        System.out.println(cityName.endsWith("burg"));
    }
}
