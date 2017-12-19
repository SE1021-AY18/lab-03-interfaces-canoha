/*
 * SE1021
 * Winter 2017-2018
 * Author: Harim Cano
 * Lab 3 - Interfaces
 * Created: 12/7/2016
 */

import java.text.DecimalFormat;

/**
 * This class allows for a specific part to be used but with multiple copies
 * @author Harim Cano
 * @version 1
 */
public class Duplicate implements Part {
    private final DecimalFormat weightFormat = new DecimalFormat("#.###");
    private final DecimalFormat costFormat = new DecimalFormat("0.00");
    private int numDuplicates;
    private Part identicalPart;
    /**
     * A constant that is used for calculating the discount for a person that
     * orders at least 5 identical parts.
     */
    public static final double REDUCTION_FACTOR1 = 0.95;
    /**
     * A constant that is used to calculating the discount for a person that
     * orders at least 10 identical parts.
     */
    public static final double REDUCTION_FACTOR2 = 0.9;
    /**
     * A constant for how many items a person has to order to get discount #1
     */
    public static final int USD_THRESHOLD1 = 5;
    /**
     *A constant for how many items a person has to order to get discount #2
     */
    public static final int USD_THRESHOLD2 = 10;


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
