public class LatexListFormat implements ListFormat {

    @Override
    public void printBeginList() {
        System.out.println("\\begin{itemize}");
    }

    @Override
    public void printEndList() {
        System.out.println("\\end{itemize}");
    }

    @Override
    public void beginElement() {
        System.out.print("\\item ");
    }

    @Override
    public void endElement() {
        System.out.println("");
    }
}
