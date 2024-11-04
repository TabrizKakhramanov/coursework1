public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    EmployeeBook() {
        this.employees = new Employee[10];
    }

    public boolean addEmployee(String name, int salary, int department) {
        if (this.size > employees.length) {
            System.out.println("Нельзя добавить работника. Место закончилось.");
            return false;
        }
        Employee newEmployee = new Employee(name, salary, department);
        employees[size] = newEmployee;
        size++;
        return true;
    }

    public void deleteEmployee(String name){
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName())){
                System.out.println(employees[i].getName()+" удален.");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size-1]=null;
                size--;
                return;
            }
        }
    }

    public void printEmployee(int id){
        for (int i = 0; i < size; i++) {
            Employee employee=employees[i];
            if (employee.getId()==id){
                System.out.println(employee.toString());
            }
        }
    }



    //базовая сложность

    public void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public int summarySalary() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public int minSalary() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public int maxSalary() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public int averageSalary() {
        int average = summarySalary() / size;
        return average;
    }

    public void printAllNames() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName());
        }
    }

    public void salaryChange(int percent) {
        for (int i = 0; i < size; i++) {
            int newSalary = employees[i].getSalary() * percent / 100;
            employees[i].setSalary(newSalary);
        }
    }


    // Повышенная сложность

    public int minDepartmentSalary(int department) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if ((employees[i].getDepartment() == department) && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public int maxDepartmentSalary(int department) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if ((employees[i].getDepartment() == department) && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public int sumDepartmentSalary(int department) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public int averageDepartmentSalary(int department) {
        int element = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                element++;
            }
        }
        return sumDepartmentSalary(department) / element;
    }

    public void averageDepartmentSalary(int department, int percent) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() * percent / 100);
            }
        }
    }

    public void printAllDepartmentInfo(int department) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("ID сотрудника: " + employees[i].getId() + "ФИО: " + employees[i].getName() + " Зарплата: " + employees[i].getSalary() + ".");
            }
        }
    }

    public void printAllEmployeeSalaryBelow(int salary) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < salary) {
                System.out.println("ID сотрудника: " + employees[i].getId() + "ФИО: " + employees[i].getName() + " Зарплата: " + employees[i].getSalary() + ".");
            }
        }
    }

    public void printAllEmployeeSalaryHigher(int salary) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > salary) {
                System.out.println("ID сотрудника: " + employees[i].getId() + "ФИО: " + employees[i].getName() + " Зарплата: " + employees[i].getSalary() + ".");
            }
        }
    }
}
