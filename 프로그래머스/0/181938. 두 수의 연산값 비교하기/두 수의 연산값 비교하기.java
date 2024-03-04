class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int n = String.valueOf(b).length();
        
        int answer_a = (a * (int)Math.pow(10, n)) + b;
        int answer_b = 2 * a* b;
        
        if(answer_a >= answer_b){
            answer = answer_a;
        } else if (answer_a < answer_b){
            answer = answer_b;
        }
        
        return answer;
    }
}