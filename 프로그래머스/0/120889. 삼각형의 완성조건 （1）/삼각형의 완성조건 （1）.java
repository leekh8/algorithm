class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int index = 0;
        for(int i = 0; i < sides.length; i++){
            if(sides[i] > max) {
                max = sides[i];
                index = i;
            }
        }
        if(index == 1) {
            if(max < (sides[0] + sides[2])) answer = 1;
             else answer = 2;
        }else{
            if(max < (sides[Math.abs(index-1)] + sides[Math.abs(index-2)])) answer = 1;
            else answer = 2;
        }
        
        return answer;
    }
}