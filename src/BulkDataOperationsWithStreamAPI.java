import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/* Java - 8
 * 
 * new java.util.Stream class added to Java 8
 * does filter/map/reduce operations on collections
 * Stream API allows sequential & parallel execution
 * Best feature if working with Big Data to filter out
 * 
*/

public class BulkDataOperationsWithStreamAPI {

    public static void main(String[] args) {

        List<Integer> aList = new ArrayList<Integer>();

        for (int i=0; i<100; i++)
            aList.add(i);

        // sequential stream
        Stream<Integer> sequentialStream = aList.stream();

        // parallel stream
        Stream<Integer> parallelStream = aList.parallelStream();

        // using lambda with Stream API - filter example:
        Stream<Integer> highNumbers = parallelStream.filter(p -> p > 90);

        // using lambda in forEach()
        highNumbers.forEach(p -> System.out.println("High Numbers parallel = " + p));

        Stream<Integer> highNumbersSequential = sequentialStream.filter(p -> p > 90);

        highNumbersSequential.forEach(p -> System.out.println("High Numbers sequential = " + p));

    }
}
