class Solution {
    boolean solution(String s) {
         int countP = 0, countY = 0;
        s = s.toLowerCase(); 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p') countP++;     
            else if (c == 'y') countY++; 
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        return countP == countY;
    }
}