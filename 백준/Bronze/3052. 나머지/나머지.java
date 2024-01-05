import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            Set<Integer> remainders = new HashSet<>(); 

            for (int i = 0; i < 10; i++) {
                int number = Integer.parseInt(br.readLine());
                remainders.add(number % 42);  
            }

            bw.write(remainders.size() + "\n");

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
