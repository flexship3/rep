import java.util.ArrayList;
import java.util.Scanner;

public class Vragenlijst {
    // Prijslijst prijslijst = new Prijslijst();
    double prijsTotaal = 0;
    public void kortingVraag (Klanten klanten, Botenlijst botenlijst, Scanner scanner){
        klanten.Vragen();
        System.out.println(klanten.getDiscountPercentage());
        Kiesboat(botenlijst, scanner, klanten);
    }
    public void Kiesboat(Botenlijst botenlijst, Scanner scanner, Klanten klanten){
        System.out.println("Select the type of boat you want to buy, give a number:");
        while (true){
            boolean breakloop = false;
            for (int i = 0; i < botenlijst.botenlijst.size(); i++){
                System.out.printf("%d for %s%n", i + 1, botenlijst.botenlijst.get(i).getName());
            }
            int keuze = scanner.nextInt();
            switch (keuze){
                case 1: prompt(botenlijst.botenlijst.get(0).getboatParts(), klanten);
                    breakloop = true;
                    break;
                case 2: prompt(botenlijst.botenlijst.get(1).getboatParts(), klanten);
                    breakloop = true;
                    break;
                case 3: prompt(botenlijst.botenlijst.get(2).getboatParts(), klanten);
                    breakloop = true;
                    break;
                case 4: prompt(botenlijst.botenlijst.get(3).getboatParts(), klanten);
                    breakloop = true;
                    break;
                case 5: prompt(botenlijst.botenlijst.get(4).getboatParts(), klanten);
                    breakloop = true;
                    break;
                default: System.out.println("Please only give a number between 1-5 for the following boats: ");
            }
            if (breakloop) break;
        }
    }

    public void prompt(ArrayList<BoatPart> boatParts, Klanten klanten) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < boatParts.size(); i++) {
            System.out.printf("How much does the %s cost? average price: (%s)", boatParts.get(i).getName(), boatParts.get(i).getInfo());
            boatParts.get(i).setPrice(scanner.nextInt());
        }
        for (int i = 0; i < boatParts.size(); i++) {
            System.out.println(boatParts.get(i).getName() + ": " + boatParts.get(i).getPrice());
            this.prijsTotaal += boatParts.get(i).getPrice();
        }// deze method neemt een lijst boatparts en geeft een vragenlijst gebaseerd hierop
        System.out.println(prijsTotaal * klanten.getDiscountPercentage());
    }
}

