public class BoatPart {
    private String name;
    private int price;
    private String info;
    private String extraInfo;
    public BoatPart(String name, String info, String extraInfo) {
        this.name = name;
        this.info = info;
        this.extraInfo = extraInfo;
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
