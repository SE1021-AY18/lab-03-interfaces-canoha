/*
 * SE1021
 * Winter 2017-2018
 * Author: Harim Cano
 * Lab 3 - Interfaces
 * Created: 12/7/2017
 */

import java.text.DecimalFormat;

/**
 * This class implements part and represents a traditional nut
 * used for parts.
 * @author Harim Cano
 * @version 1
 */
public class Nut implements Part {
    private double diameterInches;
    /**
     * A constant that is used to calculate the weight of a nut
     */
    public static final double LBS_MULTIPLIER = 0.01;
    /**
     * A constant that is used to calculate the weight of a nut
     */
    public static final double USD_MULTIPLIER = 0.5;

    /**
     * Default constructor
     * @param diameterInches is the diameter of a nut in inches
     */
    public Nut(double diameterInches){
        this.diameterInches = diameterInches;
    }

    /**
     * Returns the name of a specific nut
     * @return the name of a nut
     */
    @Override
    public String getName() {
        return diameterInches + " inch nut";
    }

    /**
     *Returns the weight of the nut
     * @return the weight of a nut
     */
    @Override
    public double getWeight() {
        return LBS_MULTIPLIER* Math.pow(diameterInches,2);
    }

    /**
     * Returns the cost of one nut
     * @return the cost of a nut
     */
    @Override
    public double getCost() {
        return USD_MULTIPLIER*diameterInches;
    }

    /**
     *Prints out the bill of materials for a nut
     */
    @Override
    public void printBillOfMaterials() {
        DecimalFormat weightFormat = new DecimalFormat("#.###");
        DecimalFormat costFormat = new DecimalFormat("0.00");
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Diameter: "+ diameterInches+ " inches");
        System.out.println("Cost: $"+ costFormat.format(getCost()));
        System.out.println("Weight: "+ weightFormat.format(getWeight())+ " lbs");
        System.out.println();
    }

}
