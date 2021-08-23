package per.preston.coins;

import java.text.DecimalFormat;

/**
 * Class constructor for main calculations
 */
public class CoinLab {

    // initializing classwide variables and format
    private int numOfQuarters, numOfDimes, numOfNickels;
    private double dollarAmtQuarters, dollarAmtDimes, dollarAmtNickels, totalAmount;
    private DecimalFormat df;

    public CoinLab(int quarters, int dimes, int nickels) {
        // setting values
        numOfQuarters = quarters;
        numOfDimes = dimes;
        numOfNickels = nickels;

        // set decimal format
        df = new DecimalFormat("0.00");

        calculate();
    }
    // method for calculations
    private void calculate() {
        // multiplying according to each coin's value
        dollarAmtQuarters = numOfQuarters * 0.25;
        dollarAmtDimes = numOfDimes * 0.10;
        dollarAmtNickels = numOfNickels * 0.05;

        // adding together for the total
        totalAmount = dollarAmtQuarters + dollarAmtDimes + dollarAmtNickels;
    }

    // method for recalculating when the user enters a new input
    public void recalulate(int quarters, int dimes, int nickels) {
        numOfQuarters = quarters;
        numOfDimes = dimes;
        numOfNickels = nickels;
        calculate();
    }

    /*
       Get methods for returning formatted values of total coins,
       dollar amounts of each coin type,
       and the total dollar amount
    */

    public String getTotalCoins() {
        int total = numOfDimes + numOfNickels + numOfQuarters;
        return String.valueOf(total);
    }

    public String[] getDollarAmounts() {
        return new String[] {df.format(dollarAmtQuarters),
                df.format(dollarAmtDimes), df.format(dollarAmtNickels)};
    }

    public String getTotalAmount() {
        return df.format(totalAmount);
    }
}

