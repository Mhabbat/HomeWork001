package Seminar1;

public class Pampers extends Product {
    private int size;
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public Pampers(String brand,String name,double price, int size){
        super(brand, name, price);
        this.size = size;
    }
    @Override
    public String displayInfo() {
        return String.format("[МОЛОКО] %s - %s - %.2f -  размер: %d", brand, name, price,size);
    }
}
