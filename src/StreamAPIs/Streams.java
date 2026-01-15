package StreamAPIs;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Vishnu");
        names.add("Vinay");
        names.add("Kalyan");
        names.add("Vamshi");
        names.add("Prasad");

        /* Filter(Predicate<T> predicate)
        <T> - it only accepts one input and doesn't return anything
        */
        // Return the count where names start with 'V'
        long nameCount = names.stream().filter(name -> name.indexOf('V') == 0).count();
        System.out.println(nameCount); // Expected: 3 (Vishnu, Vinay, Vamshi)

        /* Map(Function<T, R> mapper)
        <T, R> - it accepts one input and returns something*/
        // Convert to UPPERCASE
        List<String> newNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toUnmodifiableList());
        System.out.println(newNames);

        /* Flatmap(Function<T, Stream<R>> mapper)
        <T, Stream<R>> - it accepts complex collection as input and returns flatten stream
         */
        // Convert to lowercase
        List<List<String>> complexCollection = Arrays.asList(
                Arrays.asList("COMPLEX", "COLLECTION"),
                Arrays.asList("FLATMAP", "HELPS", "TO", "FLATTEN")
        );
        List<String> flattenMap = complexCollection.stream().flatMap(
                context -> context.stream().map(string -> string.toLowerCase())
        ).toList();
        System.out.println(flattenMap);

    }

}
