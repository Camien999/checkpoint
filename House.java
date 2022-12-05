import java.util.ArrayList;
import java.util.List;

public class House {

    private List<Room> rooms = new ArrayList<>();



    public int numberOfBigRooms() {
        int counter = 0;
        double minimumArea = 10.0;
        for (int i = 0; i < rooms.size(); i++) {
            if (minimumArea <= rooms.get(i).getArea()) {
                counter++;
            }
        }
        return counter;
    }

    public Integer howManyWindowsAreTHere (){
        int windowcounter =  0;
        for (int i = 0; i < rooms.size(); i++) {
            windowcounter +=rooms.get(i).getNumberOfWindows();
       }
        return windowcounter;
    }


    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }
}


