package org.launchcode.codingevents.models;

import java.util.Objects;

public class Event {

    //adding a unique identifier in order to remove events
    // a unique identifier will id the object that is stored to make sure we remove the object

    private int id;

    // nextId
    // static is used in int nextId to update the number with each object created
    // nextId is shared by all class instances
    //nextId++ adds 1 to id when an object is created
    private static int nextId = 1;

    private String name;
    private String description;



    public Event(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
