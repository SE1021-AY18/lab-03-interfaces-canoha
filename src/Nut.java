/*
 * SE1021
 * Winter 2017-2018
 * Author: Harim Cano
 * Lab 3 - Interfaces
 * Created: 12/7/2016
 */

/**
 * the
 * @author Harim Cano
 * @version 1
 */
public class Nut implements Part {

    private double diameterInches;
    //public static final double LBS_MULTIPLIER = 0.01;
    //public static final double USD_MULTIPLIER = 0.5;

    public void Nut(double diameterInches){
        //TODO
    }

    @Override
    public void printBillOfMaterials() {

    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
