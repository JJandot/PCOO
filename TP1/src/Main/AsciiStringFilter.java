package Main;

public class AsciiStringFilter implements StringFilter {

    public String filter(String string) {
        String filtered = "";
        for(int i = 0; i < string.length(); ++i)
            if(string.charAt(i) - 128 <= 0)
                filtered += string.charAt(i);
        return filtered;
    }
}
