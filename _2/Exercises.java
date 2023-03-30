package advancedjava._2;

import java.util.HashMap;
import java.util.Map;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Follow the steps below
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // 1a. Create a map of integers to strings
        Map<Integer, String> gameCollection = new HashMap<>();

        // 1b. Add 3 elements to the map .put
        gameCollection.put(1, "HuntShowDown");
        gameCollection.put(2, "LeagueOfLegends");
        gameCollection.put(3, "Heartstone");
        // 1c. Print the map
        // 1e. Remove an element from the map .remove
        gameCollection.remove(2);
        System.out.println(gameCollection);
        // 1d. Access an element in the map with .get
        System.out.println("My favorite game is:  " + gameCollection.get(1));
        // 1f. Print the map again to confirm the element was removed
    }

    /**
     *  2: Follow the instructions in the code
     */
    private static void exercise2() {
        System.out.println("Exercise 2: ");
        Map<String, Double> menuCostsInEuro = new HashMap<>();

        menuCostsInEuro.put("Fries", 3.50);
        menuCostsInEuro.put("Pizza", 11.80);
        menuCostsInEuro.put("Burger", 8.50);

        String mostExpensiveMenuItemName = null;
        Double max = Double.MIN_VALUE;

        for(Map.Entry<String,Double> costInE : menuCostsInEuro.entrySet()){
            if(costInE.getValue()>max){
                 max = costInE.getValue() ;
                 mostExpensiveMenuItemName = costInE.getKey();
                System.out.println("the most expensive price is: " + max);

            }
        }

        // 2a. Loop over the map entries with menuCostsInEuro.entrySet()
        //     and set out the most expensive items name
        //     use for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()) and entry.getKey and entry.getValue
        //     to do so

        // Your code

        if (mostExpensiveMenuItemName.equals("Pizza")) {
            System.out.println("2a. Correct!");
        } else {
            System.out.println("2a. Incorrect!");
        }
    }

    /**
     * 3: Follow the instructions in the code
     */
    private static void exercise3() {
        System.out.println("Exercise 3: ");
        Map<String, Integer> fruitWeights = new HashMap<>();

        fruitWeights.put("Apple", 5);
        fruitWeights.put("Banana", 3);
        fruitWeights.put("Orange", 8);
        fruitWeights.put("Kiwi", 1);
        fruitWeights.put("Mango", 4);
        fruitWeights.put("Grapes", 8);
        fruitWeights.put("Peach", 5);
        fruitWeights.put("Pineapple", 1);
        // fruitWeights.put("ANGURIAAA", 10);

      //  int maxWeight = Integer.MIN_VALUE;
        int totalWeight = 0;

        // 3a. Use a for loop with fruitWeights.values() and sum up the total weight
        for(Map.Entry<String,Integer> weight : fruitWeights.entrySet()){
            totalWeight += weight.getValue();
             //  if(weight.getValue() > maxWeight){
            //   maxWeight = weight.getValue();
           // System.out.println("I frutti che pesano di più sono: " + weight.getKey()+" "+ maxWeight);
            //  }
        }
            System.out.println("Il peso totale è: " + totalWeight);

        // Your code

        if (totalWeight == fruitWeights.values().stream().mapToInt(Integer::intValue).sum()) {
            System.out.println("3. Correct!");
        } else {
            System.out.println("3. Incorrect!");
        }
    }
}
