import java.util.Objects;

public class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private double baseSalary;




    public Employee(String employeeId, String firstName, String lastName, double baseSalary) {

        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;


    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateMonthlyCost() {
        return getBaseSalary();
    }

    public String introduceYourself() {
        return "Hello! My name is " + firstName + " " + lastName + ". Nice to meet you!";
    }

    @Override
    public String toString() {
        return "\n> ID: " + employeeId + "\n" + "> Name: " + firstName + "\n" + "> Surname: " + lastName + "\n" + "> Salary: " + calculateMonthlyCost() + " PLN";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(employeeId);
    }

}
