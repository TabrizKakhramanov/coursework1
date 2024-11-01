public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0]= new Employee("Иван Иванович Иванов0", 30_000, 1);
        employees[1]= new Employee("Иван Иванович Иванов1", 40_000, 2);
        employees[2]= new Employee("Иван Иванович Иванов2", 55_000, 3);
        employees[3]= new Employee("Иван Иванович Иванов3", 60_000, 3);
        employees[4]= new Employee("Иван Иванович Иванов4", 70_000, 4);
        employees[5]= new Employee("Иван Иванович Иванов5", 80_000, 4);
        employees[6]= new Employee("Иван Иванович Иванов6", 90_000, 4);
        employees[7]= new Employee("Иван Иванович Иванов7", 20_000, 1);
        employees[8]= new Employee("Иван Иванович Иванов8", 150_000, 5);
        employees[9]= new Employee("Иван Иванович Иванов9", 60_000, 2);






        printAllEmployees(employees);
        System.out.println("Общая зарплата: "+summarySalary(employees));
        System.out.println("Минимальная зарплата: "+minSalary(employees));
        System.out.println("Максимальная зарплата: "+maxSalary(employees));
        System.out.println("Средняя зарплата: "+averageSalary(employees));
        printAllNames(employees);


    }
    public static void printAllEmployees(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
    public static int summarySalary(Employee[] employees){
        int sum=0;
        for (int i = 0; i < employees.length; i++) {
            sum+= employees[i].getSalary();
        }
        return sum;
    }

    public static int minSalary(Employee[] employees){
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary()<min){
                min = employees[i].getSalary();
            }
        }
        return min;
    }
    public static int maxSalary(Employee[] employees){
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary()>max){
                max = employees[i].getSalary();
            }
        }
        return max;
    }
    public static int averageSalary(Employee[] employees){
        int average = summarySalary(employees)/employees.length;
        return average;
    }
    public static void printAllNames(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }

}