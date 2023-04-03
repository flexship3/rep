class Klanten {
    String name;
    String address;
    String order; //Wss object, ff kijken hoe en wat
    public Klanten(String name, String address, String order) {
        this.name = name;
        this.address = address;
        this.order = order;
    }
}
class Korting extends Klanten {
    public Korting(String name, String address, String order) {
        super(name, address, order);
    }

    public int berekendeKorting(int korting) {
        return (100 - korting) / 100;
    }
}
