package Main;

public class CompositeStringFilter implements StringFilter{

    private StringFilter[] filters;

    public CompositeStringFilter(StringFilter[] filters) {
        this.filters = filters;
    }

    public String filter(String string) {
        String result = "";
        for (StringFilter filter : filters)
            result += filter.filter(string);
        return result;
    }
}
