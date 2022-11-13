package oOP.pizza;

public class Pizza {
    private String size;
    private int numberOfCheeses;
    private int numberOfSausages;
    private int numberOfSpices;

    public Pizza(String size, int numberOfCheeses, int numberOfSausages, int numberOfSpices) {
        this.size = size;
        this.numberOfCheeses = numberOfCheeses;
        this.numberOfSausages = numberOfSausages;
        this.numberOfSpices = numberOfSpices;
    }
    public Pizza() {
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public int getNumberOfCheeses() {
        return numberOfCheeses;
    }
    public void setNumberOfCheeses(int numberOfCheeses) {
        this.numberOfCheeses = numberOfCheeses;
    }
    public int getNumberOfSausages() {
        return numberOfSausages;
    }
    public void setNumberOfSausages(int numberOfSausages) {
        this.numberOfSausages = numberOfSausages;
    }
    public int getNumberOfSpices() {
        return numberOfSpices;
    }
    public void setNumberOfSpices(int numberOfSpices) {
        this.numberOfSpices = numberOfSpices;
    }

    public double calcCost(){
        double cost = 0;
        if (getSize().equalsIgnoreCase("small")) {
            cost = 10 + 2 * (numberOfCheeses + numberOfSausages + numberOfSpices);
        } else if (getSize().equalsIgnoreCase("Medium")) {
            cost = 12 + 2 * (numberOfCheeses + numberOfSausages + numberOfSpices);
        }else if (getSize().equalsIgnoreCase("Large")){
            cost = 14 + 2 * (numberOfCheeses + numberOfSausages + numberOfSpices);
        }
        return cost;
    }

    public String getDescription() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", number of Cheeses=" + numberOfCheeses +
                ", number of Sausages=" + numberOfSausages +
                ", number of Spices=" + numberOfSpices +
                ", cost of Pizza=" + calcCost() + "$" +
                '}';
    }
}
