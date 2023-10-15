package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public final class Main {
    private final static Logger LOGGER = LogManager.getLogger();

    private Main() {
    }

    public static void main(String[] args) {

        LOGGER.info("Hello world!");

        Scanner in = new Scanner(System.in);

       System.out.println((new Task1(in.next()).secondsCount));
       System.out.println((new Task2(in.nextInt()).digitsCount));
       System.out.println((new Task3(new Integer[]{1, 2, 3, 4}, new Integer[]{0, 6}).nestable));
       System.out.println((new Task4(in.nextLine()).fixedString));
       System.out.println((new Task5(in.nextInt()).isPalindrom));
       System.out.println((new Task6(in.nextInt()).count));
       System.out.println((new Task7(in.nextInt(), in.nextInt()).rotetedLeft));
       System.out.println((new Task7(in.nextInt(), in.nextInt()).rotetedRight));

    }
}
