public enum RoomType {
    BATHROOM("fürdő"),
    KITCHEN("konyha"),
    SEXROOM("baszoba"),
    BEDROOM("hálószoba"),
    LIVINGROOM("nagyszoba"),
    MYROOM("no-go-zone"),
    PANTRY("speiz"),
    PROGMATIC("suli");

    public final String hunname;

    RoomType (String hunname){
        this.hunname = hunname;
    }

    public String getHunname(){
        return hunname;
    }
}
