interface Klant {
    void Klanten(String name, String address, String order);

}

abstract class Klanten implements Klant {
    String name;
    String address;
    String order; //Wss object, ff kijken hoe en wat
    public Klanten(String name, String address, String order) {
        this.name = name;
        this.address = address;
        this.order = order;
    }
}
abstract class Korting implements Klant {
    String name;
    String address;
    String order; //Wss object, ff kijken hoe en wat
    int korting;
    public void Klanten(String name, String address, String order) {
        this.name = name;
        this.address = address;
        this.order = order;
    }

    public int berekendeKorting(int korting) {
        return (100 - korting) / 100;
    }
}
