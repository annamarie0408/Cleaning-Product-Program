import java.util.ArrayList;

public class CleaningProduct extends Product implements Chemical {

    //This method will extend from the Product class (name, price, sku) and use the interface of the Chemical class.
    private String chemicalName;
    private String hazards;
    private String precautions;
    private String firstAid;
    private ArrayList<String> uses;

    //Getters and Setters
    public String getChemicalName() {
        return chemicalName;
    }
    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }
    public String getHazards() {
        return hazards;
    }
    public void setHazards(String hazards) {
        this.hazards = hazards;
    }
    public String getPrecautions() {
        return precautions;
    }
    public void setPrecautions(String precautions) {
        this.precautions = precautions;
    }
    public String getFirstAid() {
        return firstAid;
    }
    public void setFirstAid(String firstAid) {
        this.firstAid = firstAid;
    }
    public ArrayList<String> getUses() {
        return uses;
    }
    public void setUses(ArrayList<String> uses) {
        this.uses = uses;
    }

    //Constructor
    public CleaningProduct(String name, int sku, double price, String chemicalName, String hazards, String precautions, String firstAid, ArrayList<String> uses) {
        super(name, sku, price);
        this.chemicalName = chemicalName;
        this.hazards = hazards;
        this.precautions = precautions;
        this.firstAid = firstAid;
        this.uses = uses;
    }

    //To String for printing purposes later!
    @Override
    public String toString() {
        return super.toString() +
                "chemicalName= " + chemicalName +
                ", hazards= " + hazards +
                ", precautions= " + precautions  +
                ", firstAid= " + firstAid +
                ", uses=" + uses;
    }
}
