package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int currentNumber = 0;

        while (currentNumber <= printToInclusive) {
            long factorial = 1;
            int temp = currentNumber;

            while (temp > 1) {
                factorial *= temp;
                temp--;
            }

            System.out.println("Factorial of " + currentNumber + ": " + factorial);
            currentNumber++;
        }
    }
}