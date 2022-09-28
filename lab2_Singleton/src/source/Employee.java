package source;

import java.util.Objects;

public class Employee {

    protected int id;
    protected static int nextId=0;
    protected String name;
    protected String surname;
    protected String department;
    protected double salary;
    protected int managerID;



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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getManagerID() {
        return managerID;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Employee(String name,String surname,double salary){

        this.id = nextId++;
        setName(name);
        setSurname(surname);
        setSalary(salary);

    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name,surname,salary);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Employee emp = (Employee) o;
        return Double.compare(emp.salary, salary) == 0 && Objects.equals(name, emp.name) && Objects.equals(surname, emp.surname);
    }


    public void printEmployee(){

        System.out.println("Employee Id: "+getId()+" Name is: "+getName()+" "+ getSurname() + " Salary is:"+ getSalary());


    }


}
