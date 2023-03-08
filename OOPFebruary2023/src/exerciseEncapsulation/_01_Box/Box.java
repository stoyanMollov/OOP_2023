package _01_Box;

public class Box {
    private double length ;
    private double width;
    private  double height;

    public Box(double length, double width, double height) {
        setHeight(height);
        setLength(length);
        setWidth(width);
    }

    private void setHeight(double height) {
        validation(height,"Height");
        this.height = height;
    }

    private void setLength(double length) {
        validation(length,"Length");
        this.length = length;
    }

    private void setWidth(double width) {
        validation(width,"Width");
        this.width = width;
    }

   private void validation(double parameters, String text){
        if ( parameters <= 0 ){
            throw new IllegalArgumentException(text + " cannot be zero or negative.");
        }
    }
    public double calculateSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;

    }

    public double calculateLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;

    }

    public double calculateVolume() {
        return width * height * length;

    }
}
