public class HotPro05 {
    public String longestPalindrome(String s) {
        String resultS = "";
        int lon = 0;
        for(int midVal = 0; midVal<s.length(); midVal++) {
            int left = midVal - 1;
            int right = midVal + 1;
            while(left >= 0 && s.charAt(left) == s.charAt(midVal)) {
                left --;
            }
            while(right < s.length() && s.charAt(right) == s.charAt(midVal)) {
                right ++;
            }
            while(right < s.length() && left >= 0 && s.charAt(left) == s.charAt(right)) {
                right ++;
                left --;
            }
            if (right - left - 1 > lon) {
                resultS = s.substring(left +1,right);
                lon = right - left - 1;
            }
        }
        return resultS;
    }
}
