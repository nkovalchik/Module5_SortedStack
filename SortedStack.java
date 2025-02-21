import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;// import stack instead of linked list

/**
 * This program reads a list of integers from user input, stores them in a Stack
 * sorts them in ascending order, and prints the sorted stack.
 * The modification from a LinkedList to a Stack ensures LIFO behavior while
 * maintaining sorting functionality using Collections.
 */
public class SortedStack {

    /**
     * Reads a list of integers from user input, stores them in a Stack,
     * sorts them in ascending order, and prints the sorted stack. Instead of 
     * creating sorting logic in main where it could not be reused I created a method in class for reusability.
     * Now whenever you want to sort numbers inputed by a user you can just call function.
     * <p>
     * The method:
     * 1. Prompts the user to enter space separated integers.
     * 2. Reads and converts the input into integers stored in a Stack.
     * 3. Sorts the Stack using {@code Collections.sort()}.
     * 4. Prints the sorted Stack.
     * </p>
     */
    public static void sortAStack() {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Create a Stack to store integers
        Stack<Integer> numbers = new Stack<>();

        System.out.println("Enter integers (separated by space), then press Enter:");

        // Read user input as a line and split it into an array of strings
        String[] input = scanner.nextLine().split(" ");

        // Convert each input string to an integer and add it to the stack
        for (String num : input) {
            numbers.push(Integer.parseInt(num));
        }

        // Close the scanner to prevent unexpected values from being inputted
        scanner.close();

        // Sort the Stack using Collections
        Collections.sort(numbers);

        // Display the sorted stack
        System.out.println("Sorted Stack:");
        System.out.println(numbers);
    }

    /**
     * The main method executes the sorting function.
     */
    public static void main(String[] args) {
        sortAStack();
    }
}

//java SortedStack.java
//javadoc -d doc SortedStack.java