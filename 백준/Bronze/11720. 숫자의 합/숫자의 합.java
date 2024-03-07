import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}