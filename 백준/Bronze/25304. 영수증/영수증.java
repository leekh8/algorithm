import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, answer = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            c = sc.nextInt();
            d = sc.nextInt();

            answer += (c * d);
        }

        if (a == answer) {

            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}