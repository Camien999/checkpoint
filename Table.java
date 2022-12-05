public class Table extends Forniture {

    String material;

    public Table(double height, double lenght, double width, Color color, String material) {
        super(height, lenght, width, color);

        this.material = material;
    }
}
