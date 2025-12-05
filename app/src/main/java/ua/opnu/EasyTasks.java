package ua.opnu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(x -> x * 2).toList();
    }

    public List<Integer> square(List<Integer> nums) {
       return nums.stream().map(x -> x * x).toList();
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream().map(x -> "y" + x + "y").toList();
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(x -> x >= 0).toList();
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(x -> (x % 10) != 9).toList();
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(x -> !x.contains("z")).toList();
    }

    public List<String> refinedStrings(List<String> strings) {
       return strings
               .stream()
               .distinct()
               .sorted(Comparator.comparingInt(String::length)
                       .reversed()
               )
               .toList();
    }

    public List<String> flatten(List<String> strings) {
        return strings.stream().flatMap(x -> Arrays.stream(x.split(" "))).toList();
    }
}