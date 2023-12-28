class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String s3: s1){
            for (String s4: s2){
                if(s3.equals(s4)){
                    answer ++;
                }
            }
        }
        return answer;
    }
}