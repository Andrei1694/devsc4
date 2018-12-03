package com.ing.devschool;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class Java8Assignment {

    public static void main(String[] args) {
        /**
         * Given the following input data.
         */
        List<Integer> numbers = IntStream.range(0, 1_000)
                .boxed()
                .collect(toList());

        List<String> words = Arrays.asList("One", "Two", "three", "four", "five", "six", "seven", "Eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "Fourteen", "fifteen", "sixteen", "Nineteen", "twenty");

        /**
         * Implement ONE method PER exercise given todos:
         */

        /**
         * For each
         */
        // 1: using "numbers" as input, print first ten numbers
//        example(numbers);
        // 2: using "numbers" as input print first ten odd numbers
        // 3: using "numbers" as input print first ten even numbers
        // 4: implement 1, 2, 3 using one method

        //1
//        example(numbers);

        //        2
//        numbers.stream()
//                .filter(n -> n % 2 != 0)
//                .limit(10)
//                .forEach(System.out::println);
//
//        //3
//        numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .limit(10)
//                .forEach(System.out::println);

        //4
//        forEachExample(numbers, n-> true);
//        forEachExample(numbers, n-> n % 2 == 0);
//        forEachExample(numbers, n-> n % 2 != 0);


        /**
         * Sums
         */
        // 5. using "numbers" as input print their sum
        // 6. using "numbers" as input print the sum of the odd numbers
        // 7. using "numbers" as input print the sum of the even numbers
        // 8. using "numbers" as input print the sum of the even numbers which contain '7'
        // 9. implement 5, 6, 7, 8 using one method

//            5.1
//        int sum1 = numbers
//                .stream()
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println(sum1);


//          5.2
//        int sum = numbers.stream()
//          .reduce(0, (a, b) -> a + b);
//          System.out.println(sum);
//
//        6.
//        int oddSum = numbers.stream()
//                .filter(n -> n % 2 != 0)
//                .reduce(0, (a, b) -> a + b);
//                 System.out.println(oddSum);

//        7.
//        int evenSum = numbers.stream()
//                  .filter(n -> n % 2 == 0)
//                  .reduce(0, (a, b) -> a + b);
//        System.out.println(evenSum);

//        8.
//        int evenSevenSum = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .filter(n -> Integer.toString(n).contains("7"))
//                .reduce(0, (a, b) -> a + b);
//        System.out.println(evenSevenSum);

//        9.
//        sumExample(numbers,
//                    p1 -> p1 % 2 == 0,
//                    p2 -> String.valueOf(p2).contains("7")
//        );

        /**
         * Mixed map/filter/reduce
         */
        // 10. using "numbers" calculate the sum of the double of even numbers
        // 11. using "numbers" calculate the sum of the triple of odd numbers
        // 12. using "numbers" calculate the sum of their half (1/2)
        // 13 implement 10, 11, 12 using one method

////        10
//        int sum0 = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> n * 2)
//                .reduce(0, (a, b) -> a + b);
//        System.out.println(sum0);

////    11
//        int triple = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> n * 3)
//                .reduce(0, (a, b) -> a + b);
//        System.out.println(triple);

////     12
//        int half = numbers.stream()
//                .map(n -> n / 2)
//                .reduce(0, (a, b) -> a + b);
//        System.out.println(half);

////        13
//        mixedExample(numbers,
//                a -> a % 2 == 0,
//                b -> Double.valueOf(b * 2));
//        mixedExample(numbers,
//                a -> a % 2 != 0,
//                b -> Double.valueOf(b * 3));
//        mixedExample(numbers,
//                a -> true,
//                b -> Double.valueOf(b / 2));


        /**
         * Collectors
         */
        // 14. using "words" as input print a string with each UPPERCASED word separated by ', '
        // 15. using "words" as input create a List containing all words starting with a vowel
        // 16. using "words" as input create a List containing all words ending in 'teen'
        // 17. implement 15 and 16 using one method
        // 18. using words as input create a Set of words with an odd number of letters
        // 19. using words as input create a Set containing the number of letters in a word

//        14
//        String s1 = words.stream()
//                .filter(s -> Character.isUpperCase(s.charAt(0)))
//                .collect(joining(", "));
//        System.out.println(s1);


        //15
        String vowels = "AEIOUaeiou";
//        words.stream()
//                .filter(str -> vowels.indexOf(Character.toLowerCase(str.charAt(0))) != -1)
//                .collect(toList()).forEach(System.out::println);

        //16
//        words.stream()
//                .filter(str -> str.endsWith("teen"))
//                .collect(toList()).forEach(System.out::println);
//
//        //17
//        vowelOrTeen(words,
//                v -> vowels.indexOf(Character.toLowerCase(v.charAt(0))) != -1,
//                t -> true);


//        //18
//        words.stream()
//                .filter(str -> str.length() % 2 != 0)
//                .collect(toSet()).forEach(System.out::println);

        //19
//        words.stream()
//                .map(str -> str.length())
//                .collect(toSet()).forEach(System.out::println);


        /**
         * Converting to java 8
         */
        // 20. convert the following code to java 8
        nonJava8Method(numbers);
        Java8Method(numbers);

        /**
         * Optional<T>
         */
        // 21. using "numbers" as input print the first odd number that can be divided by 121, if it does not exist print -1
//        int a = numbers.stream()
////                        .filter(n -> n % 2 != 0)
////                        .filter(n -> n % 121 == 0)
////                        .findFirst()
////                        .orElse(-1);
////                        System.out.println(a);

    }

    private static void example(List<Integer> numbers) {
        numbers.stream()
                .limit(10)
                .forEach(System.out::print);
    }

    private static void nonJava8Method(List<Integer> numbers) {
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int num = 0;

            if (numbers.get(i) % 2 == 0) {
                num = numbers.get(i) + 5;
            } else {
                sum += 0;
                continue;
            }

            num = num * 7;
            if (num % 20 == 3) {
                num = num / 20;
            }

            sum += (num / 10);

            if (++counter > 5) {
                break;
            }
        }

        System.out.println(sum);
    }

    public static void forEachExample(List<Integer> numbers, Predicate<Integer> predicate) {

        // 1: using "numbers" as input, print first ten numbers
        // example(numbers);
        // 2: using "numbers" as input print first ten odd numbers
        // 3: using "numbers" as input print first ten even numbers
        // 4: implement 1, 2, 3 using one method
        numbers.stream()
                .filter(predicate)
                .limit(10)
                .forEach(System.out::println);
    }

    public static void sumExample(List<Integer> numbers,
                                  Predicate<Integer> p1,
                                  Predicate<Integer> p2
    ) {
        System.out.println(numbers.stream()
                .filter(p1)
                .filter(p2)
                .reduce(0, (acc, n) -> acc + n));
    }

    public static void mixedExample(List<Integer> numbers,
                                    Predicate<Integer> predicate,
                                    Function<Integer, Double> mapFunc) {
        System.out.println(
                numbers.stream()
                        .filter(predicate)
                        .map(mapFunc)
                        .reduce(0d, (acc, a) -> acc + a)
        );
    }

    public static void vowelOrTeen(List<String> words, Predicate<String> p1, Predicate<String> p2) {
        words.stream()
                .filter(p1)
                .filter(p2)
                .collect(toList()).forEach(System.out::println);
    }

    public static void Java8Method(List<Integer> numbers) {
        System.out.println(numbers.stream()
                .filter(n -> n % 2 == 0)
                .limit(6)
                .map(n -> (n + 5) * 7)
                .map(n -> n % 20 == 3 ? n / 20 : n)
                .map(n -> n / 10)
                .reduce(0, (acc, e) -> acc + e)
        );
    }

}
