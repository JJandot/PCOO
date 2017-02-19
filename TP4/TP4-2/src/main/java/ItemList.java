import java.util.ArrayList;
import java.util.List;

public class ItemList {
    private List<String> items;

    public ItemList() {
        items = new ArrayList<>();
    }

    public void add(String item) {
        items.add(item);
    }

    /**
     * Print the current items List, with the specified format
     * @param format an instance of a subclass of ListFormat
     */
    public void print(ListFormat format){
        format.printBeginList();
        for (String s : this.items){
            format.beginElement();
            System.out.print(s);
            format.endElement();
        }
        format.printEndList();
    }

    /*
    public void printHTML() {
        System.out.print("<ul>");
        for (String i : items) System.out.print("<li>"+i+"</li>");
        System.out.print("</ul>");
    }

    public void printLaTeX() {
        System.out.println("\\begin{itemize}");
        for (String i : items) System.out.println("\\item "+i);
        System.out.println("\\end{itemize}");
    }*/
}