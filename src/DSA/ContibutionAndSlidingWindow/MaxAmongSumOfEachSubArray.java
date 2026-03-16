package DSA.ContibutionAndSlidingWindow;


/*
    Given an array of "N" integers, find the maximum among sum of each sub-array.

    -> Finding sum of sub-arrays is a range sum query.
    -> Using Carry Forward technique, we can solve this problem.
*/
public class MaxAmongSumOfEachSubArray {

    // T.C - O(N^2) & S.C - O(1)
    public static int maxAmongSumOfEachSubArray(int[] array){
        int result = Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            int sum = 0;
            for (int j=i;j<array.length;j++){
                sum += array[j];
                // result = result>sum ? result : sum
                result = Math.max(result, sum);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] array = {4,1,7,0,2,8,1,9,5,0,6};

        System.out.println(maxAmongSumOfEachSubArray(array));

    }

}
