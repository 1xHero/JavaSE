package source;
import java.util.ArrayList;

public class Registry extends EmployeeRegistryException{
    static Registry instance  = null;

    ArrayList<Employee> employers = new ArrayList<>();

    private Registry(){}

    public static Registry getInstance(){
        if (instance  == null)
            instance  = new Registry();

        return instance;
    }

    public void addEmployee (Employee emp)throws EmployeeRegistryException{


        if (employers.contains(emp)){
            throw new EmployeeRegistryException("Employee" + emp.getName() + "is exist already");
        }else
        {
            employers.add(emp);
        }

    }

    public void printRegistryList(){
        for(Employee emp:employers){
            emp.printEmployee();
        }
    }

}