import java.util.ArrayList;
import java.util.Arrays;

interface Boat{}
class Speedboat implements Boat{
    BoatPart hull = new BoatPart("Hull", "" );
    BoatPart outboardMotor = new BoatPart("Outboard Motor", "" );
    BoatPart fuelTank = new BoatPart("Fuel Tank", "" );
    BoatPart steeringSystem = new BoatPart("Steering system", "" );
    BoatPart electricalSystem = new BoatPart("Electrical system", "" );
    BoatPart upholstery = new BoatPart("Upholstery", "" );
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "" );
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, outboardMotor, fuelTank, steeringSystem,
            electricalSystem, upholstery,safetyEquipment));
}
class Oiltanker implements Boat{
    BoatPart hull = new BoatPart("Hull", "");
    BoatPart engines = new BoatPart("Engines", "");
    BoatPart propulsionSystem = new BoatPart("Propulsion system", "");
    BoatPart cargoTanks = new BoatPart("Cargo tanks", "");
    BoatPart pumpsAndValves = new BoatPart("Pumps and valves", "");
    BoatPart navAndComSys = new BoatPart("Navigation and communication system", "");
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "");
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, engines, propulsionSystem,
            cargoTanks, pumpsAndValves, navAndComSys, safetyEquipment));
}
class Sailboat implements Boat{
    BoatPart hull = new BoatPart("Hull","");
    BoatPart mastAndRigging = new BoatPart("Mast and rigging","");
    BoatPart sails = new BoatPart("Sails","");
    BoatPart keel = new BoatPart("Keel","");
    BoatPart steeringSystem = new BoatPart("Steering system","");
    BoatPart electricalSystem = new BoatPart("Electrical system","");
    BoatPart interiorFurnishings = new BoatPart("Interior furnishings","");
    BoatPart safetyEquipment = new BoatPart("Safety equipment","");
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, mastAndRigging, sails,
            keel, steeringSystem, electricalSystem, interiorFurnishings, safetyEquipment));

}
class Cruiseship implements Boat {
    BoatPart hull = new BoatPart("Hull", "");
    BoatPart engines = new BoatPart("Engines", "");
    BoatPart propellers = new BoatPart("Propellers", "");
    BoatPart accommodations = new BoatPart("Accommodations", "");
    BoatPart diningAndEntertainmentFacilities = new BoatPart("Dining and entertainment facilities", "");
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "");
    BoatPart navigationAndCommunicationSystems = new BoatPart("Navigation and communication systems", "");
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, engines, propellers,
            accommodations, diningAndEntertainmentFacilities, safetyEquipment, navigationAndCommunicationSystems));
}
class Fishingvessel implements Boat{
    BoatPart hull = new BoatPart("Hull","");
    BoatPart engine = new BoatPart("Engine","");
    BoatPart fishingGearAndEquipment = new BoatPart("Fishing gear and equipment","");
    BoatPart navigationAndCommunicationSystems = new BoatPart("Navigation and communication systems","");
    BoatPart deckMachineryAndEquipment = new BoatPart("Deck machinery and equipment","");
    BoatPart safetyEquipment = new BoatPart("Safety equipment","");
    ArrayList<BoatPart> boatParts = new ArrayList<BoatPart>(Arrays.asList(hull, engine, fishingGearAndEquipment,
            navigationAndCommunicationSystems, deckMachineryAndEquipment, safetyEquipment));
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }

}