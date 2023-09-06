package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// this is a static class because there are only static members/fields
// do not need to make an object with this class in order to use methods inside of it
// EventData.add()

public class EventData {

    // need a place to put events
    private static final Map<Integer, Event> events = new HashMap<>();

    // get all events
    public static Collection<Event> getAll() {
        return events.values();
    }


    // get a single event
    public static Event getById(int id) {
        return events.get(id);
    }

    // add an event
    public static void add(Event event) {
        events.put(event.getId(), event);

    }

    // remove an event
    public static void remove(int id) {
        events.remove(id);
    }



}
