public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public  void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public  double getSalarySum(){
        double sum = 0;
        for (Employee employee : employees) {
            sum+= employee.getSalary();
        }
        return sum;
    }
    public  Employee getEmployeeWithMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }
    public  Employee getEmployeeWithMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }
    public  double getAverageSalary() {
        return getSalarySum() / employees.length;
    }

    public  void printAllNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public  void changeSalaryByPercent(int percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + employee.getSalary() / 100.0 * percent);
        }
    }
    public  double getSalarySum(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (department == employee.getDepartment()) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public  Employee getEmployeeWithMinSalary(int department) {
        Employee min = null;
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }
    public  Employee getEmployeeWithMaxSalary(int department) {
        Employee max = null;
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }
    public  double getAverageSalary(int department) {
        int quantity = 0;
        double salarySum = 0;
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            quantity++;
            salarySum += employee.getSalary();
        }
        return salarySum / quantity;
    }
    public  void changeSalaryByPercent(int percent,int department) {
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            employee.setSalary(employee.getSalary() + employee.getSalary() / 100.0 * percent);
        }
    }
    public  void printAll(int department) {
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            System.out.println(employee);
        }
    }
    public  void printAllWithSalaryMore(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.printf(String.format("Сотрудник: %s, id = %s, Зарплата = %s%n",
                        employee.getFullName(), employee.getId(), employee.getSalary()));
            }
        }
    }
    public  void printAllWithSalaryLess(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.printf(String.format("Сотрудник: %s, id = %s, Зарплата = %s%n",
                        employee.getFullName(), employee.getId(), employee.getSalary()));
            }
        }
    }
}
