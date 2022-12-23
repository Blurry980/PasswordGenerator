package Project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Password Generator Project
//import random
        char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z'};

        char[] numbers = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] symbols = new char[]{'!', '#', '$', '%', '&', '(', ')', '*', '+'};
        Scanner scnr = new Scanner(System.in);
        ArrayList<Character> paswrd = new ArrayList<Character>(); // Create an ArrayList object

        System.out.println("Welcome to the PyPassword Generator!");
        System.out.println("How many letters would you like in your password?");
        int nr_letters = scnr.nextInt();
        System.out.println("How many symbols would you like?");
        int nr_symbols = scnr.nextInt();
        System.out.println("How many numbers would you like?");
        int nr_numbers = scnr.nextInt();

        for (int i = 1; i <= nr_letters; i++) {
            int rnd = new Random().nextInt(letters.length);
            //System.out.println(letters[rnd]);
            paswrd.add(letters[rnd]);
        }
        for (int i = 1; i <= nr_symbols; i++) {
            int rnd = new Random().nextInt(symbols.length);
            paswrd.add(symbols[rnd]);

        }

        for (int i = 1; i <= nr_numbers; i++) {
            int rnd = new Random().nextInt(numbers.length);
            paswrd.add(numbers[rnd]);
        }

        Collections.shuffle(paswrd);
        String listString = paswrd.stream().map(Object::toString)
                .collect(Collectors.joining());
        //System.out.println(paswrd.toString());
        System.out.println("Your password is: " +listString);

    }
}
