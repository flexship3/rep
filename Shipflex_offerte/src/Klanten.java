import java.util.Scanner;
class Klanten {
    private double discountPercentage;

    Scanner scanner = new Scanner(System.in);

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void Vragen() {
        while (true) {
            boolean breakloop = false;
            System.out.println("Are you a private or business customer? (Enter either business or private)");
            String customer = scanner.nextLine();
            switch (customer.toLowerCase()) {
                case "business":
                    System.out.println("What discount do you receive?");
                    double discount = scanner.nextDouble();
                    setDiscountPercentage((100 - discount) / 100);
                    breakloop = true;
                    break;

                case "private":
                    System.out.println("You have 0% discount");
                    setDiscountPercentage(1);
                    breakloop = true;
                    break;
                default:
                    System.out.println("Please input either 'business' or 'private'");
            }
            if (breakloop) break;
        }
    }
}

/*
import java.util.Scanner;
class Klanten {
    double discountPercentage;

    Scanner scanner = new Scanner(System.in);


    public double Vragen() {
        while (true) {
            System.out.println("Are you a private or business customer? \n" +
                               "Enter either business or private");
            String customer = scanner.nextLine();
            switch (customer.toLowerCase()) {
                case "business":
                    System.out.println("What discount do you receive?");
                    double discount = scanner.nextDouble();
                    discountPercentage = (100 - discount) / 100;
                    return discountPercentage;
                case "private":
                    System.out.println("You have 0% discount");
                    return 1.0;
                default:
                    System.out.println("Please input either 'business' or 'private'");
            }
        }
    }
}
 */