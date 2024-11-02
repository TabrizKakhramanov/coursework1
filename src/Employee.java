import java.util.Arrays;
import java.util.Objects;

public class Employee {
    static int id;
    private String name;
    private int salary;
    private int department;

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department= department;
        id++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public static int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.deepEquals(department, employee.department);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, salary, department);
    }
    @Override
    public String toString() {
        return "ФИО сотрудника: "+this.name+", отдел: "+department+ ", зарплата: "+salary+".";
    }



}
