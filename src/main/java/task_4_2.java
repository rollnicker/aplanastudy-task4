import gifts.Candy;
import gifts.Chocolate;
import gifts.Gifts;
import gifts.Jellybean;

public class task_4_2 {
    public static void main(String[] args) {
        Candy lolipop = new Candy("Lolipop", 0.5, 3);
        Candy caramel = new Candy("Caramel", 0.7, 2);
        caramel.setSize("big");
        lolipop.setSize("small");
        Chocolate chocolate1 = new Chocolate("Россия", 1.2, 6);
        Chocolate chocolate2 = new Chocolate("Alpen gold", 1, 3);
        chocolate1.setColor("Dark");
        chocolate2.setColor("white");
        Jellybean jelly1 = new Jellybean("Haribo", 1, 8);
        Jellybean jelly2 = new Jellybean("Fruit-tella", 1, 5);
        jelly1.setFlavour("coca-cola");
        jelly2.setFlavour("fruits");

        Gifts[] box = {lolipop, caramel, chocolate1, chocolate2, jelly1, jelly2};
        System.out.println("In your box:");
        for (Gifts someGifts : box) {
            System.out.println(someGifts.toString());
        }
        double allcost = 0;
        for (Gifts someGifts : box) {
            double x = someGifts.getCost();
            allcost = x + allcost;
        }
        double allweight = 0;
        for (Gifts someGifts : box) {
            double x = someGifts.getWeight();
            allweight = x + allweight;
        }
        System.out.println("Cost of the gift: " + allcost);
        System.out.println("Weight of the gift: " + allweight);
    }
}
