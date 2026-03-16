package DSA.CarryForwardAndSubArrays;

public class SmallestMaxMinSubArray {

    public static int smallestMaxMinSubArray(int[] array){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE,
                max_index = -1, min_index = -1, result=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if (max<array[i])
                max = array[i];
            if(min>array[i])
                min = array[i];
        }
        // if both min and max are same.
        if(min==max){
            return 1;
        }
        for (int i=0;i<array.length;i++) {
            if(array[i] == max){
                max_index = i;
            }else if (array[i] == min){
                min_index = i;
            }
            if(max_index!=-1 && min_index!=-1){
                if(max_index>min_index){
                    // result = result<max_index-min_index?result:max_index-min_index
                    result = Math.min(result, max_index - min_index+1);
                }else {
                    // result = result<min_index-max_index?result:min_index-max_index
                    result = Math.min(result, min_index - max_index+1);
                }
            }
//            if (array[i] == max) {
//                max_index = i;
//                if (min_index != -1) {
//                    result = result < (min_index - max_index + 1) ? result : (min_index - max_index + 1);
//                }
//            } else if (A[i] == min) {
//                min_i = i;
//                if (max_i != -1) {
//                    ans = ans < (max_i - min_i + 1) ? ans : (max_i - min_i + 1);
//                }
//            }
        }
        return result;
    }

    /*
        Given an array of 'N' integers, return the length of the smallest sub-array, which
        contains both maximum and minimum of the array.
    */
    /*
    Observations:
        -> Min and Max will always occur at the boundaries of the sub-array
        -> Frequency of the Mina and Max will always be '1'.
    */
    // T.C - O(N) & S.C - O(1)
    public static void main(String[] args) {

        int[] array = {4,1,7,0,2,8,1,9,5,0,6};

        System.out.println(smallestMaxMinSubArray(array));

    }

}
