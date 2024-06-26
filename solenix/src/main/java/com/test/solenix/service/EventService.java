package com.test.solenix.service;

import com.test.solenix.dto.EventDto;
import com.test.solenix.entity.Event;

import java.util.List;

public interface EventService {

    Event createEvent(EventDto event);
    List<EventDto> getAllEvents();
    List<EventDto> getEventsBySatellite(String satelliteName);
}
