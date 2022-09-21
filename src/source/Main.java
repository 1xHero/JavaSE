package source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main extends IncorrectSalaryException{

    public static void main(String[] args) throws FieldLengthException, IncorrectSalaryException {


        Employee emp = new Employee();
        Scanner in = new Scanner(System.in);
        int i=0;

        String name;
        String surName;
        double salary;

        System.out.println("Add new Employee\n");
        System.out.println("Enter Name:");

        name = in.nextLine();

        if(emp.validate_name(name))
        {
             emp.setName(name);
        }

        System.out.println("Enter Surname:");

        surName = in.nextLine();

        if(emp.validate_surname(surName))
        {
            emp.setSurname(surName);
        }

        System.out.println("Enter Salary:");

        salary = in.nextDouble();

        if(emp.validate_salary(salary))
        {
            emp.setSalary(salary);
        }

        emp.setId(++i);


        emp.printEmployee();



    }


}
