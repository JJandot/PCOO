import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ItemListTest {

    private ByteArrayOutputStream outContent;

    @Before
    public void setUpStream() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStream() {
        System.setOut(null);
    }

    @Test
    public void testPrintHTML() {
        ItemList list = new ItemList();
        list.add("a"); list.add("b");
        list.print(new HTMLListFormat());
        String expectedOutput = "<ul><li>a</li><li>b</li></ul>";
        assertThat(outContent.toString(), equalTo(expectedOutput));
    }

    @Test
    public void testPrintLaTeX() {
        ItemList list = new ItemList();
        list.add("a"); list.add("b");
        list.print(new LatexListFormat());
        String expectedOutput = "\\begin{itemize}\r\n\\item a\r\n\\item b\r\n\\end{itemize}\r\n";
        assertThat(outContent.toString(), equalTo(expectedOutput));
    }
}