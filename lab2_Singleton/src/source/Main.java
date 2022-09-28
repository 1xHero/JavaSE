package source;
import java.util.List;



public class Main {

    public static void main(String[] args) {

        Registry hr = Registry.getInstance();

        Employee emp_1 = null;

        try {
            emp_1 = new Employee("Ahmad","Shawawreh",10000);
            emp_1.printEmployee();
            hr.addEmployee(emp_1);
        } catch (EmployeeRegistryException e) {
            e.printStackTrace();
        }
        try {
            emp_1 = new Employee("Ahmad2","Shawawreh",10000);
            emp_1.printEmployee();
            hr.addEmployee(emp_1);
        } catch (EmployeeRegistryException e) {
            e.printStackTrace();
        }
        try {
            emp_1 = new Employee("Ahmad","Shawawreh",10000);
            emp_1.printEmployee();
            hr.addEmployee(emp_1);
        } catch (EmployeeRegistryException e) {
            e.printStackTrace();
        }

    }
}
