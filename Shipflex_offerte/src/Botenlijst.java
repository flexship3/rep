import java.util.ArrayList;
import java.util.Arrays;

public class Botenlijst {
    Speedboat speedboat = new Speedboat();
    Oiltanker oiltanker = new Oiltanker();
    Sailboat sailboat = new Sailboat();
    Cruiseship cruiseship = new Cruiseship();
    Fishingvessel fishingvessel = new Fishingvessel();
    final public ArrayList<Boat> botenlijst = new ArrayList<>(Arrays.asList(speedboat,oiltanker,sailboat,cruiseship,fishingvessel));
}
