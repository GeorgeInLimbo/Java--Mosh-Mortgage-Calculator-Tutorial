public class MortgageCalculator {
    public static final int MONTHS_IN_YEAR = 12;
    double principal;
    double interestRate;
    double period;

    public MortgageCalculator(double loan, double rate, double term) {
        principal = loan;
        interestRate = (rate / 100) / MONTHS_IN_YEAR;
        period = term * MONTHS_IN_YEAR;
    }

    public double paymentCalculator() {
        double eq1 = Math.pow((1 + this.interestRate), this.period);
        double top = this.interestRate * eq1;
        double bottom = eq1 - 1;
        double payment = this.principal * (top / bottom);
        return payment;
    }


}