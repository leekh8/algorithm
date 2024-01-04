import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int max = Integer.MIN_VALUE;
            int position = 0;

            for (int i = 1; i <= 9; i++) {
                int n = Integer.parseInt(br.readLine());

                if (n > max) {
                    max = n;
                    position = i;
                }
            }
            bw.write(max + "\n" + position);

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