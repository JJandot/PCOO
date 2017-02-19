package Main;

public class Application {

    public static String[] filter(String[] strings, StringFilter filter){
        String[] resultStrings = new String[strings.length];
        for (int i = 0; i < strings.length; ++i) {
            String result = filter.filter(strings[i]);
            System.out.println(result);
            resultStrings[i] = result;
        }
        return resultStrings;
    }

    public static void main(String[] args) {
        StringFilter[] filters = {new UpperCaseStringFilter(), new LowerCaseStringFilter(), new PrefixStringFilter(6), new PostfixStringFilter(6)};
        StringFilter filter = new CompositeStringFilter(filters);
        System.out.println(filter.filter("J'aime ma marmotte !"));
    }
}
