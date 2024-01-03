import java.util.*;

class Solution {
        public int solution(int[] array) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int num : array) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mode = -1;
        boolean multipleModes = false;

        for (int key : counts.keySet()) {
            int count = counts.get(key);

            if (count > maxCount) {
                maxCount = count;
                mode = key;
                multipleModes = false;
            }
            else if (count == maxCount) {
                multipleModes = true;
            }
        }

        return multipleModes ? -1 : mode;
    }
}