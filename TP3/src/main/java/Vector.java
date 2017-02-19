import java.util.Arrays;

/**
 * La classe <code>Vector</code> implémente un tableau d'entiers
 * de taille dynamique. Les éléments du vecteur sont stockés dans un tableau.
 * La taille de ce tableau est au minimum doublée à chaque fois qu'il est
 * nécessaire de le faire grossir.
 */
public class Vector<T> {

    /**
     * Tableau permettant de stocker les éléments du vecteur.
     * Seuls les <code>size</code> premiers éléments font partie du vecteur.
     * La taille de ce tableau est égale à la capacité du vecteur, c'est-à-dire,
     * au nombre d'éléments maximum que le vecteur peut contenir sans
     * avoir besoin d'allouer un nouveau tableau.
     */
    private Object[] elements;

    /**
     * Nombre d'éléments présents dans le vecteur.
     */
    private int size;

    /**
     * Construit un vecteur de capacité initiale <code>initialCapacity</code>.
     *
     * @param initialCapacity Capacité initiale du vecteur
     */
    public Vector(int initialCapacity) {
        elements = new Object[initialCapacity];
        size = 0;
    }

    /**
     * Constructeur.
     * Crée un objet Vector de capacité initiale 10
     */
    public Vector() {
        this(10);
    }

    /**
     * Augmente la capacité du vecteur si nécessaire de façon
     * à permettre le stockage d'au moins <code>minCapacity</code>
     * éléments. S'il est nécessaire d'augmenter la capacité du vecteur,
     * elle est au minimum doublée.
     *
     * @param minCapacity Capacité minimale à assurer
     */
    public void ensureCapacity(int minCapacity) {
        int oldCapacity = elements.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    /**
     * Change le nombre d'éléments du Vecteur instancié à <code>newSize</code>
     * Les nouveaux elements sont instancies à 0
     * @param newSize le nouveau nombre d'éléments présents dans le vecteur
     * @throws ArrayIndexOutOfBoundsException si newSize est en dehors du tableau, c'est à dire <code>newSize {@literal <}= 0 || newSize {@literal >}= size</code>
     */
    public void resize(int newSize) throws ArrayIndexOutOfBoundsException{
        if(newSize < 0){
            throw new ArrayIndexOutOfBoundsException("Taille negative impossible");
        }
        int currentSize = size();
        ensureCapacity(newSize);
        this.size = newSize;
        for(int i = currentSize; i < newSize; ++i)
            elements[i] = 0;
    }

    /**
     * Retourne la capacité du vecteur.
     *
     * @return Capacité du vecteur.
     */
    public int capacity() {
        return elements.length;
    }

    /**
     * Retourne le nombre d'elements du vecteur
     * @return le nombre d'elements du vecteur
     */
    public int size() {
        return this.size;
    }

    /**
     * Indique si le vecteur est vide ou non
     * @return vrai ou faux, en fonction du résultat de size() == 0
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Ajoute un element à la suite du vecteur, apres l'avoir agrandi de 1
     * @param element la valeur de l'element à ajouter
     */
    public void add(T element) {
        resize(size() + 1);
        elements[size()-1] = element;
    }

    /**
     * Affecte une valeur à un index
     * @param index l'indice du tableau qui prendra la valeur donnee
     * @param element la valeur à affecter
     * @throws ArrayIndexOutOfBoundsException si l'index est en dehors du tableau, c'est à dire <code>index {@literal <} 0 || index {@literal >}= size</code>
     */
    public void set(int index, T element) throws ArrayIndexOutOfBoundsException{
        try {
            elements[index] = element;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index " + index + " is out of range [0, " + (size-1) + "].");
        }
    }


    /**
     * Renvoie la valeur présente à l'index. Si on est hors de bornes, renvoie -1
     * @param index l'indice pour lequel la valeur sera renvoyée
     * @return la valeur presente à la position <code>index</code>
     * @throws ArrayIndexOutOfBoundsException si l'index est en dehors du tableau, c'est à dire <code>index {@literal <} 0 || index {@literal >}= size</code>
     */
    public T get(int index) throws ArrayIndexOutOfBoundsException{
        try {
            return (T) elements[index];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index " + index + " is out of range [0, " + (size-1) + "].");
        }
        return null;
    }

}