package gifts;

public class Jellybean extends Gifts{
    private String flavour;

    public Jellybean(String name, double weight, double cost) {
        super(name, weight, cost);
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String color) {
        this.flavour = color;
    }

    @Override
    public String toString() {
        return "Jellybean: " + super.toString() + ", flavour = " + flavour + "]";
    }
}
