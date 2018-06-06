import criteriapattern.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactoryTest {

    public static void main(String[] args) {
        List<String> first = new ArrayList<>();
        first.add("a");
        first.add("b");
        first.add("c");
        List<String> second = new ArrayList<>();
        second.add("d");
        second.add("e");
        second.add("c");

        List<String> result = new ArrayList<>();
//        for (String str : second) {
//            if (!first.contains(str)){
//                first.add(str);
//            }
//        }
        result.addAll(first);
        result.addAll(second);
        System.out.println(result.size());
    }

}
