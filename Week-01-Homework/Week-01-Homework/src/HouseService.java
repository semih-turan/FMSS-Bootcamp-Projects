import java.util.ArrayList;
import java.util.List;

public class HouseService {
    private List<House> houses;

    public HouseService(List<House> houses) {
        this.houses = houses;
    }

    public int getTotalPriceByType(String type) {
        int totalPrice = 0;
        for (House house : houses) {
            if (house.getType().equals(type)) {
                totalPrice += house.getPrice();
            }
        }
        return totalPrice;
    }

    public double getAverageAreaByType(String type) {
        int totalArea = 0;
        int houseCount = 0;
        for (House house : houses) {
            if (house.getType().equals(type)) {
                totalArea += house.getArea();
                houseCount++;
            }
        }
        if (houseCount == 0) return 0;
        return (double) totalArea / houseCount;
    }

    public List<House> filterByRoomAndLivingRoom(int roomCount, int livingRoomCount) {
        List<House> filteredHouses = new ArrayList<>();
        for (House house : houses) {
            if (house.getRoomCount() == roomCount && house.getLivingRoomCount() == livingRoomCount) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }
}
