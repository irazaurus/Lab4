package persons;

import others.Place;
import others.Feeling;

import java.util.Objects;

public abstract class AbstractPerson implements InterfacePerson {
    private final String name;
    private Feeling feel;
    private Place place;

    protected AbstractPerson(String name) {
        this.name = name;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        AbstractPerson abstractPerson = (AbstractPerson) object;
        return Objects.equals(name, abstractPerson.name);
    }

    @Override
    public String toString(){
        return "Persons: " +
                "name = " + name;
    }

    public String getName(){
        return this.name;
    }

    public void setFeel(Feeling feel){
        this.feel = feel;
    }

    public Feeling getFeel(){
        return this.feel;
    }

    public Place getPlace(){
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String walk(Place place){
        return this.name + " перемещается в " + place.getName();
    }
}