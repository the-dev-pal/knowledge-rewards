package Java.StreamAPIs.InterviewProblems;

import java.util.Arrays;
import java.util.List;

public class CheckIfStringAvailable {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        String str = "kiwi";
        boolean isAvailable = strings.stream()
                .anyMatch(s-> s.equals(str));

        System.out.println(isAvailable);
    }

}
