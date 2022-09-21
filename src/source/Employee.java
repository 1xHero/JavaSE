package source;

public class Employee extends FieldLengthException{

    private int id;
    static int nextId;
    String name;
    String Surname;
    double salary;


    public Employee() {

    }

    public Employee(int id, String name, String surname, double salary) {

        this.id = id;
        this.name = name;
        Surname = surname;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
