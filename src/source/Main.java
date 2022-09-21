package source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Employee emp = new Employee();
        Scanner in = new Scanner(System.in);

        String name;
        String surName;
        double salary;

        System.out.println("Add new Employee\n");
        System.out.println("Enter Name:");

        name = in.nextLine();

        if(name.length()>6)
        {
             new FieldLengthException("Error Name is larger than max char allowed");
        }else
        {
            emp.setName(name);
        }

        System.out.println("Enter Surname:");

        surName = in.nextLine();

        if(surName.length()>6)
        {
            new FieldLengthException("Error Surname is larger than max char allowed");
        }else{
            emp.setSurname(surName);
        }

        System.out.println("Enter Salary:");

        salary = in.nextDouble();

        if(salary<0)
        {
            new IncorrectSalaryException("Error Salary should not be negative");
        }else {
            emp.setSalary(salary);
        }

        System.out.println("Name is :"+ emp.getName());
        System.out.println("Surname is :"+ emp.getSurname());
        System.out.println("Salary is :"+ emp.getSalary());



    }
}
