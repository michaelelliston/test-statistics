import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int sum = 0;                                                 // declaring variables
        double average;
        int highScore;
        int lowScore;
        int i = 0;

        int[] testScores = {92, 80, 65, 99, 74, 79, 83, 67, 90, 52}; // assigning values
        Arrays.sort(testScores);                                     // sorting array by numeric value

        // System.out.println(Arrays.toString(testScores));          // prints a String version of the array; used to check ordering, not required.

        while (i < testScores.length) {                              // goes through the array, adding each value to the sum
            sum += testScores[i];
            i++;
        }

        average = (double) sum / testScores.length;                  // calculates and assigns the average
        highScore = testScores[testScores.length - 1];               // assigns the last value in the array
        lowScore = testScores[0];                                    // assigns the first value in the array

        System.out.println("The average of all 10 test scores is: " + average + '.');        // prints average
        System.out.println("The highest of all 10 test scores is: " + highScore + '.');      // prints highest score
        System.out.println("The lowest of all 10 test scores is: " + lowScore + '.');        // prints lowest score
    }
}
