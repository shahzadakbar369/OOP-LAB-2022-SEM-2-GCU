import java.util.HashSet;

class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }
}

class EmployeeRepository {
    private HashSet<Employee> employeesSet;

    public EmployeeRepository() {
        employeesSet = new HashSet<>();
    }

    public void addEmployee(Employee employee) {
        employeesSet.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeesSet.remove(employee);
    }

    public void displayEmployees() {
        for (Employee employee : employeesSet) {
            employee.printFullName();
        }
    }
}


