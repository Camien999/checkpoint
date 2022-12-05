import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        House house1 = new House();
        Room progmatic = new Room(3, 3, 11.3, 24.3, RoomType.PROGMATIC);
        Room bathroom = new Room(1, 3, 2.4, 3.3, RoomType.BATHROOM);
        Room sexroom = new Room(2, 4, 10, 4.6, RoomType.SEXROOM);
        Room livingroom = new Room(5, 3.2, 11.3, 6.7, RoomType.LIVINGROOM);

        house1.addRoom(progmatic);
        house1.addRoom(bathroom);
        house1.addRoom(sexroom);
        house1.addRoom(livingroom);

        Table asztal = new Table(2, 3, 3, Color.GREY, "oak");
        Chair szek = new Chair(33, 2, 3.5, Color.YELLOW, "pokemon");


        ArrayList<Forniture> fornituresInProgmatic = new ArrayList<>();
        fornituresInProgmatic.add(asztal);
        fornituresInProgmatic.add(szek);

        progmatic.setFörnicsörs(fornituresInProgmatic);

        System.out.println(progmatic);

        /*  System.out.println();
        System.out.println();

        System.out.println("Befér a szekrény? : " + progmatic.butorBeferE(2.4));

         System.out.println(progmatic.getArea());

         System.out.println("Van egyáltalán ablak ? " + progmatic.isThereAnyWindow());
         System.out.println();
         System.out.println("10 m2 -nél nagyobb szobik: " + house1.numberOfBigRooms());
         System.out.println("Ennyi ablak van : " + house1.howManyWindowsAreTHere());

         System.out.println(fornituresInProgmatic.size());

         */

    }
}
