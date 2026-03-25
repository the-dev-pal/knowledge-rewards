package DSA.CarryForward.SubArrays;

/*
    Given an array of size 'N', return the length of the smallest sub-array
    which contains both max and min of the array.

    Observations:
    -> Min and Mx will always occur at the boundaries of the smallest sub-array.
    -> Min and Max will always occur only once in final smallest sub-array.
*/

public class SmallestSubArrayWIthMinAndMax {

    public static void smallestSubArrayWithMinAndMax(int[] array){
        int result = Integer.MAX_VALUE, max = Integer.MIN_VALUE,
                min = Integer.MAX_VALUE, max_index = -1, min_index = -1;
        for (int j : array) {
            if (max < j)
                max = j;
            if (min > j)
                min = j;
        }
        for (int i=0; i<array.length; i++){
            if (array[i] == max){
                max_index = i;
                if (min_index != -1){
                    result = Math.min(result, min_index - max_index + 1);
                }
            } else if (array[i] == min) {
                min_index = i;
                if (max_index != -1){
                    result = Math.max(result, max_index - min_index + 1);
                }
            }
        }
        System.out.println("Smallest sub-array length: " + result);
    }

    static void main() {
        int[] array = {1,5,9,2,0,1,4,9,7,0};
        smallestSubArrayWithMinAndMax(array);
    }

}
