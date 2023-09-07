package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<Event> events = new ArrayList<>();

    @GetMapping
    public String events(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
        return "events/index";
    }

    //lives at /events/create
    @GetMapping("create")
    public String displayCreateEventForm( Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    //lives at /events/create
    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName) {
       events.add(new Event(eventName));
       return "redirect:";
    }

//@RequestParam String eventName is the parameter that is passed in from user input
    //we then use eventName to add it to events list by creating an instance of the Event model class
    //so every eventName will be an object of Event.
    //List<Event> means it will be a list of object type Event that we created.
    }
