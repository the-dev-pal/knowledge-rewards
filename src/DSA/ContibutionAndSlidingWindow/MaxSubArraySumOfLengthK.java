package DSA.ContibutionAndSlidingWindow;

/*
    Given an array of size "N",
    find the maximum sub-array sum for subarrays with length "K"

    -> Solving using Sliding Window Technique.
*/
public class MaxSubArraySumOfLengthK {

    public static int maxSubArraySumOfLengthK(int[] array, int K){
        int start_point=1, end_point=K, result=Integer.MIN_VALUE, sum=0;
        for (int i=0;i<K;i++){
            sum += array[i];
        }
        result = Math.max(sum, result);
        while (end_point<array.length){
            sum = sum + array[end_point] - array[start_point-1];
            result = Math.max(sum,result);
            start_point += 1;
            end_point += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {4,1,7,0,2,8,1,9,5,0,6};
        int K = 4;

        System.out.println(maxSubArraySumOfLengthK(array, K));
    }

}
