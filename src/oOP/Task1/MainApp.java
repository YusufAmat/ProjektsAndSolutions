package oOP.Task1;

public class MainApp {
    /* TODO 1 Create a class named 'Member' having the following members:
        Data members
        1 - Name
        2 - Age
        3 - Phone number
        4 - Address
        5 - Salary
        It also has a method named 'printSalary' which prints the salary of the members.
        Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes
        have data members 'specialization' and 'department' respectively.
        Now, assign name, age, phone number, address and salary to an employee and a manager by making an object
        of both of these classes and print the same.*/
    public static void main(String[] args) {
        Employee e = new Employee("Ahmet", 28, 52466585,"Erkrath",3000,"Java");
        Manager m = new Manager("Yusuf", 32, 524632585,"Erkrath",5000, "Software");

        System.out.println(m.printSalary());
        System.out.println(e.printSalary());
    }
}
