package DSA.PrefixSum;

/*
    Given an array, arr[] of size N,
    the task is to find the count of array indices
    such that removing an element from these indices
    makes the sum of even-indexed and odd-indexed array elements equal.
*/
public class OddAndEvenIndexedSums {
    static int solve(int[] array){
        if(array.length<=2)
            return 0;

        return 0;
    }
    static void main() {
        int[] array = {2, 1, 6, 4};
        System.out.println("Count of indices: "+ solve(array));
    }
}
