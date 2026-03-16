package DSA.Strings;

/*
    Given a string, find the length of the longest palindromic sub-string.

    T.C - O(N^2) and S.C - O(1)

    -> We can leverage Manacher's algorithm to solve this problem in O(N) - T.C
*/
public class LongestPalindromeSubString {

    public static int lengthOfLongestPalindromeSubString(int i, int j, String str){
        int palindromeLength = 0;
        while (i>=0 && j<str.length() && str.charAt(i) == str.charAt(j)){
            palindromeLength = j-i+1;
            i -= 1;
            j += 1;
        }
        return palindromeLength;
    }

    public static void main(String[] args) {
        String str = "sjhvcjkmadamkhfei";
        int result = Integer.MIN_VALUE;
        for (int i=0;i<str.length();i++){
            result = Math.max(result, lengthOfLongestPalindromeSubString(i, i, str));
            result = Math.max(result, lengthOfLongestPalindromeSubString(i, i+1, str));
        }
        System.out.println("Longest palindrome sub-string length: "+ result);
    }

}
