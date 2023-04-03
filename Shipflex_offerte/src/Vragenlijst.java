import java.util.ArrayList;
import java.util.Scanner;

public class Vragenlijst {
    Prijslijst prijslijst = new Prijslijst();
    int prijsTotaal = 0;

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

