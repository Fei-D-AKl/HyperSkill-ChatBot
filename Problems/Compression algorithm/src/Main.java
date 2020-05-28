import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine() + " ";
        char[] arr = s.toCharArray();
        String output = "";
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
            } else {
                output += Character.toString(arr[i - 1]) + count;
                count = 1;
            }
        }
        System.out.println(output);
    }
}