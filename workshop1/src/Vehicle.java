/**
 * proposed class with public and protected variables
 * @author Fabio Betancourt
 */

public class Vehicle {

    /**
     * five public variables to make extends in other classes
     */
    public String name;
    public String brand;
    public String color;
    public String licensePlate;
    protected String engine;


    /**
     * method to get the value in the variable name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * method to assign a value in the variable name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
