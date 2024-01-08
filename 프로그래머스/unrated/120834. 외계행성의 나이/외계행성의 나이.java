class Solution {
    public String solution(int age) {
        
        String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        StringBuilder ageInAlphabets = new StringBuilder();

        while (age > 0) {
            int remainder = age % 10;
            ageInAlphabets.insert(0, alphabets[remainder]);
            age /= 10;
        }

        return ageInAlphabets.toString();
    }
}