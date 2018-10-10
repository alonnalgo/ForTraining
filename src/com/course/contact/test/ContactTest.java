package contact.test;

import java.util.List;
import java.util.stream.Collectors;

public class ContactTest {

    public static void main(String[] args) {

    }

    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(x -> (int) Math.pow(x, 2)).collect(Collectors.toList());
    }

    public List<String> addStar(List<String> strings) {
        return strings.stream().map(s -> s + "*").collect(Collectors.toList());

    }

    public List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s + s + s).collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream().map(s -> "y" + s + "y").collect(Collectors.toList());
    }

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(s -> (s + 1) * 10).collect(Collectors.toList());
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(s -> s % 10).collect(Collectors.toList());
    }

    public List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }


}
