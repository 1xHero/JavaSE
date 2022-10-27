package source;
import java.util.ArrayList;

public class Manager extends employee{
    double bonus;

    public Manager(String name, String surname, double salary, double bonus, int managerId) throws FieldLengthLimitException, IncorrectSalaryException{
        this.id = nextid++;


        if(salary <= 0){
            throw new IncorrectSalaryException("ID" + id + ": Salary must be a positive number");
        } else {
            this.salary = salary;
            this.bonus = bonus;
        }


        if(name.length()>12 || surname.length()>12){
            throw new FieldLengthLimitException("ID" + id + ": Name must be less then 12 symbols");
        } else {
            this.name = name;
            this.surname = surname;
        }


        this.managerId = managerId;
        this.boss = new ArrayList<employee>();
    }

    public void printEmployeeList(){
        System.out.println("ID" + id + ": Name - " + name + ":: Surname - " + surname + ":: Salary - "+ salary + ":: Bonus: " + bonus + ":: Manager ID: " + managerId);
    }
}
