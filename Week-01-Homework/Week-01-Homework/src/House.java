public class House {

    private String type;
    private int area;
    private int price;
    private int roomCount;
    private int livingRoomCount;

    public House(String type, int area, int price, int roomCount, int livingRoomCount) {
        this.type = type;
        this.area = area;
        this.price = price;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }

    public String getType() {
        return type;
    }

    public int getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

}
