/*
 * SE1021
 * Winter 2017-2018
 * Author: Harim Cano
 * Lab 3 - Interfaces
 * Created: 12/7/2017
 */
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * This class implements part and it deals with the assembly of parts
 * @author Harim Cano
 * @version 1
 */
public class Assembly implements Part {
    private final DecimalFormat costFormat = new DecimalFormat("0.00");
    private final DecimalFormat weightFormat = new DecimalFormat("#.###");
    private ArrayList<Part> subParts = new ArrayList<>();
    private String name;
    /**
     * A constant used to add 25 cents for each sub part used
     */
    public static final double USD_PER_SUB_PART = 0.25;

    /**
     * Adds a part to the assembly's list
     * @param part added to the ArrayList
     */
    public void addPart(Part part){
        subParts.add(part);
    }

    /**
     * Default constructor
     * @param name of the assembly
     */
    public Assembly(String name){
        this.name = name;
    }

    /**
     * Returns the name of the assembly
     * @return the name of assembly
     */
    @Override
    public String getName(){
        return this.name;
    }

    /**
     * Returns the total weight of the assembly
     * @return the total weight of the assembly
     */
    @Override
    public double getWeight(){
        double totalWeight = 0;
        for (int i=0; i<subParts.size(); i++){
            totalWeight += subParts.get(i).getWeight();
        }
        return totalWeight;
    }

    /**
     * Gets the cost of the assembly in total with all parts included
     * @return the total cost of the assembly
     */
    @Override
    public double getCost(){
        double totalCost = 0.0;
        for (int i=0; i<subParts.size();i++){
            totalCost += subParts.get(i).getCost() + USD_PER_SUB_PART;
        }
        return totalCost;
    }

    /**
     * Prints out the bill of materials which contains information regarding the assembly object,
     * including total weight, total cost, and information about the sub parts of the assembly.
     */
    @Override
    public void printBillOfMaterials() {
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");

        for (int i=0; i<subParts.size();i++){
            System.out.println("Part: "+ subParts.get(i).getName());
            System.out.println("Cost: $"+ costFormat.format(subParts.get(i).getCost()));
            System.out.println("Weight: "+ weightFormat.format(subParts.get(i).getWeight())+" lbs");
        }
        System.out.println("Total cost: $"+ costFormat.format(getCost()));
        System.out.println("Total weight: "+ weightFormat.format(getWeight())+ " lbs");
        System.out.println();
        for (int i=0; i<subParts.size(); i++){
            subParts.get(i).printBillOfMaterials();
        }
    }
}
