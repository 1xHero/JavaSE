package source;

public class Manager extends Employee{

    public Manager(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;
    double bonus;

    public double getBonus() {
        return bonus;
    }


    public void printEmployee(){
        System.out.println("ID:" + id + " Name - " + getName() + " Surname - " + getSurname() + " Salary - "+ getSalary() + "Bonus: " + getBonus());
    }

}
