import java.util.ArrayList;
import java.util.Arrays;

interface Boat{}
class Speedboat implements Boat{
    BoatPart hull = new BoatPart("Hull", "$5,000 to $20,000" );
    BoatPart outboardMotor = new BoatPart("Outboard Motor", "$5,000 to $15,000" );
    BoatPart fuelTank = new BoatPart("Fuel Tank", "$500 to $1,500" );
    BoatPart steeringSystem = new BoatPart("Steering system", "$1,000 to $3,000" );
    BoatPart electricalSystem = new BoatPart("Electrical system", "$1,000 to $3,000" );
    BoatPart upholstery = new BoatPart("Upholstery", "$1,000 to $3,000" );
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "$500 to $1,500" );
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, outboardMotor, fuelTank, steeringSystem,
            electricalSystem, upholstery,safetyEquipment)); // De boot heeft een arraylist met BoatPart objecten
}
class Oiltanker implements Boat{
    BoatPart hull = new BoatPart("Hull", "$100 million to $500 million or more");
    BoatPart engines = new BoatPart("Engines", "$50 million to $100 million or more");
    BoatPart propulsionSystem = new BoatPart("Propulsion system", "$20 million to $50 million or more");
    BoatPart cargoTanks = new BoatPart("Cargo tanks", "$20 million to $50 million or more");
    BoatPart pumpsAndValves = new BoatPart("Pumps and valves", "$5 million to $20 million or more");
    BoatPart navAndComSys = new BoatPart("Navigation and communication system", "$10 million to $50 million or more");
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "$10 million to $50 million or more");
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, engines, propulsionSystem,
            cargoTanks, pumpsAndValves, navAndComSys, safetyEquipment));
}
class Sailboat implements Boat{
    BoatPart hull = new BoatPart("Hull","$5,000 to $30,000");
    BoatPart mastAndRigging = new BoatPart("Mast and rigging","");
    BoatPart sails = new BoatPart("Sails","$10,000 to $15,000");
    BoatPart keel = new BoatPart("Keel","$10,000 to $15,000");
    BoatPart steeringSystem = new BoatPart("Steering system","$2,000 to $5,000");
    BoatPart electricalSystem = new BoatPart("Electrical system","$2,000 to $5,000");
    BoatPart interiorFurnishings = new BoatPart("Interior furnishings","$1,000 to $3,000");
    BoatPart safetyEquipment = new BoatPart("Safety equipment","$1,000 to $3,000");
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, mastAndRigging, sails,
            keel, steeringSystem, electricalSystem, interiorFurnishings, safetyEquipment));

}
class Cruiseship implements Boat {
    BoatPart hull = new BoatPart("Hull", "$300 million to $1 billion or more");
    BoatPart engines = new BoatPart("Engines", "$100 million or more");
    BoatPart propellers = new BoatPart("Propellers", "$5 million to $20 million or more");
    BoatPart accommodations = new BoatPart("Accommodations", "$50,000 to $100,000 or more per suite");
    BoatPart diningAndEntertainmentFacilities = new BoatPart("Dining and entertainment facilities", "$2 million to $5 million or more per facility");
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "$10 million to $20 million or more");
    BoatPart navigationAndCommunicationSystems = new BoatPart("Navigation and communication systems", "$50 million or more");
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, engines, propellers,
            accommodations, diningAndEntertainmentFacilities, safetyEquipment, navigationAndCommunicationSystems));
}
class Fishingvessel implements Boat{
    BoatPart hull = new BoatPart("Hull","$50,000 to $200,000");
    BoatPart engine = new BoatPart("Engine","$50,000 to $100,000 or more");
    BoatPart fishingGearAndEquipment = new BoatPart("Fishing gear and equipment","$10,000 to $50,000 or more");
    BoatPart navigationAndCommunicationSystems = new BoatPart("Navigation and communication systems","$5,000 to $20,000 or more");
    BoatPart deckMachineryAndEquipment = new BoatPart("Deck machinery and equipment","$10,000 to $50,000 or more");
    BoatPart safetyEquipment = new BoatPart("Safety equipment","$5,000 to $20,000 or more");
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, engine, fishingGearAndEquipment,
            navigationAndCommunicationSystems, deckMachineryAndEquipment, safetyEquipment));
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Sailboat sailboat = new Sailboat();
        Vragenlijst vragenlijst = new Vragenlijst();
        vragenlijst.prompt(sailboat.boatParts);
    }

}