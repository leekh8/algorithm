class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int index = 0;
        int com = 0;
        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]) {
                max = numbers[i];
                index = i;
            }
        }
        for(int i = 0; i < numbers.length; i++){
            if(index != i){
                if(com < max * numbers[i]) com = max * numbers[i];
            }
        }
           
        answer = com;
        return answer;
    }
}