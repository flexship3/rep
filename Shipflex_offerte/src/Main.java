interface Boat{}
class Speedboat implements Boat{
    BoatPart hull = new BoatPart("Hull", "" );
    BoatPart outboardMotor = new BoatPart("Outboard Motor", "" );
    BoatPart fuelTank = new BoatPart("Fuel Tank", "" );
    BoatPart steeringSystem = new BoatPart("Steering system", "" );
    BoatPart electricalSystem = new BoatPart("Electrical system", "" );
    BoatPart upholstery = new BoatPart("Upholstery", "" );
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "" );
}
class Oiltanker implements Boat{
    BoatPart hull = new BoatPart("Hull", "");
    BoatPart engines = new BoatPart("Engines", "");
    BoatPart propulsionSystem = new BoatPart("Propulsion system", "");
    BoatPart cargoTanks = new BoatPart("Cargo tanks", "");
    BoatPart pumpsAndValves = new BoatPart("Pumps and valves", "");
    BoatPart navAndComSys = new BoatPart("Navigation and communication system", "");
    BoatPart safetyEquipment = new BoatPart("Safety equipment", "");
}
class Sailboat implements Boat{}
class Cruiseship implements Boat{}
class Fishingvessel implements Boat{}


public class Main {
    public static void main(String[] args) {
        System.out.println("Kut project");
    }

}