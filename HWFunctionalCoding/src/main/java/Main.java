import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static List<String> createDictionary(String words) {
        List<String> dictionary = Arrays.asList(words.split(" "));
        return dictionary.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void printDictionary(List<String> dictionary) {
        dictionary.forEach(System.out::println);
    }

    public static void main(String[] args) {

        printDictionary(createDictionary("nous avons pu tous deux fatigués du voyage " +
                "nous asseoir un instant sur le bord du chemin " +
                "et sentir sur nos fronts flotter le même ombrage " +
                "et porter nos regards vers l'horizon lointain "));
    }

}
