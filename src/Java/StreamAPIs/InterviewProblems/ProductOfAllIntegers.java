package Java.StreamAPIs.InterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductOfAllIntegers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> product = numbers.stream()
                .reduce((a,b) -> a*b);

        System.out.println(product.get());
    }

}
