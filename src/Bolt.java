/*
 * SE1021
 * Winter 2017-2018
 * Author: Harim Cano
 * Lab 3 - Interfaces
 * Created: 12/7/2016
 */

/**
 * This class deals with the information of the nuts
 * @author Harim Cano
 * @version 1
 */
public class Bolt implements Part {

    private double diameterInches;
    //public static final double LBS_MULTIPLIER = 0.05;
    private double lengthInches;
    //public static final double USD_MULTIPLIER = 1.00;

    public void Bolt(double diameterInches, double lengthInches){
        //TODO
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public void printBillOfMaterials() {

    }
}
