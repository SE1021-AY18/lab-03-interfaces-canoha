/*
 * SE1021
 * Winter 2017-2018
 * Author: Harim Cano
 * Lab 3 - Interfaces
 * Created: 12/7/2016
 */

import java.text.DecimalFormat;

/**
 * This class has to do with duplicates
 * @author Harim Cano
 * @version 1
 */
public class Duplicate implements Part {

    private int numDuplicates;
    public static final double REDUCTION_FACTOR1 = 0.95;
    public static final double REDUCTION_FACTOR2 = 0.9;
    public static final int USD_THRESHOLD1 = 5;
    public static final int USD_THRESHOLD2 = 10;
    DecimalFormat weightFormat = new DecimalFormat();
    DecimalFormat costFormat = new DecimalFormat();
    private Part identicalPart;


    public Duplicate(Part identicalPart, int numDuplicates){
        //TODO
    }

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
}
