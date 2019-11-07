import java.util.ArrayList;
import java.util.Date;

public class FoodProduct extends Product implements Edible{

    //This method will extend from the Product class (name, price, sku) and use the interface of the Edible class.
    private Date expDate;
    private int refrigerationTemp;
    private int servingSize;
    private int caloriesPerServing;
    private ArrayList<String> allergens;

    //Getters and Setters
    public Date getExpDate() {
        return expDate;
    }
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    public int getRefrigerationTemp() {
        return refrigerationTemp;
    }
    public void setRefrigerationTemp(int refrigerationTemp) {
        this.refrigerationTemp = refrigerationTemp;
    }
    public int getServingSize() {
        return servingSize;
    }
    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }
    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }
    public void setCaloriesPerServing(int caloriesPerServing) {
        this.caloriesPerServing = caloriesPerServing;
    }
    public ArrayList<String> getAllergens() {
        return allergens;
    }
    public void setAllergens(ArrayList<String> allergens) {
        this.allergens = allergens;
    }

    //Constructor
    public FoodProduct(String name, int sku, double price, Date expDate, int refrigerationTemp, int servingSize, int caloriesPerServing, ArrayList<String> allergens) {
        super(name, sku, price);
        this.expDate = expDate;
        this.refrigerationTemp = refrigerationTemp;
        this.servingSize = servingSize;
        this.caloriesPerServing = caloriesPerServing;
        this.allergens = allergens;

    }

    //To string for printing purposes later.
    @Override
    public String toString() {
        return super.toString() +
                "expDate= " + expDate +
                ", refrigerationTemp= " + refrigerationTemp +
                ", servingSize= " + servingSize +
                ", caloriesPerServing= " + caloriesPerServing +
                ", allergens= " + allergens;
    }
}
