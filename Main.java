//Review 3 Abstract Classes and Interface - Anna Collins
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File FoodFile = new File("src\\FoodProduct");
        File CleaningFile = new File("src\\CleaningProduct");
        Scanner sc = new Scanner(FoodFile);
        Scanner sc2 = new Scanner(CleaningFile);

        String name;
        String chemicalName;
        String hazards;
        String precautions;
        String firstAid;
        int sku;
        double price;

        Date expDate = new Date();
        int refrigerationTemperature;
        int servingSize;
        int caloriesPerServing;


        ArrayList uses = new ArrayList<String>();
        ArrayList allergens = new ArrayList<String>();
        ArrayList<FoodProduct> FoodProductArray = new ArrayList<>();
        ArrayList<CleaningProduct> CleaningProductArray = new ArrayList<>();

        //This is the while loop to read through the FoodProduct text file, this will look for the , to split each section into
        //a different variable and will then store it into the ArrayList for later.
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] productSpec = line.split(",");
            name = productSpec[0];
            sku = Integer.parseInt(productSpec[1]);
            price = Double.parseDouble(productSpec[2]);

            String testDate = productSpec[3];
            DateFormat formatter = new SimpleDateFormat("MM/YYYY");

            try {
                expDate = formatter.parse(testDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            refrigerationTemperature = Integer.parseInt(productSpec[4]);
            servingSize = Integer.parseInt(productSpec[5]);
            caloriesPerServing = Integer.parseInt(productSpec[6]);

            //This will add all the allergens into the allergen array to use later
            if (productSpec.length > 5) {
                for (int i = 7; i < productSpec.length; i++) {
                    allergens.add(productSpec[i]);
                }

            }
            //All items are stored into the constructor for later printing
            FoodProduct test = new FoodProduct(name, sku, price, expDate, refrigerationTemperature, servingSize, caloriesPerServing, allergens); //prints all out the allergens COME BACK
            FoodProductArray.add(test);
            allergens = new ArrayList(); //clears out the allergen ArrayList so each line has the correct info

        }

        //This is the while loop to read through the CleaningProduct text file, this will look for the , to split each section into
        //a different variable and will then store it into the ArrayList for later.
        while (sc2.hasNextLine()) {
            String line = sc2.nextLine();
            String[] cleaningSpec = line.split(",");
            name = cleaningSpec[0];
            sku = Integer.parseInt(cleaningSpec[1]);
            price = Double.parseDouble(cleaningSpec[2]);
            chemicalName = cleaningSpec[3];
            hazards = cleaningSpec[4];
            precautions = cleaningSpec[5];
            firstAid = cleaningSpec[6];

            //This will add all the uses into the uses array to use later
            if (cleaningSpec.length > 7){
                for (int i = 7; i < cleaningSpec.length; i++){
                    uses.add(cleaningSpec[i]);

                }

            }
            //All items are stored into the constructor for later printing
            CleaningProduct test = new CleaningProduct(name, sku, price, chemicalName,hazards,precautions,firstAid,uses);
            CleaningProductArray.add(test);
            uses = new ArrayList(); //clears out the allergen ArrayList so each line has the correct info
        }

        //Will loop through the FoodProductArray and print to the console
        for (FoodProduct x : FoodProductArray) {
            System.out.println(x);

        }
        //Will loop through the CleaningProductArray and print to the console
        for (CleaningProduct z: CleaningProductArray
             ) { System.out.println(z);

        }
    }
}





