package gifts;

public class Chocolate extends Gifts{
    private String color;

    public Chocolate(String name, double weight, double cost) {
        super(name, weight, cost);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chocolate: " + super.toString() + ", color = " + color + "]";
    }
}
