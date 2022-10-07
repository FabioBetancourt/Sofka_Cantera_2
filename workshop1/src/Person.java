import java.util.Date;

/**
 * this is a class with 5 public variables and two methods that make reference to a person
 * @author Fabio Betancourt
 */
public class Person {

    /**
     * Public variable that reference the person's name
     */
    public String name;
    /**
     * Public variable that reference the person's last name
     */
    public String lastName;
    /**
     * Public variable that reference the person's second last name
     */
    public String lastName2;
    /**
     * Public variable that reference the person's birthday
     */
    public Date dateBirth;
    /**
     * Public variable that reference the person's height
     */
    public float height;


    /**
     * this is a method to assign a value to the variable name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * this is a method to get the value assigned in the variable name
     * @return
     */
    public String getName() {
        return name;
    }
}
