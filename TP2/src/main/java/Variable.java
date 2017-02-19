public class Variable implements Formula{

    /**
     * the variable's name
     */
    private String name;

    /**
     * the variable's value
     */
    private double value;


    /**
     * Constructor. Sets a name and a value to a Variable
     * @param name the setted name
     * @param value the setted value
     */
    public Variable(String name, double value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Get the variable's name
     * @return the variable's name
     */
    public String asString() {
        return this.name;
    }

    /**
     * Get the value of the current variable
     * @return the value of the current variable
     */
    public double asValue() {
        return this.value;
    }

    /**
     * Sets a value to the current variable
     * @param value the value which will be set
     */
    public void set(double value){
        this.value = value;
    }
}
