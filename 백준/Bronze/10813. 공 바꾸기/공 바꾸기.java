import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] baskets = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                baskets[i] = i;
            }

            for (int a = 0; a < m; a++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st2.nextToken());
                int j = Integer.parseInt(st2.nextToken());

                int temp = baskets[i];
                baskets[i] = baskets[j];
                baskets[j] = temp;

            }
            for (int c = 1; c <= n; c++) {
                bw.write(baskets[c] + " ");
            }

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}