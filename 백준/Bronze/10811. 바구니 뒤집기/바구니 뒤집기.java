import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // N
        int[] arr = new int[num]; // 1부터 N까지 배열 생성
        for (int i = 0; i < num; i++) {
            arr[i] = i + 1;
        }

        int count = sc.nextInt(); // M
        for (int i = 0; i < count; i++) {
            int first = sc.nextInt() - 1; // i
            int second = sc.nextInt() - 1; // j

            while (first < second) {
                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
                first++;
                second--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}