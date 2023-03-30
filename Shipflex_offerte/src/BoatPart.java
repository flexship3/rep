public class BoatPart {
    private String name;
    private int price;
    private String info;
    public BoatPart(String name, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getInfo() {
        return info;
    }
}
