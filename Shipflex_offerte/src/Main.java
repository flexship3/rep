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

    BoatPart hull = new BoatPart("Hull", "$5,000 to $20,000" , "extrainfo");
    BoatPart outboardMotor = new BoatPart("Outboard Motor", "$5,000 to $15,000", "extrainfo" );
    BoatPart fuelTank = new BoatPart("Fuel Tank", "$500 to $1,500", "extrainfo"  );
    BoatPart steeringSystem = new BoatPart("Steering system", "$1,000 to $3,000", "extrainfo"  );
    BoatPart electricalSystem = new BoatPart("Electrical system", "$1,000 to $3,000", "extrainfo"  );
    BoatPart upholstery = new BoatPart("Upholstery", "$1,000 to $3,000", "extrainfo"  );
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "$500 to $1,500", "extrainfo"  );
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
    BoatPart hull = new BoatPart("Hull", "$100 million to $500 million or more", "extrainfo" );
    BoatPart engines = new BoatPart("Engines", "$50 million to $100 million or more", "extrainfo" );
    BoatPart propulsionSystem = new BoatPart("Propulsion system", "$20 million to $50 million or more", "extrainfo" );
    BoatPart cargoTanks = new BoatPart("Cargo tanks", "$20 million to $50 million or more", "extrainfo" );
    BoatPart pumpsAndValves = new BoatPart("Pumps and valves", "$5 million to $20 million or more", "extrainfo" );
    BoatPart navAndComSys = new BoatPart("Navigation and communication system", "$10 million to $50 million or more", "extrainfo" );
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "$10 million to $50 million or more", "extrainfo" );
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
    BoatPart hull = new BoatPart("Hull","$5,000 to $30,000", "extrainfo" );
    BoatPart mastAndRigging = new BoatPart("Mast and rigging","$10,000 to $15,000", "extrainfo" );
    BoatPart sails = new BoatPart("Sails","$5,000 to $10,000", "extrainfo" );
    BoatPart keel = new BoatPart("Keel","$10,000 to $15,000", "extrainfo" );
    BoatPart steeringSystem = new BoatPart("Steering system","$2,000 to $5,000", "extrainfo" );
    BoatPart electricalSystem = new BoatPart("Electrical system","$2,000 to $5,000", "extrainfo" );
    BoatPart interiorFurnishings = new BoatPart("Interior furnishings","$1,000 to $3,000", "extrainfo" );
    BoatPart safetyEquipment = new BoatPart("Safety equipment","$1,000 to $3,000", "extrainfo" );
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
    BoatPart hull = new BoatPart("Hull", "$300 million to $1 billion or more", "extrainfo" );
    BoatPart engines = new BoatPart("Engines", "$100 million or more", "extrainfo" );
    BoatPart propellers = new BoatPart("Propellers", "$5 million to $20 million or more", "extrainfo" );
    BoatPart accommodations = new BoatPart("Accommodations", "$50,000 to $100,000 or more per suite", "extrainfo" );
    BoatPart diningAndEntertainmentFacilities = new BoatPart("Dining and entertainment facilities", "$2 million to $5 million or more per facility", "extrainfo" );
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "$10 million to $20 million or more", "extrainfo" );
    BoatPart navigationAndCommunicationSystems = new BoatPart("Navigation and communication systems", "$50 million or more", "extrainfo" );
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
    BoatPart hull = new BoatPart("Hull","$50,000 to $200,000", "extrainfo" );
    BoatPart engine = new BoatPart("Engine","$50,000 to $100,000 or more", "piemel" );
    BoatPart fishingGearAndEquipment = new BoatPart("Fishing gear and equipment","$10,000 to $50,000 or more", "extrainfo" );
    BoatPart navigationAndCommunicationSystems = new BoatPart("Navigation and communication systems","$5,000 to $20,000 or more", "extrainfo" );
    BoatPart deckMachineryAndEquipment = new BoatPart("Deck machinery and equipment","$10,000 to $50,000 or more", "extrainfo" );
    BoatPart safetyEquipment = new BoatPart("Safety equipment","$5,000 to $20,000 or more", "extrainfo" );
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, engine, fishingGearAndEquipment,
            navigationAndCommunicationSystems, deckMachineryAndEquipment, safetyEquipment));

}


public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Botenlijst botenlijst = new Botenlijst();
        Vragenlijst vragenlijst = new Vragenlijst();
        Klanten klanten = new Klanten();
        vragenlijst.kortingVraag(klanten, botenlijst);

    }

}