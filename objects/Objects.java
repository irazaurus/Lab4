package objects;

import others.Place;

public class Objects extends AbstractObject {
    private final String name;
    private Place place;

    public Objects(String name, Place place){
        this.name = name;
        this.place = place;
    }

    public Objects(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Place getPlace(){
        return this.place;
    }

    public String WhenBump(Objects objects){
        Place place = objects.getPlace();
        return "Когда " + name + " врезалась в " + objects.getName() + " " + place.getName();
    }

    public String Rise(){
        Place place = this.getPlace();
        return place.getName() + " взошла " + name;
    }

    @Override
    public String toString(){
        Place place = getPlace();
        return "Objects: " +
                "name = " + name + ", "+
                "place = " + place.getName();
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

    @Override
    public boolean equals(Object objects){
        if (this == objects) return true;
        if (objects == null || getClass() != objects.getClass()) return false;
        AbstractObject abstractObject = (AbstractObject) objects;
        return java.util.Objects.equals(this.name, abstractObject);
    }
}