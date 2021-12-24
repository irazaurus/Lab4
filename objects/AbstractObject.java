package objects;

import others.Place;

public abstract class AbstractObject implements InterfaceObject {
    private String name;
    private Place place;

    public String getName() {
        return name;
    }

    public Place setPlace(Place place){
        return place;
    }

    @Override
    public String setNear(Objects objects){
        return this.name + " находится возле " + objects.getName();
    }
}