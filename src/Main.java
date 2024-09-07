import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Retrieve the list of employees from the EmployeeData class
        List<Employee> employees = EmployeeData.getEmployees();

        // Create a list of employee names and their departments
        List<String> nameDepartmentList = employees.stream()
                .map(EmployeeData.getNameAndDepartment)
                .collect(Collectors.toList());
        System.out.println("List of Employees and Department:");
        nameDepartmentList.forEach(System.out::println);
        System.out.println();

        // Create a list of employee names and their job titles
        List<String> nameJobTitleList = employees.stream()
                .map(EmployeeData.getNameAndJobTitle)
                .collect(Collectors.toList());
        System.out.println("List of Employees and Job Title:");
        nameJobTitleList.forEach(System.out::println);
        System.out.println();

        // Calculate the average salary of all employees
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("The average salary is: " + averageSalary);
        System.out.println();

        // Filter employees who are older than 25 years
        int ageThreshold = 25;
        List<Employee> filteredEmployeesByAge = employees.stream()
                .filter(employee -> employee.getAge() > ageThreshold)
                .collect(Collectors.toList());
        System.out.println("Filter by Age:");
        filteredEmployeesByAge.forEach(employee -> System.out.println(employee.getName() + " (" + employee.getAge() + ")"));
        System.out.println();

        // Filter employees who are in the IT department
        String department = "IT";
        List<Employee> filteredEmployeesByDepartment = employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .collect(Collectors.toList());
        System.out.println("Filter by Department:");
        filteredEmployeesByDepartment.forEach(employee -> System.out.println(employee.getName() + " (" + employee.getPosition() + ") - " +
                "Department: " + employee.getDepartment() + ", " +
                "Salary: " + employee.getSalary()));
    }
}
