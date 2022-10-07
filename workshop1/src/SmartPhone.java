/**
 * Class with tree variables and two methods what are set and get to the variable model
 */
public class SmartPhone {

    /**
     * private, public and protected variables
     */
    private String id;
    public String brand;
    protected String model;


    /**
     * method to assign a value to the variable model
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * method for get the value assigned in the variable model
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }
}
