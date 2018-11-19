

import java.util.ArrayList;
import java.util.List;

public class StarSystem {

    private static String name;

    private static List<Star> starList = new ArrayList<>();
    public static List<Planet> planetList = new ArrayList<>();
    public static List<Satellite> satelliteList = new ArrayList<>();

    public StarSystem(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public List<Star> getStarList() {
        return starList;
    }

    public static List<Planet> getPlanetList() {
        return planetList;
    }

    public static List<Satellite> getSatelliteList() {
        return satelliteList;
    }

    public void addStar(Star star) {
        starList.add(star);

    }

    public void setName(String name) {
        this.name = name;
    }

    public static void addPlanet(Planet planet){
        planetList.add(planet);
    }

    public static void addSatellite(Satellite satellite){
        satelliteList.add(satellite);
    }

}
