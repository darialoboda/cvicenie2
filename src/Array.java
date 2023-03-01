import java.util.*;
public class Array {

        // Main function
        public static void main(String args[]) throws Exception
        {

            // Array Declaration
            int array[] = new int[10];

            // Adding elements in the array
            for (int i = 0; i < array.length; i++)
            {
                array[i] = i + 1;
            }

            // Printing the elements
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
    }

