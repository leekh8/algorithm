import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((b + c) >= 60) {
            System.out.println(((a + ((b + c) / 60)) % 24) + " " + ((b + c) % 60));
        } else {
            System.out.println(a + " " + (b + c));
        }
    }
}