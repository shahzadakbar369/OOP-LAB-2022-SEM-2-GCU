public class EmployeeRepositoryApp {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();

        // Create Employee instances
        Employee employee1 = new Employee("John", "Doe");
        Employee employee2 = new Employee("Jane", "Smith");
        Employee employee3 = new Employee("Alice", "Johnson");

        // Add employees to the repository
        repository.addEmployee(employee1);
        repository.addEmployee(employee2);
        repository.addEmployee(employee3);

        // Remove an employee from the repository
        repository.removeEmployee(employee2);

        // Display all employees in the repository
        repository.displayEmployees();
    }
}