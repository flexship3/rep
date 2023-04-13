import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Vragenlijst {
    // Prijslijst prijslijst = new Prijslijst();

    private Scanner scanner;
    double VAT;

    public Vragenlijst(Scanner scanner) {
        this.scanner = scanner;
    }

    public void kortingVraag (Klant klant, Botenlijst botenlijst) throws FileNotFoundException, UnsupportedEncodingException {
        klant.Vragen();
        VAT = berekenVAT();
        scanner.nextLine();
        Kiesboat(botenlijst, klant);

    }
    public void Kiesboat(Botenlijst botenlijst, Klant klant) throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Select the type of boat you want to buy, give a number:");
        while (true){
            boolean breakloop = false;
            for (int i = 0; i < botenlijst.botenlijst.size(); i++){
                System.out.printf("%d for %s%n", i + 1, botenlijst.botenlijst.get(i).getName());
            }
            String keuze = scanner.nextLine();
            switch (keuze){
                case "1": prompt("Speedboat", botenlijst.botenlijst.get(0).getboatParts(), klant);
                    breakloop = true;
                    break;
                case "2": prompt("Oiltanker", botenlijst.botenlijst.get(1).getboatParts(), klant);
                    breakloop = true;
                    break;
                case "3": prompt("Sailboat", botenlijst.botenlijst.get(2).getboatParts(), klant);
                    breakloop = true;
                    break;
                case "4": prompt("Cruiseship", botenlijst.botenlijst.get(3).getboatParts(), klant);
                    breakloop = true;
                    break;
                case "5": prompt("Fishingvessel", botenlijst.botenlijst.get(4).getboatParts(), klant);
                    breakloop = true;
                    break;
                default: System.out.println("Please only give a number between 1-5 for the following boats: ");
            }
            if (breakloop) break;
        }
    }

    public void prompt(String bootNaam, ArrayList<BoatPart> boatParts, Klant klant) throws FileNotFoundException, UnsupportedEncodingException {
        for (int i = 0; i < boatParts.size(); i++) {
            System.out.printf("How much does the %s cost? average price: (%s, write 'info' for more)", boatParts.get(i).getName(), boatParts.get(i).getInfo());
            String input = scanner.nextLine();
            if (input.equals("info")){
                System.out.println(boatParts.get(i).getExtraInfo());
                i--;
            }
            else if (Character.isDigit(input.charAt(0)) ) {
                int prijs = Integer.parseInt(input);
                boatParts.get(i).setPrice(prijs);

            }
            else {
                System.out.println("I didn't quite catch that. Please repeat.");
                i--;
            }
        }
        extraOptie(boatParts);
        printOfferte(boatParts, bootNaam, klant);

    }

    public void extraOptie(ArrayList<BoatPart> boatParts){
        boolean stop = false;
        while (!stop) {
            System.out.println("Does your boat have any additional features? Y/N");
            String yesNo = scanner.nextLine().toLowerCase();
            String name = "";
            int price = 0;
            String info = "";
            String extraInfo = "";
            if (yesNo.equals("y"))
            {
                System.out.println("What additional feature are you adding?");
                name = scanner.nextLine();
                System.out.println("What's the price of the " + name + "?");
                price = scanner.nextInt();
                scanner.nextLine();
                BoatPart addFeat = new BoatPart(name, info, extraInfo);
                addFeat.setPrice(price);
                boatParts.add(addFeat);
            }
            else if (yesNo.equals("n")) {
                stop = true;
            } else {
                System.out.println("I didn't quite catch that. Please repeat.");
            }
        }
    }
    public double berekenTotaal(ArrayList<BoatPart>boatParts) {
        double prijsTotaal = 0;
        for (int i = 0; i < boatParts.size(); i++) {
            prijsTotaal += boatParts.get(i).getPrice();
        }
        return prijsTotaal;
    }

    public void printOfferte(ArrayList<BoatPart>boatParts, String bootNaam, Klant klant) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("offerte.txt", "UTF-8");
        writer.println("Flex-Ship offerte " + klant.getCustomerName() + ".\n");
        System.out.printf("Selected Boat Type: %s%n%n", bootNaam);
        writer.printf("Selected Boat Type: %s%n%n", bootNaam);

        for (int i = 0; i < boatParts.size(); i++) {
            System.out.printf("%-40s$%d%n", boatParts.get(i).getName(), boatParts.get(i).getPrice());
            writer.printf("%-40s$%d%n", boatParts.get(i).getName(), boatParts.get(i).getPrice());
        }

        System.out.printf("%nTotal: $%.2f%n", berekenTotaal(boatParts));
        writer.printf("%nTotal: $%.2f%n", berekenTotaal(boatParts) );
        System.out.printf("Total with discount (%.1f%%): $%.2f%n",(klant.getDiscountPercentage()), berekenKorting(boatParts,klant));
        writer.printf("%nTotal with discount (%.1f%%): $%.2f%n",(klant.getDiscountPercentage()), berekenKorting(boatParts,klant));
        System.out.printf("Final price (with VAT): $%.2f%n",berekenKorting(boatParts,klant) * VAT);
        writer.printf("Final price (with VAT): $%.2f%n", berekenKorting(boatParts,klant) * VAT);
        writer.close();
    }
    public double berekenKorting(ArrayList<BoatPart>boatParts, Klant klant){
        return berekenTotaal(boatParts) * ((100 - klant.getDiscountPercentage()) / 100);
    }
    public double berekenVAT(){
        System.out.println("What is your regional VAT-percentage?");
        double VATantwoord = scanner.nextDouble();
        double VATomgerekend = 1 + VATantwoord/100;
        return VATomgerekend;
    }
}

