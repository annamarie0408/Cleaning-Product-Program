import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Chemical {

    public String getChemicalName();
    public void setChemicalName(String chemicalName) ;
    public String getHazards() ;
    public void setHazards(String hazards);
    public String getPrecautions() ;
    public void setPrecautions(String precautions) ;
    public ArrayList<String> getUses() ;
    public void setUses(ArrayList<String> uses) ;
    public String getFirstAid() ;
    public void setFirstAid(String firstAid) ;
}
