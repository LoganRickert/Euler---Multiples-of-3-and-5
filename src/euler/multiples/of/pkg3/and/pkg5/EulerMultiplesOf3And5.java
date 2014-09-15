/*
 * Challenge:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.

 * Find the sum of all the multiples of 3 or 5 below 1000.

 * https://projecteuler.net/problem=1
 */

package euler.multiples.of.pkg3.and.pkg5;

/**
 *
 * @author Logan Rickert
 */
public class EulerMultiplesOf3And5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int startNumber = 999;
        double currentNumber = startNumber;
        int currentAmount = 0;
        
        while(currentNumber > 0){
            if(currentNumber / 5 == (int)currentNumber / 5 || currentNumber / 3 == (int)currentNumber / 3){
                currentAmount += currentNumber;
                System.out.println(currentNumber);
            }
            currentNumber--;
        }
        System.out.println(currentAmount);
    }
    
}
