import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

interface Boat{
    String getName();
    ArrayList<BoatPart> getboatParts();
}
class Speedboat implements Boat{
    final private String name = "speedboat";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<BoatPart> getboatParts() {
        return boatParts;
    }

    BoatPart hull = new BoatPart("Hull", "$5,000 to $20,000" , "Sonicwake Medium $5000\n" +
            "Sonicwake Premium 12000$\n" +
            "Sonicwake Ultra $20000\n");
    BoatPart outboardMotor = new BoatPart("Outboard Motor", "$5,000 to $15,000", "Mercury F6.6 $5000\n" +
            "Mercury F125S $10000\n" +
            "Mercury F175 Pro $15000\n");
    BoatPart fuelTank = new BoatPart("Fuel Tank", "$500 to $1,500", "DLE50 $500\n" +
            "Mercruiser 3000 $1000\n" +
            "Mercruiser 5000 $1500\n");
    BoatPart steeringSystem = new BoatPart("Steering system", "$1,000 to $3,000", "SeaPearl H15 $1000\n" +
            "SeaPearl H50 $2000\n" +
            "FlexU 2000 $3000\n");
    BoatPart electricalSystem = new BoatPart("Electrical system", "$1,000 to $3,000", "Greenboat HF12 $1000\n" +
            "Greenboat HF20 $2000\n" +
            "Greenboat HF50 $3000\n");
    BoatPart upholstery = new BoatPart("Upholstery", "$1,000 to $3,000", "YUMI Style $1000\n" +
            "YUMI Fresh $2000\n" +
            "YUMI comfort $3000\n");
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "$500 to $1,500", "SeaPearl Safe-T II $500\n" +
            "SeaPearl Safe-T III $1000\n" +
            "SeaPearl Safe-T IV $1500\n");
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, outboardMotor, fuelTank, steeringSystem,
            electricalSystem, upholstery,safetyEquipment)); // De boot heeft een arraylist met BoatPart objecten
}
class Oiltanker implements Boat{
    final private String name = "oiltanker";
    @Override
    public String getName() {
        return name;
    }
    @Override
    public ArrayList<BoatPart> getboatParts() {
        return boatParts;
    }
    BoatPart hull = new BoatPart("Hull", "$100 million to $500 million or more", "Rhino 450F $100 million\n" +
            "Rhino 620 $250 million\n" +
            "Rhino 970 $500 million\n");
    BoatPart engines = new BoatPart("Engines", "$50 million to $100 million or more", "LC12 $50 million\n" +
            "LC15 $75 million\n" +
            "LC20 $100 million\n");
    BoatPart propulsionSystem = new BoatPart("Propulsion system", "$20 million to $50 million or more", "BCDK $20 million\n" +
            "BCDK $35 million\n" +
            "BCDK $50 million\n");
    BoatPart cargoTanks = new BoatPart("Cargo tanks", "$20 million to $50 million or more", "IB tank V1 $20 million\n" +
            "IB tank V2 $40 million\n" +
            "IB tank V3 $50 million\n" );
    BoatPart pumpsAndValves = new BoatPart("Pumps and valves", "$5 million to $20 million or more", "Hivera $5 million\n" +
            "Hivera $15 million\n" +
            "Hivera $20 million\n");
    BoatPart navAndComSys = new BoatPart("Navigation and communication system", "$10 million to $50 million or more", "ECDIS 200 $10 million\n" +
            "ARPA 100 $40 million\n" +
            "AIS 900 $50 million\n" );
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "$10 million to $50 million or more", "ACK 210 $10 million\n" +
            "ACK 250 $30 million\n" +
            "ACK 300 $50 million\n");
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, engines, propulsionSystem,
            cargoTanks, pumpsAndValves, navAndComSys, safetyEquipment));
}
class Sailboat implements Boat{
    final private String name = "sailboat";
    @Override
    public String getName() {
        return name;
    }
    @Override
    public ArrayList<BoatPart> getboatParts() {
        return boatParts;
    }
    BoatPart hull = new BoatPart("Hull","$5,000 to $30,000", "Carbonfiber C10 $5000\n" +
            "Carbonfiber C20 $20000\n" +
            "Carbonfiber C30 $30000\n" );
    BoatPart mastAndRigging = new BoatPart("Mast and rigging","$10,000 to $15,000", "Highwind H10 $10000\n" +
            "Highwind H20 $12500\n" +
            "Highwind H30 $15000\n");
    BoatPart sails = new BoatPart("Sails","$5,000 to $10,000", "Windcatcher Classic $5000\n" +
            "Windcatcher Elite $7500\n" +
            "Windcatcher Pro $10000\n" );
    BoatPart keel = new BoatPart("Keel","$10,000 to $15,000", "Deepsea D10 $10000\n" +
            "Deepsea D20 $12500\n" +
            "Deepsea D30 $15000\n" );
    BoatPart steeringSystem = new BoatPart("Steering system","$2,000 to $5,000", "SeaStar S10 $2000\n" +
            "SeaStar S20 $3500\n" +
            "SeaStar S30 $5000\n" );
    BoatPart electricalSystem = new BoatPart("Electrical system","$2,000 to $5,000", "Voltrex V10 $2000\n" +
            "Voltrex V20 $3500\n" +
            "Voltrex V30 $5000\n" );
    BoatPart interiorFurnishings = new BoatPart("Interior furnishings","$1,000 to $3,000", "Oceanview O10 $1000\n" +
            "Oceanview O20 $2000\n" +
            "Oceanview O30 $3000\n" );
    BoatPart safetyEquipment = new BoatPart("Safety equipment","$1,000 to $3,000", "LifeSaver L10 $1000\n" +
            "LifeSaver L20 $2000\n" +
            "LifeSaver L30 $3000\n" );
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, mastAndRigging, sails,
            keel, steeringSystem, electricalSystem, interiorFurnishings, safetyEquipment));

}
class Cruiseship implements Boat {
    final private String name = "cruiseship";
    @Override
    public String getName() {
        return name;
    }
    @Override
    public ArrayList<BoatPart> getboatParts() {
        return boatParts;
    }
    BoatPart hull = new BoatPart("Hull", "$300 million to $1 billion or more", "Oceanliner O10 $300 million\n" +
            "Oceanliner O20 $600 million\n" +
            "Oceanliner O30 $1 billion\n" );
    BoatPart engines = new BoatPart("Engines", "$100 million or more", "Wartsila 32 $100 million\n" +
            "Wartsila 46 $200 million\n" +
            "Wartsila 64 $400 million\n");
    BoatPart propellers = new BoatPart("Propellers", "$5 million to $20 million or more", "FPP $5 million\n" +
            "CPP $10million\n" +
            "AZT $20 million\n" );
    BoatPart accommodations = new BoatPart("Accommodations", "$50,000 to $100,000 or more per suite", "Royal Suites $50000\n" +
            "Luxury Staterooms $70000\n" +
            "Oceanview Rooms $100000\n");
    BoatPart diningAndEntertainmentFacilities = new BoatPart("Dining and entertainment facilities", "$2 million to $5 million or more per facility", "Nightclub and bar $2 million\n" +
            "Theater and cinema $3,5 million\n" +
            "Michelin star restaurants $5 million\n");
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "$10 million to $20 million or more", "Lifesaver LS1 $10 million\n" +
            "Lifesaver $15 million\n" +
            "Lifesaver $20 million\n");
    BoatPart navigationAndCommunicationSystems = new BoatPart("Navigation and communication systems", "$50 million or more", "RADARNAV5000 $50 million\n" +
            "AIS2000 $60 million\n" +
            "ECDIS500 $70 million\n");
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, engines, propellers,
            accommodations, diningAndEntertainmentFacilities, safetyEquipment, navigationAndCommunicationSystems));
}
class Fishingvessel implements Boat{
    final private String name = "fishingvessel";
    @Override
    public String getName() {
        return name;
    }
    @Override
    public ArrayList<BoatPart> getboatParts() {
        return boatParts;
    }
    BoatPart hull = new BoatPart("Hull","$50,000 to $200,000", "Marlin Master M10 $50000\n" +
            "Tuna Titan T20 $125000\n" +
            "Swordfish Supreme $200000\n");
    BoatPart engine = new BoatPart("Engine","$50,000 to $100,000 or more", "Caterpillar C7.1 $50000\n" +
            "Caterpillar C12.9 $75000\n" +
            "Caterpillar C32 $100000\n" );
    BoatPart fishingGearAndEquipment = new BoatPart("Fishing gear and equipment","$10,000 to $50,000 or more", "Netmaster N10 $10000\n" +
            "Netmaster N20 $30000\n" +
            "Netmaster N30 $50000\n");
    BoatPart navigationAndCommunicationSystems = new BoatPart("Navigation and communication systems","$5,000 to $20,000 or more", "ECDAC300 $5000" +
            "NAVIVA400 $15000" +
            "AXN9000 $20000" );
    BoatPart deckMachineryAndEquipment = new BoatPart("Deck machinery and equipment","$10,000 to $50,000 or more", "Winchmaster W10 $10000\n" +
            "Winchmaster W20 $30000\n" +
            "Winchmaster W30 $50000\n");
    BoatPart safetyEquipment = new BoatPart("Safety equipment","$5,000 to $20,000 or more", "Lifesaver LS1 $5000\n" +
            "Lifesaver LS2 $10000\n" +
            "Lifesaver LS3 $20000\n");
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, engine, fishingGearAndEquipment,
            navigationAndCommunicationSystems, deckMachineryAndEquipment, safetyEquipment));

}


public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        Botenlijst botenlijst = new Botenlijst();
        Vragenlijst vragenlijst = new Vragenlijst(scanner);
        Klant klant = new Klant();
        vragenlijst.kortingVraag(klant, botenlijst);
    }

}