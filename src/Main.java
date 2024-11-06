public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Иван Иванович Иванов0", 30_000, 1);
        employeeBook.addEmployee("Иван Иванович Иванов1", 40_000, 2);
        employeeBook.addEmployee("Иван Иванович Иванов2", 55_000, 3);
        employeeBook.addEmployee("Иван Иванович Иванов3", 60_000, 3);
        employeeBook.addEmployee("Иван Иванович Иванов4", 70_000, 4);
        employeeBook.addEmployee("Иван Иванович Иванов5", 80_000, 4);
        employeeBook.addEmployee("Иван Иванович Иванов6", 90_000, 4);
        employeeBook.addEmployee("Иван Иванович Иванов7", 20_000, 1);
        employeeBook.addEmployee("Иван Иванович Иванов8", 150_000, 5);
        employeeBook.addEmployee("Иван Иванович Иванов9", 60_000, 2);

        employeeBook.printAllEmployees();
        employeeBook.deleteEmployee("Иван Иванович Иванов5");
        employeeBook.printAllEmployees();


        System.out.println("Общая зарплата: " + employeeBook.summarySalary());
        System.out.println("Минимальная зарплата: " + employeeBook.minSalary());
        System.out.println("Максимальная зарплата: " + employeeBook.maxSalary());
        System.out.println("Средняя зарплата: " + employeeBook.averageSalary());
        System.out.println(employeeBook.minDepartmentSalary(4));

        employeeBook.printEmployee(3);
    }
}