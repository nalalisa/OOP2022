package lab02;

public class CityTest {
    public static void main(String[] args) {
        City Seoul = new City("Seoul", 23, 45);
        City Paris = new City("Paris", 123, 41);
        City RacoonCity = new City("Racoon City");
        City MegaCity = new City("Mega City");

        System.out.println(Seoul.toString());
        System.out.println(Paris.toString());
        System.out.println(RacoonCity.toString());
        System.out.println(MegaCity.toString());

        System.out.println(Seoul.getName() + "-" + Paris.getName() + " : " + City.distance(Seoul, Paris));
        System.out.println(Seoul.getName() + "-" + RacoonCity.getName() + " : " + City.distance(Seoul, RacoonCity));
        System.out.println(Paris.getName() + "-" + MegaCity.getName() + " : " + City.distance(Paris, MegaCity));
    }
}
