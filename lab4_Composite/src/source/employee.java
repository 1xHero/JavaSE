package source;

import java.util.ArrayList;
import java.util.List;

public class employee {
    protected int id;
    protected static int nextid = 0;
    protected String name;
    protected String surname;
    protected double salary;
    protected int managerId;

    protected List<employee> boss;

    public employee() {}

    public employee(String name, String surname, double salary, int managerId) throws FieldLengthLimitException, IncorrectSalaryException, EmployeeInRegistryException{
        this.id = nextid++;

        if(name.length()>15 || surname.length()>15){
            throw new FieldLengthLimitException("ID" + id + ": Name must be less then 15 symbols");
        } else {
            this.name = name;
            this.surname = surname;
        }

        if(salary <= 0){
            throw new IncorrectSalaryException("ID" + id + ": Salary must be a positive number");
        } else {
            this.salary = salary;
        }

        this.managerId = managerId;
        boss = new ArrayList<employee>();
    }

    public void add(employee a){
        boss.add(a);
    }

    public void remove(employee a){
        boss.remove(a);
    }

    public List<employee> getBoss() {
        return boss;
    }

    public String getName() {
        return name;
    }



    void printemployee(){
        System.out.println("ID" + id + ": Name - " + name + "; Surname - " + surname + "; Salary - "+ salary + "; Manager ID: " + managerId);
    }
}
