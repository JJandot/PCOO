package Main;

public class PostfixStringFilter implements StringFilter{

    private int index;

    public PostfixStringFilter(int index) {
        this.index = index;
    }

    public String filter(String string) {
        return string.substring(index);
    }
}
