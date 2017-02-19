public class HTMLListFormat implements ListFormat {

    @Override
    public void printBeginList() {
        System.out.print("<ul>");
    }

    @Override
    public void printEndList() {
        System.out.print("</ul>");
    }

    @Override
    public void beginElement() {
        System.out.print("<li>");
    }

    @Override
    public void endElement() {
        System.out.print("</li>");
    }
}
