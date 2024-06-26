package com.test.solenix.controller;

import com.test.solenix.dto.EventDto;
import com.test.solenix.entity.Event;
import com.test.solenix.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/restfulservice")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public List<EventDto> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/events/{satelliteName}")
    public List<EventDto> getEventsBySatellite(@PathVariable String satelliteName) {
        return eventService.getEventsBySatellite(satelliteName);
    }

    @PostMapping("/events")
    public Event createEvent(@RequestBody EventDto eventDto) {
        return eventService.createEvent(eventDto);
    }
}
