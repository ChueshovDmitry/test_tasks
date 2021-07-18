package task_5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static task_5.Functions.createListOfWorks;
import static task_5.Functions.sortByCountOfVowels;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your words:");
        List<String> str = Arrays.asList(scanner.nextLine().trim().split(" "));
        Map<String, Integer> words = createListOfWorks(str);

        System.out.println("Word=countOfVowels");
        System.out.println(sortByCountOfVowels(words));
    }
}
