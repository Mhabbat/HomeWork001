package Seminar1;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }


    public BottleOfMilk getBottleofMilk(double volume, int fat) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (bottleOfMilk.getVolume() == volume && bottleOfMilk.getFat() == fat) {
                    return bottleOfMilk;
                }
            }
        }
        return null;

    }

    public Chocolate getChocolate(double gram) {
        for (Product product : products) {
            if (product instanceof Chocolate) {
                Chocolate chocolate = (Chocolate) product;
                if (chocolate.getGram() == gram) {
                    return chocolate;
                }
            }
        }
        return null;
    }
    public Pampers getPampers(int size) {
        for (Product product: products) {
            if (product instanceof Pampers) {
                Pampers pampers = (Pampers) product;
                if (pampers.getSize() == size) {
                    return pampers;
                }
            }
        }
        return null;
    }
}