package tdd_sandbox.calculator;

/**
 * Created by dale_ on 17/04/2017.
 */
public class Calculator {

    int baseNumber;

    int total;

    public Calculator(int baseNumber) {
        this.baseNumber = baseNumber;
        this.total = baseNumber;
    }

    public void add(int numberToAdd) {
        int value = getCurrentValue();
        total = value + numberToAdd;
    }

    public void subtract(int numberToSubtract) {
        int value = getCurrentValue();
        total = value - numberToSubtract;
    }

    public void multiplyBy(int numberToMulitplyBy) {
        int value = getCurrentValue();
        total = value * numberToMulitplyBy;
    }

    public void divideBy(int numberToDivideBy) {
        int value = getCurrentValue();
        total = value / numberToDivideBy;
    }

    public int getTotal() {
        return total;
    }

    private int getCurrentValue() {
        if (doesTotalEqualBase()) {
            return baseNumber;
        } else {
            return total;
        }
    }

    private boolean doesTotalEqualBase() {
        if (baseNumber == total) {
            return true;
        }
        return false;
    }
}
