package oOP.Task2;

public class MainApp {
    public static void main(String[] args) {
        //TODO 2 Problem Statement: Every employee has a standard salary of 20000TL.
        // For a full-time employee, increment the salary by 50%, and increment the salary by 25% for an intern.
        // After increasing the salary, display the incremented salary.*/

        FullTime full = new FullTime("Ahmet", 20000);
        Intern intern = new Intern("Mehmet", 20000);

        full.setSalary(full.increase());
        System.out.println(full.getSalary());

        intern.setSalary(intern.increase());
        System.out.println(intern.getSalary());

    }
}
