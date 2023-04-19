package advancedjava._11;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        double x = Math.random()*100;
        String stringa = x >= 50 ? "x is greater than or equal to 50" : "x is less than 50";
        System.out.println(x);
        System.out.println(stringa);
    }


    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person = new Person("Andrea", 24, "Via XXIV Maggio");
        System.out.println(person);

    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger bigInteger = new BigInteger("100000000000000000000000000000000000000");
        System.out.println("Big Integer value is: " + bigInteger);
        bigInteger = bigInteger.divide(new BigInteger("3"));
        System.out.println("Big Integer value after the divide: " + bigInteger);

        BigDecimal bigDecimal = new BigDecimal("2.555555555555555");
        System.out.println("Big Decimal value is: " + bigDecimal);
        bigDecimal = bigDecimal.divide(new BigDecimal(Math.PI), RoundingMode.UP);
        System.out.println("Big Decimal value after PI is: " + bigDecimal);



    }

}
