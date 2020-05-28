import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // write your code here

        int[] box1Line = new int[3];
        int[] box2Line = new int[3];

        for (int i = 0; i < 3; i++) {
            box1Line[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            box2Line[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(box1Line);
        Arrays.sort(box2Line);

        if (box1Line[0] == box2Line[0] && box1Line[1] == box2Line[1] && box1Line[2] == box2Line[2]) {
            System.out.println("Box 1 = Box 2");
        } else if (box1Line[0] >= box2Line[0] && box1Line[1] >= box2Line[1] && box1Line[2] >= box2Line[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (box1Line[0] <= box2Line[0] && box1Line[1] <= box2Line[1] && box1Line[2] <= box2Line[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }
}

