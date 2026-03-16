package Java.StreamAPIs.InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringInList {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("appljhvjhe", "banana", "orange", "grape");
        Optional<String> longest = strings.stream().max((str1, str2) -> str1.length() - str2.length());
        Optional<String> longestString = strings.stream().max(Comparator.comparingInt(String::length));

        System.out.println(longest.get());
    }

}
