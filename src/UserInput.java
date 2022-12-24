import java.util.Scanner;

public class UserInput {
    double principal;
    double interestRate;
    double period;

    public UserInput(double principal, double interestRate, double period) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.period = period;
    }

    public static UserInput getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your loan amount (please omit all symbols) ?");
        double principal = scanner.nextDouble();
        System.out.println("Your loan amount: $" + principal);
        System.out.print("What is your interest rate (X.XX) ?");
        double interestRate = scanner.nextDouble();
        System.out.println("Your interest rate: " + interestRate + "%");
        System.out.print("What is the term of your loan (in years) ?");
        double period = scanner.nextDouble();
        System.out.println("Your loan term: " + period + " years long.");
        return new UserInput(principal, interestRate, period);
    }
}