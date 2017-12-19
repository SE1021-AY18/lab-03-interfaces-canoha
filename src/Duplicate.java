/*
 * SE1021
 * Winter 2017-2018
 * Author: Harim Cano
 * Lab 3 - Interfaces
 * Created: 12/7/2017
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

    /**
     * Default constructor
     * @param identicalPart is the part that has duplicates
     * @param numDuplicates is the amount of duplicates for a part
     */
    public Duplicate(Part identicalPart, int numDuplicates){
        this.identicalPart = identicalPart;
        this.numDuplicates = numDuplicates;
    }

    /**
     * Gets the name of the duplicate part
     * @return the amount of and the name of the part
     */
    @Override
    public String getName() {
        String plural = "s";
        String space = " ";
        return numDuplicates+ space+ identicalPart.getName()+ plural;
    }

    /**
     * Gets the total weight of the duplicates
     * @return the total weight
     */
    @Override
    public double getWeight() {
        return numDuplicates*identicalPart.getWeight();
    }

    /**
     * The total cost of the duplicate parts
     * Discount is applied
     * @return the total cost of duplicates
     */
    @Override
    public double getCost() {
        if (numDuplicates<USD_THRESHOLD1){
            return numDuplicates*identicalPart.getCost();
        }else if(numDuplicates<USD_THRESHOLD2){
            return numDuplicates*identicalPart.getCost()*REDUCTION_FACTOR1;
        }else{
            return  numDuplicates*identicalPart.getCost()*REDUCTION_FACTOR2;
        }
    }

    /**
     * Prints the bill of materials for the duplicate parts
     */
    @Override
    public void printBillOfMaterials() {
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Duplicate part: "+ identicalPart.getName());
        System.out.println("Copies: "+ numDuplicates);
        System.out.println("Individual cost: $"+ costFormat.format(identicalPart.getCost()));
        System.out.println("Individual Weight: "+ weightFormat.format(identicalPart.getWeight()));
        System.out.println("\nTotal cost: $"+ costFormat.format(getCost()));
        System.out.println("Total weight: "+ weightFormat.format(getWeight())+ " lbs");
        System.out.println();
        identicalPart.printBillOfMaterials();
        System.out.println();
    }
}
