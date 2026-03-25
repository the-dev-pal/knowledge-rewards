package DSA.PrefixSum;

import java.util.Arrays;
/*
    Given an array of length 'N', and a 2D array where each row denotes [L,R] query.
    Find the sum of all elements from 'L' to 'R' indices.
*/
public class RangeSumQuery {

    static long[] rangeSum(int[] array, int[][] queries){
        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Given queries: " + Arrays.deepToString(queries));
        long[] prefixSum = new long[array.length];
        long[] result = new long[queries.length];
        for (int i = 0; i<array.length; i++){
            if (i==0){
                prefixSum[i] = array[i];
            }else {
                prefixSum[i] = prefixSum[i-1] + (long)array[i];
            }
        }
        System.out.println("Prefix-Sum array: " + Arrays.toString(prefixSum));
        for (int i = 0; i<queries.length; i++){
            // if left index is '0'
            if(queries[i][0] == 0){
                result[i] = prefixSum[queries[i][1]];
            }else {
                result[i] = prefixSum[queries[i][1]] - prefixSum[queries[i][0]-1];
            }
        }
        return result;
    }

    static void main() {
        int[] array = {1,2,3,4,5,6};
        int[][] queries = {{0,3},{2,5},{1,4}};

        System.out.println("Range sums: " + Arrays.toString(rangeSum(array, queries)));
    }

}
