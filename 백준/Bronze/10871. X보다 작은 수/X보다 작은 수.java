import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            String[] array = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                if (Integer.parseInt(array[i]) < x) {
                    bw.write(String.valueOf(array[i] + " "));
                }
            }
            bw.write(String.valueOf("\n"));
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