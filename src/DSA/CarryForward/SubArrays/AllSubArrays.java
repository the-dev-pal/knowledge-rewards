package DSA.CarryForward.SubArrays;

/*
    Total number of sub-arrays in array of size 'N' = N(N+1)/2
*/

import java.util.ArrayList;
import java.util.List;

public class AllSubArrays {

    // T.C - O(N^3)
    public static void allSubArrays(int[] array){
        List<List<Integer>> allSubArrays = new ArrayList<>();
        for (int i=0; i<array.length; i++){
            for (int j=i; j<array.length; j++){
                List<Integer> subArray = new ArrayList<>();
                for (int k=i; k<=j; k++){
                    subArray.add(array[k]);
                }
                System.out.println(subArray);
                allSubArrays.add(subArray);
            }
        }
    }

    static void main() {
        int[] array = {2,4,7,1,8,9};
        allSubArrays(array);
    }

}
