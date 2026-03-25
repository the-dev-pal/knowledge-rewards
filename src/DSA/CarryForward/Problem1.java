package DSA.CarryForward;

/*
    Given a string 'S' of lowercase characters, return the count of (i, j) pair
    such that i<j and S[i] == 'a' and S[j] == 'g'.

    Input: "abegag"
    Output: 3
    Explanation: [(0,3), (0,5), (4,5)]
*/

public class Problem1 {

    // T.C - O(N) & S.C - O(1)
    public static int solve(String S){
        int result = 0, count_a = 0;
        for (int i=0; i<S.length(); i++){
            if(S.charAt(i) == 'a')
                count_a += 1;
            if (S.charAt(i) == 'g')
                result += count_a;
        }
        return result;
    }

    static void main() {
        String S = "abegag";
        System.out.println("Number of pairs: " + solve(S));
    }

}
