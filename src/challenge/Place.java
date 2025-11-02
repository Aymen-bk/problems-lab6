package challenge;

public class Place {
    private String name;
    private int distance;

    public Place(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {return name;}

    public int getDistance() {return distance;}

    public String toString() {return name + " (" + distance + " km)";}

}
