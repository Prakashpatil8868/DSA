import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List <String> strings=Arrays.asList("Prakash","Patil");

        Consumer<String> stringConsumer=(name) -> System.out.println(name);

        strings.forEach(stringConsumer);

        Supplier<Double> supplier=()-> Math.random();
        System.out.println(supplier.get());

        Predicate<String> predicate= n -> n.startsWith("P");
        List<String> predicateresult=strings.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(predicateresult);

        Function<String,Integer> function=name -> name.length();
        List<Integer> integerList=strings.stream().map(function).collect(Collectors.toList());
        System.out.println(integerList);


    }
}