class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        if (denom1 == denom2){ 
            int commonDenom = denom1;
            int commonNumer = numer1 + numer2;
            
            int gcd = gcd(commonNumer, commonDenom);
            answer = new int[]{commonNumer / gcd, commonDenom / gcd};
              }
        else {
            int commonDenom = denom1 * denom2;
            int commonNumer = numer1 * denom2 + numer2 * denom1;
            
            int gcd = gcd(commonNumer, commonDenom);
            answer = new int[]{commonNumer / gcd, commonDenom / gcd};
        }
        
        return answer;
    }
    
    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}