package Main;

public class UpperCaseStringFilter implements StringFilter {

    public String filter(String string) {
        return string.toUpperCase();
    }
}
