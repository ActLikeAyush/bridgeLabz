package questions;
@FunctionalInterface
interface square {

    int calculateSquare(int number);


    default void printSquare(int number) {
        int result = calculateSquare(number);
        System.out.println("The square of " + number + " is: " + result);
    }
}