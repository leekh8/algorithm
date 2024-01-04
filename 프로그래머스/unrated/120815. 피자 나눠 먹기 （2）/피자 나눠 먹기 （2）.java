class Solution {
    public int solution(int n) {
        int max = 1;
        
        for (int i = 1; i <= 6; i++) {
            if (n % i == 0 && 6 % i == 0 ) {
                max = i;
            }
        }
        int answer = n / max;
        
        return answer;
    }
}