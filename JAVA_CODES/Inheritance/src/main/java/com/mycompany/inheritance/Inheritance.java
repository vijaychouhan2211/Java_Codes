package Inheritance.src.main.java.com.mycompany.inheritance;
class Employee {
    String name;
    int emp_ID;
    String hire_date;

    public Employee(String name, int emp_ID, String hire_date) {
        this.name = name;
        this.emp_ID = emp_ID;
        this.hire_date = hire_date;
    }
    public void printData() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + emp_ID);
        System.out.println("Hire Date: " + hire_date);
    }
}
class WorkTime extends Employee {
    int num_hours;

    public WorkTime(String name, int emp_ID, String hire_date, int num_hours) {
        super(name, emp_ID, hire_date);
        this.num_hours = num_hours;
    }
    @Override
    public void printData() {
        super.printData();
        System.out.println("Number of Hours Worked: " + num_hours);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        WorkTime workTime = new WorkTime("Ravan", 420, "05-06-2026", 10);
        System.out.println("\nEmployee Information:");
        workTime.printData();
    }
}