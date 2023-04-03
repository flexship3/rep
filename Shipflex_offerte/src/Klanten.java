import java.util.Scanner;
class Klanten {double korting;
    double discountPercentage;

    Scanner scanner = new Scanner(System.in);
    public Klanten(double korting) {
        this.korting = korting;
    }

    public void Vragen() {
        while (true) {
            System.out.println("Are you a private or business customer? \n" +
                               "Enter either business or private");
            String customer = scanner.nextLine();
            switch (customer) {
                case "business":
                case "Business":
                    System.out.println("What discount do you receive?");
                    double discount = scanner.nextDouble();
                    discountPercentage = (100 - discount) / 100;
                    break;
                case "private":
                case "Private":
                    System.out.println("You have 0% discount");
                    discountPercentage = 0;
                    break;
                default:
                    System.out.println("Please input either 'business' or 'private'");
            }
        }
    }
}