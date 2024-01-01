class Solution {
    public int[] solution(int n) {
         int count = n / 2 + n % 2;
        
        int[] result = new int[count];
        
        for (int i = 1, idx = 0; i <= n; i += 2, idx++) {
            result[idx] = i;
        }
        
        return result;
    }
}