package oOP.Task1;

public class Manager extends Member{
    private String department;
    public Manager(String name, int age, int phoneNumber, String address, int salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public Manager() {
        super();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String printSalary() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge()+
                ", phoneNumber=" + getPhoneNumber() +
                ", address='" + getAddress() + '\'' +
                ", salary=" + getSalary() +
                ", department=" + getDepartment() +
                '}';
    }
}
