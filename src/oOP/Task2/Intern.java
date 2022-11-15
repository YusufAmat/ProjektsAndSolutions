package oOP.Task2;

public class Intern extends Employee{

    public Intern(String name, double salary) {
        super(name, salary);
    }

    public Intern() {
    }

    @Override
    public double increase() {
        return getSalary()*1.25;
    }
}
