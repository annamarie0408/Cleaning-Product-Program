public abstract class Product {

    //Product method that both FoodProduct and CleaningProduct are extended from
    private String name;
    private int sku;
    private double price;

    //Getter and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSku() {
        return sku;
    }
    public void setSku(int sku) {
        this.sku = sku;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //Constructor
    public Product(String name, int sku, double price) {
        this.name = name;
        this.sku = sku;
        this.price = price;
    }


    //To string for printing purposes later.
    @Override
    public String toString() {
        return "Product" +
                " name: " + name + ", sku= " + sku + ", price= $" + price + " ";
    }
}
