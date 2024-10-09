class Solution {
    public int minLength(String s) {
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            result.append(c);
        
        if(result.length() >= 2){
                if (result.charAt(result.length() - 1) == 'B' && result.charAt(result.length() - 2) == 'A') {
                    result.delete(result.length() - 2, result.length()); // Remove "AB"
                } else if (result.charAt(result.length() - 1) == 'D' && result.charAt(result.length() - 2) == 'C') {
                    result.delete(result.length() - 2, result.length()); // Remove "CD"
                }
            }
        }
        return result.length();
    }
}
