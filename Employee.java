import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public abstract class Employee {
    public int salary;
    public String grade;
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public int getSalary(){
        return salary;
    }
    
    public void setGrade(String grade){
        this.grade = grade;
    }
    
    public String getGrade(){
        return grade;
    }
    
    public void label(){
        System.out.println("Employee's data:\n");
    }
}

public class Engineer extends Employee {
    private int salary;
    private String grade;
    
    @Override
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    @Override
    public int getSalary(){
        return super.salary;
    }
    
    @Override
    public void setGrade(String grade){
        this.grade = grade;
    }
    
    @Override
    public String getGrade(){
        return super.grade;
    }
}

public class Manager extends Employee {
    private int salary;
    private String grade;
    
    @Override
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    @Override
    public int getSalary(){
        return super.salary;
    }
    
    @Override
    public void setGrade(String grade){
        this.grade = grade;
    }
    
    @Override
    public String getGrade(){
        return super.grade;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        int n = Integer.parseInt(sub);
        for(int i=0;i<n;i++){
            String[] input = sc.nextLine().split(" ");
            if(input[0].equals("ENGINEER")){
                Engineer e = new Engineer();
                e.setSalary(Integer.parseInt(input[2]));
                e.setGrade(input[1]);
                e.label();
                System.out.println("GRADE : " + e.getGrade());
                System.out.println("SALARY : " + e.getSalary());
            }
            if(input[0].equals("MANAGER")){
                Manager e = new Manager();
                e.setSalary(Integer.parseInt(input[2]));
                e.setGrade(input[1]);
                e.label();
                System.out.println("GRADE : " + e.getGrade());
                System.out.println("SALARY : " + e.getSalary());
            }
        }
    }
}
