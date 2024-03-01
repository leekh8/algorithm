class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int n = String.valueOf(b).length();
        int m = String.valueOf(a).length();

        int a_answer = (a * (int)Math.pow(10, n)) + b;
        int b_answer = (b * (int)Math.pow(10, m)) + a;
        
        if (a_answer > b_answer){
            answer = a_answer;
        } else if(b_answer > a_answer){
            answer = b_answer;
        } else {
            answer = b_answer;
        }
        
        return answer;
    }
}