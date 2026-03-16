package DSA.CarryForwardAndSubArrays;

public class Client {

    // Time Complexity - O(N^2)
    public static int bruteForceApproach(String s){
        int count = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) != 'a'){
                continue;
            }
            for (int j=i+1;j<s.length();j++){
                if (s.charAt(j) != 'g'){
                    break;
                }
                count += 1;
            }
        }
        return count;
    }

    // Time Complexity - O(N) - Backward loop
    public static int optimizationBackwardLoop(String s){
        int count = 0;
        int g_count = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='g'){
                g_count += 1;
            }
            if(s.charAt(i)=='a'){
                count += g_count;
            }
        }
        return count;
    }

    // Time Complexity - O(N) - Forward loop
    public static int optimizationForwardLoop(String s){
        int count = 0;
        int g_count = 0;
        for(int i=0;i<s.length();i--){
            if(s.charAt(i)=='g'){
                g_count += 1;
            }
            if(s.charAt(i)=='a'){
                count += g_count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    }

}
