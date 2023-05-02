public enum SolarSystemPlanet {
    MERCURY(1, 0, 0.39, 2439.7, null),
    VENUS(2, 0.72, 0.72, 6051.8, MERCURY),
    EARTH(3, 1, 1, 6371, VENUS),
    MARS(4, 1.52, 1.52, 3389.5, EARTH),
    JUPITER(5, 5.2, 5.20, 69911, MARS),
    SATURN(6, 9.58, 9.54, 58232, JUPITER),
    URANUS(7, 19.18, 19.18, 25362, SATURN),
    NEPTUNE(8, 30.07, 30.07, 24622, URANUS);

    private final int positionFromSun;
    private final double distanceFromPrev;
    private final double distanceFromSun;
    private final double radius;
    private final SolarSystemPlanet prevPlanet;

    SolarSystemPlanet(int positionFromSun, double distanceFromPrev, double distanceFromSun,
                      double radius, SolarSystemPlanet prevPlanet) {
        this.positionFromSun = positionFromSun;
        this.distanceFromPrev = distanceFromPrev;
        this.distanceFromSun = prevPlanet == null ? distanceFromSun : prevPlanet.getDistanceFromSun() + distanceFromPrev;
        this.radius = radius;
        this.prevPlanet = prevPlanet;
    }

    public int getPositionFromSun() {
        return positionFromSun;
    }

    public double getDistanceFromPrev() {
        return distanceFromPrev;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public SolarSystemPlanet getPrevPlanet() {
        return prevPlanet;
    }

    public static void printPlanetInfo(SolarSystemPlanet planet) {
        System.out.println("Name: " + planet.name());
        System.out.println("Position from Sun: " + planet.getPositionFromSun());
        System.out.println("Distance from Sun: " + planet.getDistanceFromSun() + " AU");
        System.out.println("Radius: " + planet.getRadius() + " km");
        if (planet.getPrevPlanet() != null) {
            System.out.println("Distance from previous planet: " + planet.getDistanceFromPrev() + " AU");
            System.out.println("Previous planet: " + planet.getPrevPlanet().name());
        }
        System.out.println(VENUS);
    }
}
