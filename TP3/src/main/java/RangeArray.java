import java.util.Iterator;

public class RangeArray <T> implements Iterable{

    /**
     * the arrays filled with objects
     */
    private Object[] elements;

    /**
     * the lower bound of the array
     */
    private int indexMin;

    /**
     * the upper bound of the array
     */
    private int indexMax;


    /**
     * Constructor. Create an array which indexes are indexMin and indexMax
     * @param indexMin the minimal index, used to set the array size
     * @param indexMax the maximal index, used to set the array size
     */
    public RangeArray(int indexMin, int indexMax) {
        this.indexMin = indexMin;
        this.indexMax = indexMax;
        elements = new Object[indexMax - indexMin + 1];
    }

    /**
     * Getter
     * @return the smallest index of the current array
     */
    public int getIndexMin() {
        return indexMin;
    }

    /**
     * Getter
     * @return the biggest index of the current array
     */
    public int getIndexMax() {
        return indexMax;
    }

    /**
     * Setter. Sets the value at the index position
     * @param index where the value will be set
     * @param value the value to set
     */
    public void set(int index, T value){
        int internalIndex = internalIndex(index);
        if(internalIndex != -1)
            elements[internalIndex] = value;
        else{
            System.out.println("Index hors du tableau");
            System.exit(1);
        }
    }

    /**
     * Sets if we can use the current index
     * @param userIndex the index we want to use
     * @return true if user index is between indexMin and indexMax
     */
    public boolean userIndexIsValid(int userIndex){
        return indexMin <= userIndex && userIndex <= indexMax;
    }



    /**
     * Gives the index used in our array which correspond to the userIndex
     * @param userIndex the index we want to get the value
     * @return the index value of userIndex
     */
    public int internalIndex(int userIndex){
        if(userIndexIsValid(userIndex))
            return userIndex - indexMin;
        return -1;
    }

    /**
     * Getter.
     * @param userIndex the index of the value we want
     * @return the value at userIndex
     */
    public T get(int userIndex){
        return (T)elements[internalIndex(userIndex)];
    }

    /**
     * Getter
     * @return the capacity of our array
     */
    public int rangeSize(){
        return indexMax - indexMin + 1;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    public Iterator<T> iterator() {
        return new RangeArrayIterator<>(this);
    }
}
