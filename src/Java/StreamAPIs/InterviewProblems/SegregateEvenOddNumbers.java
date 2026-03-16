package Java.StreamAPIs.InterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SegregateEvenOddNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,6,1,4,9,2,5,7);

        Map<String, List<Integer>> segregatedNumbers = numbers.stream()
                .collect(Collectors.groupingBy(
                        number -> number%2==0 ? "Even" : "Odd",
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream().sorted((a, b) -> b-a).toList()
                        )
                ));

        Map<String, List<Integer>> segregatedNumberss = numbers.stream()
                .collect(Collectors.groupingBy(
                        number -> number%2==0 ? "Even" : "Odd",
                        Collectors.toList()
                ));
        System.out.println(segregatedNumbers);
        System.out.println(segregatedNumberss);
    }

}
