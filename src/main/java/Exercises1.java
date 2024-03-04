public class Exercises1 {

    public long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public long fibonacci(int n) {
        long firstNumber = 1;
        long secondNumber = 1;
        long savingNumber = 0;
        for (int i = 2; i < n; i++) {
            savingNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = savingNumber;
        }
        return secondNumber;
    }

    public char[][] generateTriangle(int rows) {
        char[][] theTriangle = new char[rows][];
        for (int i = 0; i < rows; i++) {
            theTriangle[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                theTriangle[i][j] = '*';
            }
        }
        return theTriangle;
    }

    public static void main(String[] args) {
        // test me here
    }
}