import java.util.Random;

public class Main {
    private static final Random random = new Random(2);

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(6);
        employeeBook.add("Petrov Ivan", 30000, 1);
        employeeBook.add("Ivanov Petr", 27000, 2);
        employeeBook.add("Svetlov Kirill", 29000, 2);

//        employeeBook.printAll(2);
        System.out.println(employeeBook.getEmployeeWithMaxSalary());
//        employeeBook.changeSalaryByPercent(100, 1);
//        employeeBook.printAll();
//        System.out.println();
//        employeeBook.printAllNames();
//        employeeBook.printAll();

//        System.out.println(employeeBook.getById(2));
    }

}