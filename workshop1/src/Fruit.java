import java.util.ArrayList;

/**
 * this is a class with three public variables, one private variable and one method that make reference to a fruit
 * @author Fabio Betancourt
 */
public class Fruit {

    /**
     * Public variable that reference the fruit's name
     */
    public String name;
    /**
     * Private variable that reference the fruit's average weight, is private because it is only characteristic of the fruit
     */
    private float averageWeight;
    /**
     * Public variable that reference the fruit's color, this is a variable to initialize an array list
     */
    public ArrayList<String> colors;

    /**
     * this is a method to get a value to the array colors
     * @return
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * this is a method to assign a value to the array colors
     * @param colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
