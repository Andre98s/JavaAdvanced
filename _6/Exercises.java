package advancedjava._6;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

        private enum Days {
            LUNEDI (false),
            MARTEDI (false),
            MERCOLEDI (false),
            GIOVEDI (false),
            VENERDI (true),
            SABATO (true),
            DOMENICA (true);


            private boolean weekend;

            Days(boolean weekend) {
                this.weekend = weekend;
            }


            public boolean getIsWeekend() {
                return weekend;
            }
        }




    private enum Seasons{
        PRIMAVERA, ESTATE, AUTUNNO, INVERNO;
        }


        private enum  TrafficLight{
        RED, YELLOW, GREEN;
        }

    private enum Operatori{
        ADD, SUBTRACT, MULTIPLY, DIVIDE;
    }




    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        Days[] giorni = Days.values();

        for (Days day : giorni){
        System.out.println(day + " : "+ day.ordinal()); // + day.ordinal() per stampare in ordine di inserimento indicizzandoli
        }
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Seasons seasonsValue = Seasons.ESTATE;
        switch (seasonsValue){
            case PRIMAVERA:
                System.out.println("dal 21 marzo al 20 giugno " + "\uD83C\uDF3A");
                break;
            case ESTATE:
                System.out.println("dal 21 giugno al 20 settembre " + "\uD83C\uDF0A☀️");
                break;
            case AUTUNNO:
                System.out.println("dal 21 settembre al 20 dicembre " + "🍁");
                break;
            case INVERNO:
                System.out.println("dal 21 dicembre al 20 marzo "+ "\uD83C\uDF29️ ");
                break;
            default:
                System.out.println("non esistono altre stagioni (⊃｡•́‿•̀｡)⊃ ");
        }
    }


    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        TrafficLight semaforo = TrafficLight.RED;
        if (semaforo == TrafficLight.RED){
            System.out.println("You shall not pass!!" + "\uD83D\uDD34\uD83E\uDDD9\u200D♂️");
        } else if (semaforo == TrafficLight.YELLOW) {
            System.out.println("Rallenta e fermati! " + "\uD83D\uDFE1");
        } else if (semaforo == TrafficLight.GREEN) {
            System.out.println("Proceda caro ahah " + "\uD83D\uDFE2");
        }
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
       Days[] giorni = Days.values();
       for (Days days : giorni){
           if (days.getIsWeekend()==true){
               System.out.println(days + ": Is weekend");
           }if (days.getIsWeekend()==false){
               System.out.println(days + ": Is weekday");
           }
       }
    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static  void calcolatore (double num1, double num2, Operatori operator){
        double total = 0;
        switch (operator){
            case ADD -> total = num1+num2;
            case DIVIDE -> total = num1/num2;
            case MULTIPLY -> total = num1*num2;
            case SUBTRACT -> total = num1 - num2;
        }
        System.out.println(total);
    }
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here
        int num1 = 5;
        int num2 = 2;

        System.out.println("Addizzione");
        calcolatore(num1,num2,Operatori.ADD);
        System.out.println("Divisione");
        calcolatore(num1,num2,Operatori.DIVIDE);
        System.out.println("Moltiplicazione");
        calcolatore(num1,num2,Operatori.MULTIPLY);
        System.out.println("Sottrazione");
        calcolatore(num1,num2,Operatori.SUBTRACT);




    }

}
