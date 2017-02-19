package Main;

public class Stack {

    private Vector tableau;

    public Stack(Vector tableau) {
        this.tableau = tableau;
    }

    void push(int value){
        this.tableau.add(value);
    }

    int peek(){
        return this.tableau.get(size());
    }

    int pop(){
        int value = peek();
        this.tableau.set(this.tableau.get(size()), 0);
        return value;
    }

    int size(){
        return this.tableau.size();
    }

    boolean isEmpty(){
        return this.tableau.isEmpty();
    }
}
