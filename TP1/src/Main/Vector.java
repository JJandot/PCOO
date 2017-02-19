package Main;

public class Vector {

    private int[] array;
    private int size; //nbElements

    public Vector(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public Vector(){
        this.size = 0;
        this.array = new int[size];
    }

    public void ensureCapacity(){}

    public void resize(int size){}

    public int size(){return this.size;}

    public boolean isEmpty(){return size() == 0;}

    public void add(int value){
        int index = size();
        this.resize(size() + 1);
        this.array[index] = value;
    }

    public void set(int index, int value){}

    public int get(int index){return this.array[index];}
}
