import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Vragenlijst {
    // Prijslijst prijslijst = new Prijslijst();
    double prijsTotaal = 0;
    private Scanner scanner;

    public Vragenlijst(Scanner scanner) {
        this.scanner = scanner;
    }

    public void kortingVraag (Klanten klanten, Botenlijst botenlijst) throws FileNotFoundException, UnsupportedEncodingException {
        klanten.Vragen();
        Kiesboat(botenlijst, klanten);
    }
    public void Kiesboat(Botenlijst botenlijst, Klanten klanten) throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Select the type of boat you want to buy, give a number:");
        while (true){
            boolean breakloop = false;
            for (int i = 0; i < botenlijst.botenlijst.size(); i++){
                System.out.printf("%d for %s%n", i + 1, botenlijst.botenlijst.get(i).getName());
            }
            String keuze = scanner.nextLine();
            switch (keuze){
                case "1": prompt(botenlijst.botenlijst.get(0).getboatParts(), klanten);
                    breakloop = true;
                    break;
                case "2": prompt(botenlijst.botenlijst.get(1).getboatParts(), klanten);
                    breakloop = true;
                    break;
                case "3": prompt(botenlijst.botenlijst.get(2).getboatParts(), klanten);
                    breakloop = true;
                    break;
                case "4": prompt(botenlijst.botenlijst.get(3).getboatParts(), klanten);
                    breakloop = true;
                    break;
                case "5": prompt(botenlijst.botenlijst.get(4).getboatParts(), klanten);
                    breakloop = true;
                    break;
                default: System.out.println("Please only give a number between 1-5 for the following boats: ");
            }
            if (breakloop) break;
        }
    }

    public void prompt(ArrayList<BoatPart> boatParts, Klanten klanten) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("offerte.txt", "UTF-8");
        writer.println("Flex-Ship offerte " + klanten.getCustomerName() + ".\n");
        for (int i = 0; i < boatParts.size(); i++) {
            System.out.printf("How much does the %s cost? average price: (%s, write 'info' for more)", boatParts.get(i).getName(), boatParts.get(i).getInfo());
            String input = scanner.nextLine();
            if (input.equals("info")){
                System.out.println("Price points of different examples:");
                System.out.println(boatParts.get(i).getExtraInfo());
                i--;
            }
            else if (Character.isDigit(input.charAt(0)) ) {
                int prijs = Integer.parseInt(input);
                boatParts.get(i).setPrice(prijs);
            }
            else {
               System.out.println("Wrong input");
               i--;
            }
        }
        extraOptie(boatParts);
        for (int i = 0; i < boatParts.size(); i++) {
            System.out.printf("%-40s$%d%n",boatParts.get(i).getName(),boatParts.get(i).getPrice());
            this.prijsTotaal += boatParts.get(i).getPrice();
            writer.printf("%-40s$%d%n",boatParts.get(i).getName(),boatParts.get(i).getPrice());
        }// deze method neemt een lijst boatparts en geeft een vragenlijst gebaseerd hierop
        System.out.printf("%nTotal with discount (%.1f%%): $%.2f",(100 - klanten.getDiscountPercentage() * 100), prijsTotaal * klanten.getDiscountPercentage());
        writer.printf("%nTotal with discount (%.1f%%): $%.2f",(100 - klanten.getDiscountPercentage() * 100), prijsTotaal * klanten.getDiscountPercentage());
        writer.close();
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
}

