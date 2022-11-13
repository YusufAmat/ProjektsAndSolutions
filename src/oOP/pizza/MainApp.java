package oOP.pizza;

public class MainApp {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Small" , 2 , 1 , 1);
        Pizza pizza2 = new Pizza("Medium" , 2 , 1 , 1);
        Pizza pizza3 = new Pizza("Large" , 2 , 1 , 1);


        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
        System.out.println(pizza3.getDescription());
    }
}
