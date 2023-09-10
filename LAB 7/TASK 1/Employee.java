public class Employee {
    private static int totalEmployees = 0;  // Static field to keep track of total employees
    private int employeeId;
    private String name;

    public Employee(String name) {
        this.name = name;
        this.employeeId = ++totalEmployees;  // Assign a unique ID to each employee
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John");
        Employee emp2 = new Employee("Alice");
        Employee emp3 = new Employee("Bob");

        System.out.println(emp1.getName() + "'s ID: " + emp1.getEmployeeId());
        System.out.println(emp2.getName() + "'s ID: " + emp2.getEmployeeId());
        System.out.println(emp3.getName() + "'s ID: " + emp3.getEmployeeId());

        System.out.println("Total employees: " + Employee.getTotalEmployees());
    }
}
