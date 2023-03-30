import java.util.ArrayList;
import java.util.Scanner;

public class Vragenlijst {
    Prijslijst prijslijst = new Prijslijst();

    public void prompt(ArrayList<BoatPart> boatParts) {
        Scanner scanner = new Scanner(System.in);
        String priceRange;
        for (int i = 0; i < boatParts.size(); i++) {
            System.out.println("How much does the " + boatParts.get(i).getName() + " cost?");
            prijslijst.prijzen.add(scanner.nextInt());
        }
        for (int i = 0; i < prijslijst.prijzen.size(); i++) {
            System.out.println(prijslijst.prijzen.get(i));
        }// deze method neemt een lijst boatparts en geeft een vragenlijst gebaseerd hierop
    }
}

