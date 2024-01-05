class Solution {
    public int solution(int n) {
        double sqrtValue = Math.sqrt(n);
        int intValue = (int)sqrtValue;
         if (intValue * intValue == n) {
            return 1;
        } else {
            return 2;
        }
    }
}