package source;

public class Employee {

    private int id;
    private static int nextId;
    private String name;
    private String Surname;
    private double salary;


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


    boolean validate_name(String n) throws  FieldLengthException{
        if(n.length()>14)
        {

            throw new FieldLengthException("Error Name is larger than max char allowed");

        }
        return true;
    }

    boolean validate_surname(String s) throws FieldLengthException {
        if(s.length()>14)
        {

            throw new FieldLengthException("Error Name is larger than max char allowed");

        }
        return true;
    }

    boolean validate_salary(double s) throws IncorrectSalaryException {
        if(s<0)
        {

            throw new IncorrectSalaryException("Error Salary should not be negative");

        }
        return true;
    }


}
