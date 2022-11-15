package oOP.Task2;

public class FullTime extends Employee{

    public FullTime(String name, int salary) {
        super(name, salary);
    }

    public FullTime() {
    }

    @Override
    public double increase() {
        return getSalary()*1.5;
    }
}
