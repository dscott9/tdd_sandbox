package tdd_sandbox.calculator;

/**
 * Created: dale_
 * Date: 17/04/2017.
 */
public class Calculator {

    private int baseNumber;

    private int total;

    Calculator(int baseNumber) {
        this.baseNumber = baseNumber;
        this.total = baseNumber;
    }

    void add(int numberToAdd) {
        int value = getCurrentValue();
        total = value + numberToAdd;
    }

    void subtract(int numberToSubtract) {
        int value = getCurrentValue();
        total = value - numberToSubtract;
    }

    void multiplyBy(int numberToMulitplyBy) {
        int value = getCurrentValue();
        total = value * numberToMulitplyBy;
    }

    void divideBy(int numberToDivideBy) {
        int value = getCurrentValue();
        total = value / numberToDivideBy;
    }

    int getTotal() {
        return total;
    }

    /**
     * Returns the current total of {@link Calculator}
     * Will return initialisation value if equal to total
     * @return current total
     */
    private int getCurrentValue() {
        if (doesTotalEqualBase()) {
            return baseNumber;
        } else {
            return total;
        }
    }

    /**
     * Allows us to determine whether we are dealing with initialisation value
     * @return {@link Boolean}
     */
    private boolean doesTotalEqualBase() {
        return baseNumber == total;
    }
}
