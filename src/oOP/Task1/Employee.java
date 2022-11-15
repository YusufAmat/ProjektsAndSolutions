package oOP.Task1;

public class Employee extends Member{

    private String specialization;
    public Employee(String name, int age, int phoneNumber, String address, int salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization=specialization;
    }

    public Employee() {
        super();
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String printSalary() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge()+
                ", phoneNumber=" + getPhoneNumber() +
                ", address='" + getAddress() + '\'' +
                ", salary=" + getSalary() +
                ", specialization=" + getSpecialization() +
                '}';
    }
}
