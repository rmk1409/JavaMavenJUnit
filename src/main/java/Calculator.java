/**
 * Created by Roma on 04.09.2016.
 * Simple Arithmetic operators
 */
public class Calculator {
    public int addition(int first, int second) {
        return first + second;
    }

    public int subtraction(int first, int second) {
        return first - second;
    }

    public int multiplication(int first, int second) {
        return first * second;
    }

    public int division(int first, int second) {
        if (second == 0) throw new ArithmeticException("trying division by zero");
        return first / second;
    }
}
