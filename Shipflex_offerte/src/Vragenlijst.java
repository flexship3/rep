import java.util.ArrayList;
import java.util.Scanner;

public class Vragenlijst {
    // Prijslijst prijslijst = new Prijslijst();
    int prijsTotaal = 0;
    public void Kiesboat(Botenlijst botenlijst, Scanner scanner){
        System.out.println("to choose which boat you want to buy, press:");
        while (true){
            boolean breakloop = false;
            for (int i = 0; i < botenlijst.botenlijst.size(); i++){
                System.out.printf("%d for %s%n", i + 1, botenlijst.botenlijst.get(i).getName());
            }
            int keuze = scanner.nextInt();
            switch (keuze){
                case 1: prompt(botenlijst.botenlijst.get(0).getboatParts());
                    breakloop = true;
                    break;
                case 2: prompt(botenlijst.botenlijst.get(1).getboatParts());
                    breakloop = true;
                    break;
                case 3: prompt(botenlijst.botenlijst.get(2).getboatParts());
                    breakloop = true;
                    break;
                case 4: prompt(botenlijst.botenlijst.get(3).getboatParts());
                    breakloop = true;
                    break;
                case 5: prompt(botenlijst.botenlijst.get(4).getboatParts());
                    breakloop = true;
                    break;
                default: System.out.println("please only press a number between 1-5 for the following boats: ");
            }
            if (breakloop) break;
        }
    }

    public void prompt(ArrayList<BoatPart> boatParts) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < boatParts.size(); i++) {System.out.printf("How much does the %s cost? average price(%s)", boatParts.get(i).getName(), boatParts.get(i).getInfo());
            boatParts.get(i).setPrice(scanner.nextInt());
        }
        for (int i = 0; i < boatParts.size(); i++) {
            System.out.println(boatParts.get(i).getName() + ": " + boatParts.get(i).getPrice());
            this.prijsTotaal += boatParts.get(i).getPrice();
        }// deze method neemt een lijst boatparts en geeft een vragenlijst gebaseerd hierop
        System.out.println("Total: " + prijsTotaal);
    }
}

