package Java.StreamAPIs.InterviewProblems;

import java.util.*;
import java.util.stream.Collectors;

public class FindTopTwoEmployees {

    /*
        Given employees with department and salary,
        return top 2 highest paid employees for each department
    */
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "abc", "HR", 12345));
        employeeList.add(new Employee(2, "bcd", "HR", 12567));
        employeeList.add(new Employee(3, "cde", "HR", 23456));

        employeeList.add(new Employee(4, "xyz", "IT", 74657));
        employeeList.add(new Employee(5, "stu", "IT", 83289));
        employeeList.add(new Employee(6, "uvw", "IT", 54389));

        employeeList.add(new Employee(7, "mno", "Support", 38992));
        employeeList.add(new Employee(7, "pqr", "Support", 92354));
        employeeList.add(new Employee(7, "jkl", "Support", 74388));

        Map<String, List<Employee>> top2ByDept = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream().
                                        sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                                        .limit(2)
                                        .collect(Collectors.toList())
                        )
                ));

        top2ByDept.forEach(
                (department, list) ->
                        System.out.println(department + " : " + list)
        );

    }

}
