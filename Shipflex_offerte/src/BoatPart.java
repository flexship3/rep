public class BoatPart {
    private String name;
    private int price;
    private String info;
    private String extraInfo;
    public BoatPart(String name, String info) {
        this.name = name;
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
    public String getExtraInfo(){return extraInfo;}}
