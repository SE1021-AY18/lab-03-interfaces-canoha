/*
 * SE1021
 * Winter 2017-2018
 * Author: Harim Cano
 * Lab 3 - Interfaces
 * Created: 12/7/2017
 */
import java.text.DecimalFormat;

/**
 * This class implements part and it represents
 * @author Harim Cano
 * @version 1
 */
public class SheetMetal implements Part {
    private double lengthInches;
    private double thicknessInches;
    private double widthInches;
    /**
     *A constant that is used to calculate the weight of sheet metal
     */
    public static final double LBS_MULTIPLIER = 0.1;
    /**
     *A constant that is used to calculate the weight of sheet metal
     */
    public static final double USD_MULTIPLIER = 0.50;

    /**
     *Default constructor
     * @param lengthInches is the lenght of the sheet metal in inches
     * @param widthInches is the width of the sheet medal in inches
     * @param thicknessInches is the thickness of the sheet metal in inches
     */
    public SheetMetal(double lengthInches, double widthInches, double thicknessInches){
        this.lengthInches = lengthInches;
        this.widthInches = widthInches;
        this.thicknessInches = thicknessInches;
    }

    /**
     * Returns the name and dimensions of the sheet metal
     * @return the dimensions of the sheet metal
     */
    @Override
    public String getName() {
        return lengthInches+ "x"+ widthInches+ "x"+ thicknessInches+ " sheet";
    }

    /**
     * Returns the weight of the sheet metal
     * @return the weight of sheet metal
     */
    @Override
    public double getWeight() {
        return LBS_MULTIPLIER*thicknessInches*widthInches*lengthInches;
    }

    /**
     * Returns the total cost of the sheet metal
     * @return the total cost of sheet metal
     */
    @Override
    public double getCost() {
        return USD_MULTIPLIER*thicknessInches*widthInches*lengthInches;
    }

    /**
     * Prints out the bill of materials for sheet metal
     */
    @Override
    public void printBillOfMaterials() {
        DecimalFormat weightFormat = new DecimalFormat("#.###");
        DecimalFormat costFormat = new DecimalFormat("0.00");
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Length: "+ lengthInches+ " inches");
        System.out.println("Width: "+ widthInches+ " inches");
        System.out.println("Thickness: "+ thicknessInches+ " inches");
        System.out.println("Cost: $"+ costFormat.format(getCost()));
        System.out.println("Weight: "+ weightFormat.format(getWeight())+ " lbs");
        System.out.println();
    }

}

