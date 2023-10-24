package streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class Employee {
    private int id;
    private String name;
    private int salary;
    private String dept;
}

public class DeptWiseSalaryAvg {
    public static void main(final String[] args) {
        final List<Employee> employeeList = Arrays.asList(
                new Employee(1, "1", 1000, "IT"),
                new Employee(2, "2", 1000, "IT"),
                new Employee(3, "3", 1000, "IT"),
                new Employee(4, "4", 1000, "OP"),
                new Employee(5, "5", 1000, "OP"),
                new Employee(6, "6", 1000, "OP")
        );
        final Map<String, Double> collect = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDept, TreeMap::new, Collectors.averagingInt(value -> value.getSalary()))
        );
        System.out.println(collect);
    }
}



