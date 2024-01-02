import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if (b >= 45) {
            System.out.println(a + " " + (b - 45));
        } else {
            System.out.println((a + 23) % 24 + " " + (b + 15));
        }
    }
}