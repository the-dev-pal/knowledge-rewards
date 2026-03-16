package Java.StreamAPIs.InterviewProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUniqueSkillSet {

    /*
        Given list of employees with list of skill set.
        Return list of unique skill set among all employees
    */
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "abc", "HR", 12345, new ArrayList<>(List.of(new String[]{"Java", "Spring"}))));
        employeeList.add(new Employee(2, "bcd", "HR", 12567, new ArrayList<>(List.of(new String[]{"Python", "Flask"}))));
        employeeList.add(new Employee(3, "cde", "HR", 23456, new ArrayList<>(List.of(new String[]{"Spring", "Python", "Java"}))));

        Set<String> uniqueSkillSet = employeeList.stream()
                .flatMap(employee -> employee.getSkillSet().stream())
                .collect(Collectors.toSet());

        List<String> uniqueSkillsList = employeeList.stream()
                .flatMap(employee -> employee.getSkillSet().stream())
                .distinct()
                .toList();

        System.out.println(uniqueSkillSet);
        System.out.println(uniqueSkillsList);
    }

}
