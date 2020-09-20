package gifts;

public class Candy extends Gifts {
    private String size;

     public Candy(String name, double weight, double cost) {
        super(name, weight, cost);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Candy: " + super.toString() + ", size = " + size + "]";
    }
}
