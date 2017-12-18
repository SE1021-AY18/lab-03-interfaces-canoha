/*
 * SE1021
 * Winter 2017-2018
 * Author: Harim Cano
 * Lab 3 - Interfaces
 * Created: 12/7/2016
 */

/**
 * This class deals with the sheet metal information
 * @author Harim Cano
 * @version 1
 */
public class SheetMetal implements Part {

    public static final double LBS_MULTIPLIER = 0.1;
    private double lengthInches;
    private double thicknessInches;
    public static final double USD_MULTIPLIER = 0.50;
    private double widthInches;


    @Override
    public double getCost() {
        return 0;
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
    public void printBillOfMaterials() {

    }

    public SheetMetal(double lengthInches, double widthInches, double thicknessInches){
        //TODO
    }
}

