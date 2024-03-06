import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 개수 N
        float max = Float.MIN_VALUE;

        int[] arr = new int[num]; // 1부터 N까지 배열 생성
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) max = arr[i];
        }
        float sum = 0;
        for (int i = 0; i < num; i++) {
            sum += (arr[i] * 100) / max;
        }
        System.out.println(sum / num);
    }
}