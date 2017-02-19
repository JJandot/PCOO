import java.util.ArrayList;
import java.util.List;

public class Filter {

    /**
     * Filter the list with the specific predicate.
     * Static : can be used without the class instanciation
     * @param predicate the predicate which will make the tests on the list
     * @param list the tested list
     * @return a list filled with elements which successfully passed the test
     */
    public static List filter (Predicate predicate, List list){
        List resultat = new ArrayList<>();
        for (Object o : list){
            if(predicate.test(o))
                resultat.add(o);
        }
        return resultat;
    }

}
