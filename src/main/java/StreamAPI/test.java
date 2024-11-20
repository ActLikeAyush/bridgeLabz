package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class test{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 95000),
                new Employee(2, "Bob", 85000),
                new Employee(3, "Charlie", 100000)
        );

        for(Employee i:employees){
            System.out.println(i.getName());
        }
        // Use map to transform each Employee object into just their name
        List<String> employeeNames = employees.stream()
                .map(Employee::getName) // Extract the name of each Employee
                .collect(Collectors.toList());

        System.out.println(employeeNames); // Output: [Alice, Bob, Charlie]

        List<Double> employeeNamess = employees.stream()
                .map(i->i.getSalary()*1.10) // Extract the name of each Employee
                .collect(Collectors.toList());
        System.out.println(employeeNamess);
    }
}
