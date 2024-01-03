import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int T = Integer.parseInt(br.readLine());
            int count = 0;

            String[] inputs = br.readLine().split(" ");
            int v = Integer.parseInt(br.readLine());

            for (int i = 0; i < T; i++) {
                if (Integer.parseInt(inputs[i]) == v) {
                    count++;
                }
            }
            bw.write(String.valueOf(count));

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