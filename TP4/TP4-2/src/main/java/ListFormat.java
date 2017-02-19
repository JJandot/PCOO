public interface ListFormat {

    /**
     * Print the first "balise" of the list
     */
    void printBeginList();

    /**
     * Print the last "balise" of the list
     */
    void printEndList();

    /**
     * Print the first "balise" before an element
     */
    void beginElement();

    /**
     * Print the last "balise" before an element
     */
    void endElement();

}
