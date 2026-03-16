package DSA.Strings;

/*
    Palindromes are type of words, which are same when the characters are reversed.
    Ex: DAD, MOM, MADAM, RACECAR, MALAYALAM, etc.
*/
public class Palindrome {

    // T.C - O(N) & S.C - O(1)
    public static boolean palindromeCheck(String str){
        int start_point = 0, end_point = str.length()-1;
        while (start_point<end_point){
            if(str.charAt(start_point) != str.charAt(end_point)) {
                return false;
            }
            start_point += 1;
            end_point -= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        if (palindromeCheck("MALAYALAM")){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }

}
