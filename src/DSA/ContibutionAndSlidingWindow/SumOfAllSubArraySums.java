package DSA.ContibutionAndSlidingWindow;

/*
    Given an array of "N" integers, find the sum of all sub-array sums.

    -> Finding sum of sub-arrays is a range sum query.
    -> Using Carry Forward technique, we can solve this problem.

    -> Somehow we can get rid of generation each sub-array and
    can optimize the solution using contribution technique.
*/
public class SumOfAllSubArraySums {

    // T.C - O(N^2) & S.C - O(1) Using Carry Forward Technique
    public static int sumOfAllSubArraySums(int[] array){
        int result = 0;
        for(int i=0;i<array.length;i++){
            int sum = 0;
            for(int j=i;j<array.length;j++){
                sum += array[j];
                result += sum;
            }
        }
        return result;
    }

    // T.C - O(N) & S.C - O(1) using Contribution Technique
    public static int sumOfAllSubArraySumsOptimized(int[] array){
        int result = 0;
        for (int i=0;i<array.length;i++){
            result += array[i]*(i+1)*(array.length-i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,3,4}; // 1+1+3+1+3+4+3+3+4+4

        System.out.println(sumOfAllSubArraySums(array));
        System.out.println(sumOfAllSubArraySumsOptimized(array));
    }

}
