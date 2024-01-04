import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            boolean[] baskets = new boolean[31];
            for (int i = 0; i < 28; i++) {
                int submittedNumber = Integer.parseInt(br.readLine());
                baskets[submittedNumber] = true;
            }
            for (int a = 1; a <= 30; a++) {
                if (!baskets[a]) {
                    bw.write(a + "\n");
                }
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