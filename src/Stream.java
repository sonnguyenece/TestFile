import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("abcv", "xaca", "asdqsd", "scqgq");
        List<String> upperCase = items.stream()
                .map(item -> item.toUpperCase())
                .collect(Collectors.toList());

        List<String> mapper = items.stream()
                .filter(item -> item.startsWith("a"))
                .collect(Collectors.toList());

        long count = items.stream()
                .filter(item->item.contains("a"))
                .count()
                ;
        System.out.println(count);

    }

}
