package Seminar1;

public class Chocolate extends Product {

    private String color;
    private double gram;

    public String getColor() {
        return color;
    }

    public double getGram() {
        return gram;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Chocolate(String brand, String name, String color, double price, double gram) {
        super(name, brand, price);
        this.color = color;
        this.gram = gram;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %s -  %.2f - %.2f ", brand, name,color,price,gram);


    }
}