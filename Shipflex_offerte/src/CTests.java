import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

public class CTests {
    //test berekenTotaal method op of die de prijzen uit de boatPart objects haalt en optelt.
    @Test
    public void testTotaal(){

        Vragenlijst vragenlijst = new Vragenlijst(new Scanner(System.in));
        ArrayList<BoatPart> boatParts = new ArrayList<>();
        BoatPart testObject1 = new BoatPart("","","");
        testObject1.setPrice(8);
        boatParts.add(testObject1);
        BoatPart testObject2 = new BoatPart("","","");
        testObject2.setPrice(6);
        boatParts.add(testObject2);
        BoatPart testObject3 = new BoatPart("","","");
        testObject3.setPrice(10);
        boatParts.add(testObject3);
        double expectedTotaal = 24;

        double totaal = vragenlijst.berekenTotaal(boatParts);

        assertEquals(expectedTotaal, totaal, 0);
    }
    // test of de methode berekenKorting() correct het kortingspercentage toepast om op het totaalbedrag met korting te komen
    @Test
    public void testKorting (){
        Vragenlijst vragenlijst = new Vragenlijst(new Scanner(System.in));
        Klant klant = new Klant();
        ArrayList<BoatPart> boatParts = new ArrayList<>();
        BoatPart testObject1 = new BoatPart("","","");
        testObject1.setPrice(8);
        boatParts.add(testObject1);
        BoatPart testObject2 = new BoatPart("","","");
        testObject2.setPrice(6);
        boatParts.add(testObject2);
        BoatPart testObject3 = new BoatPart("","","");
        testObject3.setPrice(10);
        boatParts.add(testObject3);
        klant.setDiscountPercentage(10);
        double expectedTotaal = 24 * 0.9;

        double totaal = vragenlijst.berekenKorting(boatParts, klant);

        assertEquals(expectedTotaal, totaal,0);

    }
    //test of de method berekenVAT de input gebruikt, om op de opgetelde prijzen van de boatParts de VAT te berekenen
    // deze drie tests hebben ons laten inzien dat onze code beter de principes van OOP had kunnen volgen.
    // En er voor gezorgd dat wij meer functies een eigen method hebben gegeven.
    @Test
    public void testVAT(){
        ByteArrayInputStream in = new ByteArrayInputStream("21".getBytes());
        System.setIn(in);

        Vragenlijst vragenlijst = new Vragenlijst(new Scanner(System.in));
        ArrayList<BoatPart> boatParts = new ArrayList<>();
        BoatPart testObject1 = new BoatPart("","","");
        testObject1.setPrice(10);
        boatParts.add(testObject1);
        BoatPart testObject2 = new BoatPart("","","");
        testObject2.setPrice(10);
        boatParts.add(testObject2);
        BoatPart testObject3 = new BoatPart("","","");
        testObject3.setPrice(10);
        boatParts.add(testObject3);
        double expectedTotaal = 36.3;
        double totaal = 0;


        for (int i = 0; i<boatParts.size(); i++) {
            totaal += boatParts.get(i).getPrice();
        }
        double totaalMetVAT = totaal * vragenlijst.berekenVAT();

        assertEquals(expectedTotaal, totaalMetVAT, 0);
    }
}

