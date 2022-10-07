/**
 * this is a class to make reference to an account bank, the clas has a private variable, a protected
 * variable and a method to assign a value to the variable "activated"
 * @author Fabio betancourt
 */

public class BankAccount {

    /**
     * Private int variable to make reference to an account number
     */
    private int accountNumber;
    /**
     * Protected boolean variable
     */
    protected boolean activated;

    /**
     * method to get the value of variable activated
     * @return
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * method to assign the value "activated" to the variable "activated"
     * @param activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
