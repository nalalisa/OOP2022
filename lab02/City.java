package lab02;

public class City {
    private String name;
    private int locationX;
    private int locationY;

    public City(String name, int X, int Y) {
        this.name = name;
        this.locationX = X;
        this.locationY = Y;
    }

    public City(String name) {
        this.name = name;
        this.locationX = (int) (Math.random() * 360);
        this.locationY = (int) (Math.random() * 360);
    }

    public String getName() {
        return this.name;
    }

    public int getLocationX() {
        return this.locationX;
    }

    public int getLocationY() {
        return this.locationY;
    }

    public boolean equals(City city) {
        return this.name.equals(city.name) && this.locationX == city.locationX && this.locationY == city.locationY;
    }

    public String toString() {
        return this.name + ", " + this.locationX + ", " + this.locationY;
    }

    public static double distance(City city1, City city2) {
        return Math.sqrt(
                Math.pow((city1.locationX - city2.locationX), 2) + Math.pow((city1.locationY - city2.locationY), 2));
    }
}
