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
                    return 0.0;
                default:
                    System.out.println("Please input either 'business' or 'private'");
            }
        }
    }
}