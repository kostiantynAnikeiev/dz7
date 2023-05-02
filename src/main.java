

public class main {
    public static void main(String[] args) {
        SolarSystemPlanet[] planets = SolarSystemPlanet.values();

        for (SolarSystemPlanet planet : planets) {
            SolarSystemPlanet.printPlanetInfo(planet);
        }
    }
}