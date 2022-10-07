/**
 * daughter class of vehicle with private and public variables, to show the use of the private variable
 */

public class Ferrari {

    /**
     * two private variables that belonging only to this class
     */
    private int numberDoors;
    private int numberPassengers;

    /**
     * method to get the value of the variable numberDoors
     * @return numberDoors
     */
    public int getNumberDoors() {
        return numberDoors;
    }

    /**
     * method to assign the value of the variable numberDoors
     * @param numberDoors
     */
    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }
}
