import java.util.ArrayList;

public class Room {


    private int numberOfWindows;
    private double height;
    private double width;
    private double length;
    private RoomType roomType;



    private ArrayList<Forniture> fornitures;




    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }


    public ArrayList<Forniture> getFörnicsörs() {
        return fornitures;
    }

    public void setFörnicsörs(ArrayList<Forniture> fornitures) {
        this.fornitures = fornitures;
    }
    public double getArea() {

        return width * length;
    }
    public boolean isThereAnyWindow (){
        if (numberOfWindows>0){

            return true;
        }
        return false;
    }

    public Room(int numberOfWindows, double height, double width, double length, RoomType roomType) {
        this.numberOfWindows = numberOfWindows;
        this.height = height;
        this.width = width;
        this.length = length;
        this.roomType = roomType;
    }

    public boolean butorBeferE(double butorMagassag) {
        return height > (butorMagassag + 2);
    }



        @Override
    public String toString() {
        return String.format("%s (%s) - %d db ablaka van - %.1f negyzetmeter ( %.1f m  x  %.1f m )\n" +
                        "%d -db bútor van benne, és ilyen ilyen típusú: %s ",
                this.roomType,this.roomType.getHunname().toUpperCase(), this.numberOfWindows,
                this.getArea(), length, width, fornitures.size(),getFörnicsörs());
    }
}



