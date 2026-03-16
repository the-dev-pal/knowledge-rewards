package Java.StreamAPIs.InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumberInList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 8, 6, 10);
        Optional<Integer> secondLargest = numbers.stream().sorted((num1,num2) -> num2 - num1)
                .skip(1)
                .findFirst();
        System.out.println(secondLargest.get());
    }

}
