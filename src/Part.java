/*
 * SE1021
 * Winter 2017-2018
 * Author: Harim Cano
 * Lab 3 - Interfaces
 * Created: 12/7/2017
 */

/**
 * This class is an interface implemented by multiple classes.
 * @author Harim Cano
 * @version 1
 */
public interface Part {
    /**
     * This method will return the name of the specific object
     * @return the name of object
     */
    String getName();

    /**
     * This method will return the weight of the specific object
     * @return the weight of object
     */
    double getWeight();

    /**
     * This method will return the cost of a specific object
     * @return the cost of object
     */
    double getCost();

    /**
     * Prints out bill of materials for specific object
     */
    void printBillOfMaterials();

}
