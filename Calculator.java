// Name : Dhaerya More | PRN : 23070126033 | Batch : 2023-27, AIML A2
// Calculator.java

public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Fibonacci sequence
    public int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Sum of an array
    public double sumArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    // Mean of an array
    public double meanArray(double[] array) {
        if (array.length == 0) return 0;
        return sumArray(array) / array.length;
    }

    // Variance of an array
    public double varianceArray(double[] array) {
        if (array.length == 0) return 0;
        double mean = meanArray(array);
        double sum = 0;
        for (double num : array) {
            sum += (num - mean) * (num - mean);
        }
        return sum / array.length;
    }

    // Standard Deviation of an array
    public double stdDevArray(double[] array) {
        return Math.sqrt(varianceArray(array));
    }
}
