import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

    static class Hotel {
        Integer id;
        String name;

        Hotel(Integer id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    static class Room {

        Room(Integer id, String name, String type, Integer hotelId) {
            this.id = id;
            this.name = name;
            this.type = type;
            this.hotelId = hotelId;
        }

        Integer id;
        String name;
        String type;
        Integer hotelId;
    }

    /* Use the debugger to see the map values */
    public static void main(String[] args) {
        List<Hotel> hotels = new ArrayList<>();

        Hotel h1 = new Hotel(1, "Reveka");
        Hotel h2 = new Hotel(2, "Mike");
        Hotel h3 = new Hotel(3, "Spiti");

        hotels.add(h1);
        hotels.add(h2);
        hotels.add(h3);


        List<Room> rooms = new ArrayList<>();

        Room r1 = new Room(1, "R1", "Double", 1);
        Room r2 = new Room(2, "R2", "Double", 1);
        Room r3 = new Room(3, "R3", "Triple", 2);
        Room r4 = new Room(4, "R4", "Double", 2);
        Room r5 = new Room(5, "R5", "Suite", 3);

        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);
        rooms.add(r5);

        Map<Integer, List<Room>> map1 = rooms.stream().collect(Collectors.groupingBy(a -> a.hotelId));

        Map<Hotel, List<Room>> map2 = map1.entrySet().stream().collect(Collectors.toMap(
                e -> hotels.stream().filter(h -> h.id.equals(e.getKey())).findFirst().orElse(null),
                Map.Entry::getValue
        ));

        System.out.println(map2.size());
    }
}
