/*
 * SE1021
 * Winter 2017-2018
 * Author: Harim Cano
 * Lab 3 - Interfaces
 * Created: 12/7/2016
 */

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * This class deals with the assembly of parts
 * @author Harim Cano
 * @version 1
 */
public class Assembly implements Part {

    DecimalFormat costFormat = new DecimalFormat();
    private String name;
    ArrayList<Part> subParts = new ArrayList<>();
    public static final double USD_PER_SUB_PART = 0.25;
    DecimalFormat weightFormat = new DecimalFormat();

    public void addPart(Part part){
        //TODO
    }

    public Assembly(String name){
        //TODO
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void printBillOfMaterials() {

    }
}
