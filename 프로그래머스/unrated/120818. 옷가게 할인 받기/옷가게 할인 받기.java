class Solution {
    public int solution(int price) {
        double answer = price;
        
        if (answer >= 500000){
            answer = price * 0.8;
        } else if (answer >= 300000){
            answer = price * 0.9;
        } else if (answer >= 100000){
            answer = price * 0.95;
        }
        
        return (int)answer;
    }
}