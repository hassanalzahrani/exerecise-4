import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // task1
        System.out.println("Fizz Buzz:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        ///// task2
        System.out.print("\nEnter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("Reverse string: " + reverseString(inputString));

        ////task3
        System.out.print("\nEnter a number: ");
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorial(number));

        ////task4
        System.out.print("\nEnter two numbers: ");
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        System.out.println(base + " raised to the power of " + exponent + " is: " + power(base, exponent));

        //task5
        System.out.print("\nEnter a series of integers (end with 0): ");
        int evenSum = 0, oddSum = 0;
        int input = scanner.nextInt();
        while (input != 0) {
            if (input % 2 == 0) {
                evenSum += input;
            } else {
                oddSum += input;
            }
            input = scanner.nextInt();
        }
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);

        //////task6
        System.out.print("\nEnter a positive integer: ");
        int num = scanner.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        /////task7
        System.out.println("\nWeeks and Days:");
        for (int week = 1; week <= 4; week++) {
            System.out.print("Week " + week + " ");
            for (int day = 1; day <= 7; day++) {
                System.out.print("Day" + day + " ");
            }
            System.out.println();
        }

        //task8
        System.out.print("\nEnter a word: ");
        String word = scanner.next();
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }


    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean isPalindrome(String word) {
        String reversedWord = reverseString(word);
        return word.equalsIgnoreCase(reversedWord);
    }
}