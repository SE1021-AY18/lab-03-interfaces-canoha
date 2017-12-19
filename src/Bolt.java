/*
 * SE1021
 * Winter 2017-2018
 * Author: Harim Cano
 * Lab 3 - Interfaces
 * Created: 12/7/2017
 */
import java.text.DecimalFormat;

/**
 * This class implements Part and it represents a traditional bolt
 * used for parts.
 * @author Harim Cano
 * @version 1
 */
public class Bolt implements Part {
    private double diameterInches;
    private double lengthInches;
    /**
     * A constant that is used to calculate the weight of a bolt
     */
    public static final double LBS_MULTIPLIER = 0.05;
    /**
     * A constant that is used to calculate the weight of a bolt
     */
    public static final double USD_MULTIPLIER = 1.00;

    /**
     * Default constructor
     * @param diameterInches is the diameter of the bolt in inches
     * @param lengthInches is the length of the bolt in inches
     */
    public Bolt(double diameterInches, double lengthInches){
        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
    }

    /**
     * Returns the name and size of a bolt
     * @return the name/size of bolt
     */
    @Override
    public String getName() {
        String name = "bolt";
        String measurementSeparator = "x";
        return diameterInches+ measurementSeparator+ lengthInches+ name;
    }

    /**
     * Returns the weight of the bolt
     * @return the weight of bolt
     */
    @Override
    public double getWeight() {
        return LBS_MULTIPLIER* Math.pow(diameterInches,2)*lengthInches;
    }

    /**
     * Returns the cost of the bolt
     * @return the cost of bolt
     */
    @Override
    public double getCost() {
        return USD_MULTIPLIER*diameterInches*lengthInches;
    }

    /**
     * Prints out the bill of materials for a bolt
     */
    @Override
    public void printBillOfMaterials() {
        DecimalFormat weightFormat = new DecimalFormat("#.###");
        DecimalFormat costFormat = new DecimalFormat("0.00");
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Diameter: "+ diameterInches+ " inches");
        System.out.println("Length: "+ lengthInches+ "inches");
        System.out.println("Cost: $"+ costFormat.format(getCost()));
        System.out.println("Weight: "+ weightFormat.format(getWeight())+ " lbs");
        System.out.println();

    }
}
