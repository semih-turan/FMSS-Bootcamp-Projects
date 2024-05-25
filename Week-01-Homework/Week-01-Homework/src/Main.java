import java.util.ArrayList;
import java.util.List;

/**
 * @author Semih Turan
 * @since May 2024
 */
public class Main {
    public static void main(String[] args) {
        List<House> houses = new ArrayList<>();
        houses.add(new House("House", 150, 200000,5,3));
        houses.add(new House("Villa", 300, 500000,4,1));
        houses.add(new House("Yazlık", 200, 300000,3,1));
        houses.add(new House("House", 120, 1800001,2,1));
        houses.add(new House("Villa", 350, 600000,4,2));
        houses.add(new House("Yazlık", 180, 250000,3,1));

        HouseService houseService = new HouseService(houses);

        System.out.println("Total price of houses: " + houseService.getTotalPriceByType("House"));
        System.out.println("Total price of villas: " + houseService.getTotalPriceByType("Villa"));
        System.out.println("Total price of yazlıks: " + houseService.getTotalPriceByType("Yazlık"));
        System.out.println("Total price of all houses: " +
                (houseService.getTotalPriceByType("House") + houseService.getTotalPriceByType("Villa") + houseService.getTotalPriceByType("Yazlık")));

        System.out.println("Average area of houses: " + houseService.getAverageAreaByType("House"));
        System.out.println("Average area of villas: " + houseService.getAverageAreaByType("Villa"));
        System.out.println("Average area of yazlıks: " + houseService.getAverageAreaByType("Yazlık"));
        System.out.println("Average area of all houses: " +
                ((houseService.getAverageAreaByType("House") + houseService.getAverageAreaByType("Villa") + houseService.getAverageAreaByType("Yazlık")) / 3));

        System.out.println("Houses with 3 rooms and 2 living rooms: " +
                houseService.filterByRoomAndLivingRoom(3, 2));
    }
}