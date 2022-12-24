import java.text.NumberFormat;

public class App {
    public static void main(String[] args) {
        UserInput userInput = UserInput.getUserInput();
        MortgageCalculator calculator = new MortgageCalculator(userInput.principal, userInput.interestRate, userInput.period);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(calculator.paymentCalculator());
        System.out.println(result);
    }
}
