package Main;

public class PrefixStringFilter implements StringFilter{

    private int index;

    public PrefixStringFilter(int index) {
        this.index = index;
    }

    public String filter(String string) {
        return string.substring(0, this.index);
    }
}
