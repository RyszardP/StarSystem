import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SunSystem {


    public static void main(String[] args) {

        StarSystem starSystem = new StarSystem("Солнечная");

        ArrayList<String>starList = new ArrayList<String>();

        starList.add("Moon");

        StarSystem.addPlanet(new Planet("EaRTH"));
        StarSystem.addPlanet(new Planet("Mars"));

        StarSystem.addSatellite(new Satellite("moon"));


        System.out.println(" Имя системы:" + StarSystem.getName()) ;


        System.out.println(" Имена спутников" + StarSystem.getSatelliteList());


        System.out.println(" Имя планеты" + StarSystem.getPlanetList());

        for (int i = 0; i < StarSystem.planetList.size(); i++)
            System.out.println(StarSystem.planetList.get(i));
        System.out.println();
    }
}
