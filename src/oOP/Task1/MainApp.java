package oOP.Task1;

public class MainApp {
    public static void main(String[] args) {
        Employee e = new Employee("Ahmet", 28, 52466585,"Erkrath",3000,"Java");
        Manager m = new Manager("Yusuf", 32, 524632585,"Erkrath",5000, "Software");

        System.out.println(m.printSalary());
        System.out.println(e.printSalary());
    }
}
