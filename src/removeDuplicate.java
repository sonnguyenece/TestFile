import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicate {
    public static void main(String[] args) {
        List<String> listInt = Arrays.asList("123", "123", "123", "4", "312", "5", "123", "5", "656", "34");
        List<String> list= listInt.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);


    }

}
